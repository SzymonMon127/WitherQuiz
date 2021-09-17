package com.sm.witherquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.facebook.AccessToken;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;
import com.sm.witherquiz.Login.SignInActivity;
import com.sm.witherquiz.ObjectAndAdapters.Person;
import com.sm.witherquiz.QuizCattegory.BookCattegoryActivity;
import com.stripe.android.ApiResultCallback;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.PaymentIntentResult;
import com.stripe.android.Stripe;
import com.stripe.android.databinding.CardInputWidgetBinding;
import com.stripe.android.model.Card;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.view.CardInputWidget;


import org.apache.commons.lang3.StringUtils;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import cz.msebera.android.httpclient.Header;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpPost;
import cz.msebera.android.httpclient.client.methods.RequestBuilder;
import cz.msebera.android.httpclient.entity.StringEntity;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;
import okhttp3.Request;



public class CheckoutActivity extends AppCompatActivity {
    // ...
    public String paymentIntentClientSecret;
    private Stripe stripe;

    private AdView mAdView;
    private int LeaguePoints;
    private int RealLeaguePoints;
    private String Division;
    private int imageId;
    private int hp;
    private FirebaseDatabase firebaseDatabase;
    private RewardedAd mRewardedAd;
    private int LpDeff;
    private int LpBoost;
    private int DbVersion;
    private FirebaseAuth firebaseAuth;
    private int Connection;

    private String id;
    private String userName;
    private String FirebaseEmail;
    private String  idNumber;


    public static final String ammount = "ammount";
    public static final String ammountId = "ammountId";

    private String Currency;
    private int CurrencyId;

    private String ammountInfo;
    private String shopInfo;

    private TextView shopInfoTextView;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);


        firebaseDatabase = FirebaseDatabase.getInstance();

        if (firebaseAuth.getInstance().getCurrentUser() != null) {

            getNameAndId();

            ReadOrInitFromFirebase();
        }
        else
        {
            goToLogin();

        }



        Currency = (String) getIntent().getExtras().get(ammount);
        CurrencyId = (Integer) getIntent().getExtras().get(ammountId);

        int CurrencyPLNInt = Integer.parseInt(Currency);
        CurrencyPLNInt = CurrencyPLNInt/100;
        ammountInfo = String.valueOf(CurrencyPLNInt);

        PaymentConfiguration.init(
                getApplicationContext(),
                "pk_live_51IMxdVHGuJwlUss3RtcPs39Qm8Zx8k8ItCy90hxuXGOCsxtIE5l8roAnTbr4BLuje1mVcAvrrnKOhcW0GiayWf0P007bCTvYKs"
        );

        startCheckout();

        ProdcutInfo();

    }


    private void startCheckout() {
        // ...
        // Hook up the pay button to the card widget and stripe instance
        Button payButton = findViewById(R.id.payButton);
        CardInputWidget cardInputWidget = findViewById(R.id.cardInputWidget);


        try {
            AsyncHttpClient client = new AsyncHttpClient();
            // Http Request Params Object
//            RequestParams params = new RequestParams();
            // String mob = "880xxxxxxxxxx";
//              params.put("currency", "pln");
//              params.put("amount", 1300);
//              Log.i("d","parmsa"+ params);
            client.post("https://stripe-payment-simon-mon.herokuapp.com/create-payment-intent?amount="+Currency+"&currency=pln", new AsyncHttpResponseHandler() {

                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {

                    paymentIntentClientSecret = new String(responseBody, StandardCharsets.UTF_8);
                    Log.d("dd", "Response SP Status. " + statusCode + paymentIntentClientSecret);

                }

                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    displayAlert("Płatność", "Płatność nie została zrealizowana. \n" + "Przepraszam za problem techniczny.");
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        payButton.setOnClickListener((View view) -> {
            PaymentMethodCreateParams params = cardInputWidget.getPaymentMethodCreateParams();
            if (params != null) {
                ConfirmPaymentIntentParams confirmParams = ConfirmPaymentIntentParams
                        .createWithPaymentMethodCreateParams(params, paymentIntentClientSecret);
                final Context context = getApplicationContext();
                stripe = new Stripe(
                        context,
                        PaymentConfiguration.getInstance(context).getPublishableKey()
                );
                stripe.confirmPayment(this, confirmParams);
            }
        });
    }



    // ...
    

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Handle the result of stripe.confirmPayment
        stripe.onPaymentResult(requestCode, data, new PaymentResultCallback(this));
    }

    // ...

    private static final class PaymentResultCallback
            implements ApiResultCallback<PaymentIntentResult> {
        @NonNull
        private final WeakReference<CheckoutActivity> activityRef;

        PaymentResultCallback(@NonNull CheckoutActivity activity) {
            activityRef = new WeakReference<>(activity);
        }

        @Override
        public void onSuccess(@NonNull PaymentIntentResult result) {
            final CheckoutActivity activity = activityRef.get();
            if (activity == null) {
                return;
            }

            PaymentIntent paymentIntent = result.getIntent();
            PaymentIntent.Status status = paymentIntent.getStatus();
            if (status == PaymentIntent.Status.Succeeded) {
                // Payment completed successfully
                activityRef.get().displayAlert("Płatność", "Płatność została zrealizowana pomyślnie.");
                activity.takeReward();
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                Log.v(
                        "Payment completed",
                        gson.toJson(paymentIntent)
                );



            } else if (status == PaymentIntent.Status.RequiresPaymentMethod) {
                activityRef.get().displayAlert("Płatność", "Płatność nie została zrealizowana. \n" + "Przepraszam za problem techniczny.");
                // Payment failed
                Log.v(
                        "Payment failed",
                        Objects.requireNonNull(paymentIntent.getLastPaymentError()).getMessage()
                );
            }
        }

        @Override
        public void onError(@NonNull Exception e) {
            final CheckoutActivity activity = activityRef.get();
            if (activity == null) {
                activityRef.get().displayAlert("Płatność", "Płatność nie została zrealizowana. \n" + "Przepraszam za problem techniczny.");
                return;
            }

            // Payment request failed – allow retrying using the same payment method
            Log.v("Error", e.toString());
        }
    }

    private void Add50Hp() {

        hp = hp + 50;
        saveHpAndBoosts();

    }

    private void Add150Hp() {

        hp = hp + 150;
        saveHpAndBoosts();

    }

    private void AddFullhp() {

        hp = hp + 99999;
        saveHpAndBoosts();


    }

    private void Add10LpBoost() {

        LpBoost = LpBoost + 10;
        saveHpAndBoosts();

    }

    private void Add25LpBoost() {

        LpBoost = LpBoost + 25;
        saveHpAndBoosts();

    }

    private void Add10LpDeff() {

        LpDeff = LpDeff + 10;
        saveHpAndBoosts();

    }

    private void Add25LpDeff() {

        LpDeff = LpDeff + 25;
        saveHpAndBoosts();

    }

    private void getNameAndId()
    {

        if (AccessToken.getCurrentAccessToken() != null)
        {
            FirebaseEmail = firebaseAuth.getInstance().getCurrentUser().getDisplayName();
            userName = StringUtils.substringBefore(FirebaseEmail, "@");
            userName = userName.replace(".", "");


        }
        else
        {
            FirebaseEmail = firebaseAuth.getInstance().getCurrentUser().getEmail();
            userName = StringUtils.substringBefore(FirebaseEmail, "@");
            userName = userName.replace(".", "");
        }

        idNumber = firebaseAuth.getInstance().getCurrentUser().getUid();
        id =userName + idNumber;

    }

    private void ReadOrInitFromFirebase() {

        try {
            firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                    if ((int) dataSnapshot.getChildrenCount() != 0) {
                        Person newPerson = dataSnapshot.getValue(Person.class);
                        RealLeaguePoints = newPerson.RealLeaguePoints;
                        LeaguePoints = newPerson.LeaguePoints;
                        imageId = newPerson.imageId;
                        Division = newPerson.Division;
                        Connection = newPerson.Connection;
                        hp = newPerson.hp;
                        LpDeff = newPerson.LpDeff;
                        LpBoost = newPerson.LpBoost;

                        saveHpAndBoosts();
                    }

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(this, "Probłem z połączeniem z bazą danych", Toast.LENGTH_SHORT).show();
        }



    }

    private void saveHpAndBoosts() {
        firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                Person person = new Person(userName, imageId, Division, LeaguePoints, RealLeaguePoints, hp, LpDeff, LpBoost, Connection,idNumber);
                firebaseDatabase.getReference().child("users").child(id).setValue(person);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });
    }

    private void goToLogin() {

        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    private void takeReward() {
        if (CurrencyId ==1)
        {
            Add50Hp();
        }
        else if (CurrencyId ==2)
        {
            Add150Hp();
        }
        else if (CurrencyId ==3)
        {
            AddFullhp();
        }
        else if (CurrencyId ==4)
        {
            Add10LpBoost();
        }
        else if (CurrencyId ==5)
        {
            Add25LpBoost();
        }
        else if (CurrencyId ==6)
        {
            Add10LpDeff();
        }
        else if (CurrencyId ==7)
        {
            Add25LpDeff();
        }
    }

    private void ProdcutInfo()
    {
        shopInfoTextView = (TextView) findViewById(R.id.PriceInfo);

        if (CurrencyId ==1)
        {
            shopInfo = "50 wigoru";
        }
        else if (CurrencyId ==2)
        {
            shopInfo = "150 wigoru";
        }
        else if (CurrencyId ==3)
        {
            shopInfo = "99999 wigoru";
        }
        else if (CurrencyId ==4)
        {
            shopInfo = "Boost pkt. - 10 gier";
        }
        else if (CurrencyId ==5)
        {
            shopInfo = "Boost pkt. - 25 gier";
        }
        else if (CurrencyId ==6)
        {
            shopInfo = "Ochrona pkt. - 10 gier";
        }
        else if (CurrencyId ==7)
        {
            shopInfo = "Ochrona pkt. - 25 gier";
        }

        shopInfoTextView.setText("Cena: " + ammountInfo + " PLN \n" + shopInfo);

    }

    private void displayAlert(@NonNull String title,
                              @Nullable String message) {
        Activity activity = this;
        runOnUiThread(() -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity)
                    .setTitle(title)
                    .setMessage(message);

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(CheckoutActivity.this, MainActivity.class);
                                startActivity(intent);
                    }
                });


            builder.create().show();
        });
    }

}