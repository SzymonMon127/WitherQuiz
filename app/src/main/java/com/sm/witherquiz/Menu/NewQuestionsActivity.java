package com.sm.witherquiz.Menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.R;
import com.sm.witherquiz.ObjectAndAdapters.newQuestions;


public class NewQuestionsActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private int size;
    private String Question, answer1, answer2, answer3;
    private AdView mAdView;

    private EditText questionEditText, answer1EditText, answer2EditText, answer3EditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_questions);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);



        firebaseDatabase = FirebaseDatabase.getInstance();

        questionEditText = (EditText) findViewById(R.id.questionNewEditText);
        answer1EditText = (EditText) findViewById(R.id.answer1EditText);
        answer2EditText = (EditText) findViewById(R.id.answer2EditText);
        answer3EditText = (EditText) findViewById(R.id.answer3EditText);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }





    private void ReadFromFirebase()
    {
        try {
            firebaseDatabase.getReference().child("newQuestions").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                    if ((int) dataSnapshot.getChildrenCount() != 0) {


                        size = (int) dataSnapshot.getChildrenCount() +1;

                    }
                    else
                    {
                        size =1;

                    }
                    SaveInFirebase();

                    View view = new View(getApplicationContext());
                    showAlertDialogButtonClicked(view);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(NewQuestionsActivity.this, "Błąd z bazą danych", Toast.LENGTH_SHORT).show();

        }
    }

    private void SaveInFirebase()
    {
        newQuestions newQuestions =  new newQuestions(Question, answer1, answer2, answer3);

        firebaseDatabase.getReference().child("newQuestions").child(String.valueOf(size)).setValue(newQuestions);
    }

    public void onClickSendNewQuestion(View view) {
        Question = questionEditText.getText().toString();
        answer1 = answer1EditText.getText().toString();
        answer2 = answer2EditText.getText().toString();
        answer3 = answer3EditText.getText().toString();

        if (answer1.length() < 1 || answer2.length() < 1 || answer3.length() < 1 || Question.length() < 1)
        {
            Toast.makeText(NewQuestionsActivity.this, "Wypełnij wszystkie pola", Toast.LENGTH_LONG).show();
        }
        else
        {
            ReadFromFirebase();
        }



    }

    public void showAlertDialogButtonClicked(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(NewQuestionsActivity.this);
        builder.setTitle("DZIĘKUJĘ");
        builder.setMessage("Dodałeś pytanie konsumenckie numer: " + size + ". \n \nMożliwe, że twoje pytanie zostanie dodane w następnej aktualizacji :)");


        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {


            }
        });


        AlertDialog dialog = builder.create();
        dialog.show();
    }
}