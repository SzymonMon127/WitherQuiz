package com.sm.witherquiz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LogoActivity extends AppCompatActivity {

    private int seconds = 0;
    private ProgressBar progressBar;
    private Handler handler;
    private Runnable my_runnable;
    private TextView loadingText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_logo);

        progressBar = findViewById(R.id.progressBar);
        loadingText = findViewById(R.id.loadingText);
        progressBar.setProgress(0);
        progressBar.setMax(100);
        handler = new Handler();

        my_runnable = () -> {
            seconds++;


            if (seconds == 0)
            {
                progressBar.setProgress(seconds);
                Toast.makeText(LogoActivity.this, getResources().getString(R.string.noInternetConnection), Toast.LENGTH_SHORT).show();
                loadingText.setText(getResources().getString(R.string.noInternetConnection));
                handler.removeCallbacksAndMessages(my_runnable);

            } else if (seconds <=100 )
            {
                progressBar.setProgress(seconds);
                loadingText.setText(getResources().getString(R.string.LoadingDatabase) + " " + seconds+"%");
                handler.postDelayed(my_runnable, 15);
            }
            else
            {
                handler.removeCallbacksAndMessages(my_runnable);
                Intent intent = new Intent(LogoActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        };



        try {

            if(!isInternetOn())
            {
                Toast.makeText(LogoActivity.this, getResources().getString(R.string.noInternetConnection), Toast.LENGTH_SHORT).show();
                loadingText.setText(getResources().getString(R.string.noInternetConnection));
            }
        }
        catch (Exception e)
        {
            Toast.makeText(LogoActivity.this, getResources().getString(R.string.noInternetConnection), Toast.LENGTH_SHORT).show();
            loadingText.setText(getResources().getString(R.string.noInternetConnection));
        }
        ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() {
            @Override
            public void onAvailable(Network network) {
                displayDistance();
            }

            @Override
            public void onLost(Network network) {
                seconds = -1;

            }


        };

        ConnectivityManager connectivityManager =
                (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            connectivityManager.registerDefaultNetworkCallback(networkCallback);
        } else {
            NetworkRequest request = new NetworkRequest.Builder()
                    .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET).build();
            connectivityManager.registerNetworkCallback(request, networkCallback);
        }


    }




    private void displayDistance() {

        seconds =0;

        handler.postDelayed(my_runnable, 500);
    }



    public final boolean isInternetOn() {

        // get Connectivity Manager object to check connection
        ConnectivityManager connec =
                (ConnectivityManager)getSystemService(getBaseContext().CONNECTIVITY_SERVICE);

        // Check for network connections
        if ( connec.getActiveNetworkInfo().getState() == android.net.NetworkInfo.State.CONNECTED ||
                connec.getActiveNetworkInfo().getState() == android.net.NetworkInfo.State.CONNECTING ) {

            // if connected with internet


            return true;

        } else if (
                connec.getActiveNetworkInfo().getState() == android.net.NetworkInfo.State.DISCONNECTED ||
                        connec.getActiveNetworkInfo().getState() == android.net.NetworkInfo.State.DISCONNECTED  ) {

            return false;
        }
        return false;
    }


}
