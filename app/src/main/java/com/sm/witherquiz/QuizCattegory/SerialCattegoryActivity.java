package com.sm.witherquiz.QuizCattegory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.Menu.NewQuestionsActivity;
import com.sm.witherquiz.Menu.PrivatePolicyURLActivity;
import com.sm.witherquiz.Menu.ProducentsInfoActivity;
import com.sm.witherquiz.QuestionsDatabaseHelper;
import com.sm.witherquiz.Quizes.QuizSerialActivity;
import com.sm.witherquiz.R;
import com.sm.witherquiz.Login.SignInActivity;
import com.sm.witherquiz.ObjectAndAdapters.UpdateInfo;

public class SerialCattegoryActivity extends AppCompatActivity {

    private AdView mAdView;
    private int DbVersion;
    private FirebaseAuth firebaseAuth;
    private int questionsNumber;
    private String updateInfo;
    private FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serial_cattegory);

        DbVersion = QuestionsDatabaseHelper.getDbVersion()-1;
        TextView textView = (TextView) findViewById(R.id.DbVersion);
        textView.setText("Version: " + 1 + "." +DbVersion);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        firebaseDatabase = FirebaseDatabase.getInstance();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_logout) {

            Toast toast = Toast.makeText(SerialCattegoryActivity.this, "Wylogowano", Toast.LENGTH_SHORT);
            toast.show();


            LoginManager.getInstance().logOut();
            AccessToken.setCurrentAccessToken(null);

            firebaseAuth.getInstance().signOut();
            goToLogin();


            return true;
        }

        if (id == R.id.producents_info) {

            Intent intent = new Intent(SerialCattegoryActivity.this, ProducentsInfoActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.private_policy) {

            Intent intent = new Intent(SerialCattegoryActivity.this, PrivatePolicyURLActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.newQuestionsMenu)
        {
            Intent intent = new Intent(SerialCattegoryActivity.this, NewQuestionsActivity.class);
            startActivity(intent);
        }

        if (id == R.id.updateInfoMenu)
        {
            ReadPatchInfo();
        }

        return super.onOptionsItemSelected(item);
    }


    private void goToLogin() {

        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    public void OnClickStartSeason1(View view) {
        Intent intent = new Intent(SerialCattegoryActivity.this, QuizSerialActivity.class);
        intent.putExtra(QuizSerialActivity.EXTRA_SERIAL_ID, 1);
        startActivity(intent);
    }

    public void OnClickStartCommingSon(View view) {

        Toast.makeText(SerialCattegoryActivity.this, "Jeszcze nie powsta??...", Toast.LENGTH_SHORT).show();
    }

    public void questionsSerial1(View view) {
        questionsNumber=140;
        showAlertDialogButtonClicked(view);
    }

    public void questionsSerial3(View view) {
        questionsNumber=0;
        showAlertDialogButtonClicked(view);
    }

    public void questionsSerial2(View view) {
        questionsNumber=0;
        showAlertDialogButtonClicked(view);
    }

    public void showAlertDialogButtonClicked(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(SerialCattegoryActivity.this);
        builder.setTitle("DANE TECHNICZNE");
        builder.setMessage("Ilo???? pyta??: " + questionsNumber + ".");


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });


        AlertDialog dialog = builder.create();
        dialog.setIcon(R.mipmap.ic_witcher);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.password_background);
        dialog.show();
    }

    private void ReadPatchInfo()
    {
        try {
            firebaseDatabase.getReference().child("Information").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    if ((int) dataSnapshot.getChildrenCount() != 0) {

                        UpdateInfo updateInfoObject = dataSnapshot.getValue(UpdateInfo.class);
                        updateInfo = updateInfoObject.updateInfo;

                    }
                    else
                    {
                        updateInfo = "W obecnej chwili brak informacji";

                    }
                    View view = new View(getApplicationContext());
                    showAlertDialogButtonClickedUpdateInfo(view);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(SerialCattegoryActivity.this, "B????d z baz?? danych", Toast.LENGTH_SHORT).show();

        }
    }

    public void showAlertDialogButtonClickedUpdateInfo(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(SerialCattegoryActivity.this);
        builder.setTitle("UPDATE INFO");
        builder.setMessage(updateInfo);


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });


        AlertDialog dialog = builder.create();
        dialog.setIcon(R.mipmap.ic_witcher);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.password_background);
        dialog.show();
    }

}
