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
import com.sm.witherquiz.Quizes.QuizBookActivity;
import com.sm.witherquiz.R;
import com.sm.witherquiz.Login.SignInActivity;
import com.sm.witherquiz.ObjectAndAdapters.UpdateInfo;

public class BookCattegoryActivity extends AppCompatActivity {

    private AdView mAdView;
    private int DbVersion;
    private FirebaseAuth firebaseAuth;
    private int questionsNumber;
    private String updateInfo;
    private FirebaseDatabase firebaseDatabase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_cattegory);

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

            Toast toast = Toast.makeText(BookCattegoryActivity.this, "Wylogowano", Toast.LENGTH_SHORT);
            toast.show();


            LoginManager.getInstance().logOut();
            AccessToken.setCurrentAccessToken(null);

            firebaseAuth.getInstance().signOut();
            goToLogin();


            return true;
        }

        if (id == R.id.producents_info) {

            Intent intent = new Intent(BookCattegoryActivity.this, ProducentsInfoActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.private_policy) {

            Intent intent = new Intent(BookCattegoryActivity.this, PrivatePolicyURLActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.newQuestionsMenu)
        {
            Intent intent = new Intent(BookCattegoryActivity.this, NewQuestionsActivity.class);
            startActivity(intent);
        }

        if (id == R.id.updateInfoMenu)
        {
            ReadPatchInfo();
        }

        return super.onOptionsItemSelected(item);
    }


    public void OnClickStartBook1(View view) {
        Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
        intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 1);
        startActivity(intent);
    }

    public void OnClickStartBook2(View view) {
        Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
        intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 2);
        startActivity(intent);
    }

    public void OnClickStartBook3(View view) {
        Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
        intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 3);
       startActivity(intent);
    }

    public void OnClickStartBook4(View view) {
       Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
       intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 4);
        startActivity(intent);
    }

    public void OnClickStartBook5(View view) {
        Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
       intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 5);
        startActivity(intent);

    }

    public void OnClickStartBook6(View view) {
       Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
       intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 6);
       startActivity(intent);
    }

    public void OnClickStartBook7(View view) {
        Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
        intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 7);
        startActivity(intent);

    }
    public void OnClickStartBook8(View view) {
        Intent intent = new Intent(BookCattegoryActivity.this, QuizBookActivity.class);
        intent.putExtra(QuizBookActivity.EXTRA_BOOK_ID, 8);
        startActivity(intent);

    }


    public void questionsBook1(View view) {
        questionsNumber=107;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook2(View view) {
        questionsNumber=109;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook3(View view) {
        questionsNumber=106;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook4(View view) {
        questionsNumber=104;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook5(View view) {
        questionsNumber=105;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook6(View view) {
        questionsNumber=87;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook7(View view) {
        questionsNumber=89;
        showAlertDialogButtonClicked(view);
    }

    public void questionsBook8(View view) {
        questionsNumber=111;
        showAlertDialogButtonClicked(view);

    }

    public void showAlertDialogButtonClicked(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(BookCattegoryActivity.this);
        builder.setTitle("DANE TECHNICZNE");
        builder.setMessage("Ilość pytań: " + questionsNumber + ".");


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



    private void goToLogin() {

        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
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
                    showAlertDialogButtonClickedPathInfo(view);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(BookCattegoryActivity.this, "Błąd z bazą danych", Toast.LENGTH_SHORT).show();

        }
    }

    public void showAlertDialogButtonClickedPathInfo(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(BookCattegoryActivity.this);
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
