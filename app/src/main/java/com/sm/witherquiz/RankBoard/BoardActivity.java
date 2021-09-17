package com.sm.witherquiz.RankBoard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.R;
import com.sm.witherquiz.Login.SignInActivity;

import org.apache.commons.lang3.StringUtils;

public class BoardActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private String userName;
    int size;
    private String userName1;
    private int rank;
    private FirebaseAuth firebaseAuth;
    private String FirebaseEmail;
    private String id;
    private String idNumber;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        firebaseDatabase = FirebaseDatabase.getInstance();
        firebaseAuth = FirebaseAuth.getInstance();


        if (firebaseAuth.getInstance().getCurrentUser() != null) {

            getNameAndId();

            LoadRank();
        }
        else
        {
            goToLogin();
        }




    }



    private void LoadRank()
    {
        firebaseDatabase.getReference().child("users").orderByChild("LeaguePoints").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                size = (int) dataSnapshot.getChildrenCount();


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }

    private void goToLogin() {

        Toast toast = Toast.makeText(BoardActivity.this, "Brak połączenia z internetem", Toast.LENGTH_LONG);
        LoginManager.getInstance().logOut();
        AccessToken.setCurrentAccessToken(null);
        toast.show();
        Intent intent = new Intent(BoardActivity.this, SignInActivity.class);
        startActivity(intent);

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

}

