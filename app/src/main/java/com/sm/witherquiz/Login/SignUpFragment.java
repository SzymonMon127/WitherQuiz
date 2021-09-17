package com.sm.witherquiz.Login;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.sm.witherquiz.MainActivity;
import com.sm.witherquiz.R;

public class SignUpFragment extends Fragment implements View.OnClickListener {

    private Button mSignUpButton;
    private EditText mEmailEditText;
    private EditText mPasswordEditText;

    private AdView mAdView;
    private FirebaseAuth firebaseAuth;


    public SignUpFragment(){
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firebaseAuth = FirebaseAuth.getInstance();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View rootView = inflater.inflate(R.layout.fragment_sign_up, container, false);
        mSignUpButton = (Button) rootView.findViewById(R.id.sign_up_butt);
        mEmailEditText = (EditText) rootView.findViewById(R.id.email_et);
        mPasswordEditText = (EditText) rootView.findViewById(R.id.password_et);


        mAdView = rootView.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        return rootView;


    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mSignUpButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.sign_up_butt:
                trySignUp();
                break;
        }
    }

    private void trySignUp() {
        String email = mEmailEditText.getText().toString();
        String password = mPasswordEditText.getText().toString();
        boolean failed = false;


        if(TextUtils.isEmpty(email))
        {
            mEmailEditText.setError("E-mail nie może być pusty !");
            failed = true;
        }

        if(password.length() < 6)
        {
            mPasswordEditText.setError("Hasło musi zawierać 6 znaków !");
            failed = true;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches())
        {
            mEmailEditText.setError("Niepoprawny e-mail !");
            failed = true;
        }

        if(!failed)
    {
        singUp(email, password);
    }
}

    private void singUp(String email, String password)
    {
        firebaseAuth.createUserWithEmailAndPassword(email.toString(), password.toString()).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Context context = getContext();
                    Intent intent = new Intent(context, MainActivity.class);
                    startActivity(intent);
                    getActivity().finish();
                }
                else
                {
                    Context context = getContext();
                    Toast.makeText(context, "Błąd podczas rejestracji.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        mAdView.destroy();
    }

}
