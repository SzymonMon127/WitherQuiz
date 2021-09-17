package com.sm.witherquiz.Quizes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.sm.witherquiz.R;
import com.sm.witherquiz.ScoreActivity;

import java.util.Locale;
import java.util.Random;

public class QuizBookActivity extends AppCompatActivity {

    public static final String EXTRA_BOOK_ID = "bookId";

    private int NumberOfQuestions;
    public static int NumberOfLimitQuestions;
    public static int numberOfQuestion;
    private int limitQuestion =0;
    Random random = new Random();
    private int losed = -1;
    public int[] tablica1;
    private int losusTable;
    private int seconds;
    private boolean running;
    private boolean wasRunning;
    private int Id;
    private int color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_book);

        int bookId = (Integer)getIntent().getExtras().get(EXTRA_BOOK_ID);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        if (bookId ==1)
        {
            Id = 31;
            NumberOfQuestions = 107;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==2)
        {
            Id = 32;
            NumberOfQuestions = 109;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==3)
        {
            Id = 33;
            NumberOfQuestions = 106;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==4)
        {
            Id = 34;
            NumberOfQuestions = 104;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==5)
        {
            Id = 35;
            NumberOfQuestions = 105;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==6)
        {
            Id = 36;
            NumberOfQuestions = 87;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==7)
        {
            Id = 37;
            NumberOfQuestions = 89;
            NumberOfLimitQuestions = 10;
        }
        if (bookId ==8)
        {
            Id = 38;
            NumberOfQuestions = 111;
            NumberOfLimitQuestions = 10;
            //LinearLayout linearLayout = (LinearLayout) findViewById(R.id.MainPatter);
            //linearLayout.setBackgroundResource(R.drawable.pattern2);
        }

        tablica1  = new int[NumberOfQuestions];

        if (savedInstanceState != null)
        {
            numberOfQuestion = savedInstanceState.getInt("numberOfQuestion");
            limitQuestion = savedInstanceState.getInt("limitQuestion");
            losed = savedInstanceState.getInt("losed");
            tablica1 = savedInstanceState.getIntArray("tablica1");
            losusTable = savedInstanceState.getInt("losusTable");
            running = savedInstanceState.getBoolean("running");
            seconds = savedInstanceState.getInt("seconds");
            wasRunning = savedInstanceState.getBoolean("wasRunning");
        }
        else {
            ResetQuestionsRNG();
            Questions();
            seconds =35;
            running = true;
        }

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);





        runTimer();

    }

    public void OnClickNextQuestion(View view) {
        if(limitQuestion < NumberOfQuestions-1)
        {
            limitQuestion = limitQuestion+1;
            Questions();
            seconds =35;
        }
        else
        {

            ResetQuestionsRNG();

            Intent intent = new Intent(QuizBookActivity.this, ScoreActivity.class);
            intent.putExtra(ScoreActivity.EXTRA_SCORE_ID, Id);
            startActivity(intent);
            limitQuestion = 0;
            running= false;
            finish();
        }
    }



    public void Questions()
    {
        LosujLiczbe();
        if (limitQuestion == NumberOfLimitQuestions)
        {
            ResetQuestionsRNG();
            Intent intent = new Intent(QuizBookActivity.this, ScoreActivity.class);
            intent.putExtra(ScoreActivity.EXTRA_SCORE_ID, Id);
            startActivity(intent);
            limitQuestion = 0;
            running= false;
            finish();
        }




        QuestionsBookFragment question2 = new QuestionsBookFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_container, question2);
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

        ft.commit();

        losed =numberOfQuestion;

    }
    private void LosujLiczbe() {

        if(losed >=0)
        {
            tablica1[losed]=-10;
        }


        losusTable = random.nextInt(NumberOfQuestions);


        numberOfQuestion = tablica1[losusTable];


        if(limitQuestion <=NumberOfLimitQuestions)
        {
            if(numberOfQuestion < 0)
            {
                while (numberOfQuestion < 0)
                {
                    losusTable = random.nextInt(NumberOfQuestions);
                    numberOfQuestion = tablica1[losusTable];
                }
            }
        }
    }

    private void ResetQuestionsRNG()
    {
        for (int i = 0; i < tablica1.length; i++)
        {
            tablica1[i] = i;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        wasRunning = running;
        running = false;
    }

    private void runTimer() {


        final TextView timeView = (TextView)findViewById(R.id.time_view);
        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int secs = seconds%60;
                String time = String.format(Locale.getDefault(),"%02d", secs);
                timeView.setText(time);
                if (running) {

                    seconds--;
                    if(seconds == -1)
                    {
                        limitQuestion = limitQuestion+1;
                        LosujLiczbe();
                        if (limitQuestion == NumberOfLimitQuestions)
                        {
                            running= false;
                            wasRunning =false;
                            ResetQuestionsRNG();
                            Intent intent = new Intent(QuizBookActivity.this, ScoreActivity.class);
                            intent.putExtra(ScoreActivity.EXTRA_SCORE_ID, Id);
                            startActivity(intent);
                            limitQuestion = 0;
                            finish();
                        }


                        QuestionsBookFragment question2 = new QuestionsBookFragment();
                        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                        ft.replace(R.id.fragment_container, question2);
                        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);

                        ft.commit();

                        losed =numberOfQuestion;
                        seconds =15;


                    }
                }
                handler.postDelayed(this, 1000);
            }
        });
    }

    public int gameId() {
        return Id;
    }





    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("seconds", seconds);
        savedInstanceState.putBoolean("running", running);
        savedInstanceState.putBoolean("wasRunning", wasRunning);
        savedInstanceState.putInt("numberOfQuestion", numberOfQuestion);
        savedInstanceState.putInt("limitQuestion",limitQuestion);
        savedInstanceState.putInt("losed", losed);
        savedInstanceState.putIntArray("tablica1", tablica1);
        savedInstanceState.putInt("losusTable", losusTable);
        super.onSaveInstanceState(savedInstanceState);
    }





}
