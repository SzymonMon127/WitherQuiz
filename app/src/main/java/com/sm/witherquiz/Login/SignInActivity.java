package com.sm.witherquiz.Login;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.MainActivity;
import com.sm.witherquiz.Menu.PrivatePolicyURLActivity;
import com.sm.witherquiz.Menu.ProducentsInfoActivity;
import com.sm.witherquiz.ObjectAndAdapters.Person;
import com.sm.witherquiz.R;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;


public class SignInActivity extends AppCompatActivity implements View.OnClickListener {


    private String id;
    private String userName;
    private String FirebaseEmail;
    private int Connected;

    private CallbackManager callbackManager;
    private GoogleSignInClient mGoogleSignInClient;
    private static final int RC_SIGN_IN = 9001;
    private static final String TAG = "GoogleActivity";
    private FirebaseDatabase firebaseDatabase;

    public static final int REQUEST_CODE = 123;
    private TextView mCreateAccountTextView;
    private EditText mUserNameEditText;
    private EditText mPasswordEditText;
    private Button mLoginButton;
    public static final String EXIT_ID =  "exitId";
    private  AdView mAdView;
    private FirebaseAuth firebaseAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        try {
            int exit = (Integer)getIntent().getExtras().get(EXIT_ID);
            if(exit ==1) {
                this.finish();
            }
        }
        catch (NullPointerException e)
        {

        }

        firebaseDatabase = FirebaseDatabase.getInstance();

        firebaseAuth = FirebaseAuth.getInstance();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        mCreateAccountTextView = (TextView) findViewById(R.id.create_account_tv);
        mUserNameEditText = (EditText) findViewById(R.id.sing_in_username_et);
        mPasswordEditText = (EditText) findViewById(R.id.sing_in_password_et);
        mLoginButton = (Button) findViewById(R.id.log_in_button);


        mCreateAccountTextView.setOnClickListener(this);



        mLoginButton.setOnClickListener(this);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });



        mAdView =  findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail()
                .build();

        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        callbackManager = CallbackManager.Factory.create();

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        callbackManager.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE)
        {

        }

        if (requestCode == RC_SIGN_IN) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            try {
                // Google Sign In was successful, authenticate with Firebase
                GoogleSignInAccount account = task.getResult(ApiException.class);
                Log.d(TAG, "firebaseAuthWithGoogle:" + account.getId());
                firebaseAuthWithGoogle(account.getIdToken());
            } catch (ApiException e) {
                // Google Sign In failed, update UI appropriately
                Log.w(TAG, "Google sign in failed", e);
                // [START_EXCLUDE]

            }
        }

    }

    private void firebaseAuthWithGoogle(String idToken) {

        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        firebaseAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithCredential:success");
                            FirebaseUser user = firebaseAuth.getCurrentUser();

                                GoToMain();


                        } else {

                        }

                    }
                });
    }

    private void signInGoogle() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.sign_in, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.private_policy) {

            Intent intent = new Intent(SignInActivity.this, PrivatePolicyURLActivity.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.producents_info) {

            Intent intent = new Intent(SignInActivity.this, ProducentsInfoActivity.class);
            startActivity(intent);

            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.create_account_tv:
                Intent intent = new Intent(getApplicationContext(), SignUpActivity.class);
                startActivityForResult(intent, REQUEST_CODE);
                break;
            case R.id.log_in_button:
                tryToSignIn();
                break;
        }

    }

    private void tryToSignIn() {

        String UserName = mUserNameEditText.getText().toString();
        String Password = mPasswordEditText.getText().toString();

        boolean hasErrors = false;

        if(TextUtils.isEmpty(UserName))
        {
            hasErrors = true;
            mUserNameEditText.setError("Email nie może być pusty!");
        }
        if(TextUtils.isEmpty(Password))
        {
            hasErrors=true;
            mPasswordEditText.setError("Hasło nie może być puste!");
        }

        if(!hasErrors)
        {
            singIn(UserName, Password);
        }

    }

    private void singIn(String userName, String password) {
        firebaseAuth.signInWithEmailAndPassword(userName.toString(), password.toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    GoToMain();
                }
                else
                {
                    Toast.makeText(SignInActivity.this, "Nieudana próba logowania.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void GoToMain()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

    @Override
    protected void onStop() {
        mAdView.destroy();
        super.onStop();
    }

    @Override
    protected void onResume() {
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        super.onResume();
    }

    @Override
    protected void onDestroy() {
        mAdView.destroy();
        super.onDestroy();

    }



    public void ONClickloginGoogle(View view) {
        signInGoogle();
    }
}
