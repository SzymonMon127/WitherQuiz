package com.sm.witherquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.Login.SignInActivity;
import com.sm.witherquiz.Menu.NewQuestionsActivity;
import com.sm.witherquiz.Menu.PrivatePolicyURLActivity;
import com.sm.witherquiz.Menu.ProducentsInfoActivity;
import com.sm.witherquiz.ObjectAndAdapters.UpdateInfo;
import com.sm.witherquiz.ObjectAndAdapters.Person;
import com.sm.witherquiz.QuizCattegory.MainCattegoryActivity;
import com.sm.witherquiz.Quizes.QuizBookActivity;
import com.sm.witherquiz.Quizes.QuizGameActivity;
import com.sm.witherquiz.Quizes.QuizSerialActivity;

import org.apache.commons.lang3.StringUtils;


public class ScoreActivity extends AppCompatActivity {

    private AdView mAdView;
    private String UserName;
    private int LeaguePoints;
    private int score;
    private int addLeaguePoints;
    private int limitScore;
    private int RealLeaguePoints;
    private String Division;
    private  int imageId;
    private int hp;
    private FirebaseDatabase firebaseDatabase;
    private RewardedAd mRewardedAd;
    private  int LpDeff;
    private  int LpBoost;
    private String FirebaseEmail;
    private FirebaseAuth firebaseAuth;
    private  int Connection;
    private int gameId;
    private String feedbackString;
    private int newLp;
    private String id;
    private String idNumber;
    private String StringTableSQL;
    private final String TAG = "ScoreActivity";
    private String updateInfo;

    public static final String EXTRA_SCORE_ID = "gameId";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        firebaseAuth = FirebaseAuth.getInstance();

        gameId = (Integer)getIntent().getExtras().get(EXTRA_SCORE_ID);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);


        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        firebaseDatabase = FirebaseDatabase.getInstance();

        loadAd();

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView =findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        if (firebaseAuth.getInstance().getCurrentUser() != null) {

            getNameAndId();
            loadLeaguePoints();

        }
        else
        {
            goToLogin();
        }

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

            Toast toast = Toast.makeText(ScoreActivity.this, "Wylogowano", Toast.LENGTH_SHORT);
            toast.show();


            LoginManager.getInstance().logOut();
            AccessToken.setCurrentAccessToken(null);

            firebaseAuth.getInstance().signOut();
            goToLogin();


            return true;
        }



        if (id == R.id.hpReset)
        {

            showAlertDialogButtonClickedView();

            return true;
        }

        if (id == R.id.producents_info) {

            Intent intent = new Intent(ScoreActivity.this, ProducentsInfoActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.private_policy) {

            Intent intent = new Intent(ScoreActivity.this, PrivatePolicyURLActivity.class);
            startActivity(intent);

            return true;
        }
        if (id == R.id.newQuestionsMenu)
        {
            Intent intent = new Intent(ScoreActivity.this, NewQuestionsActivity.class);
            startActivity(intent);
        }
        if (id == R.id.updateInfoMenu)
        {
            ReadPatchInfo();
        }



        return super.onOptionsItemSelected(item);
    }


    public void OnClickBackToMenu(View view) {
        Intent intent = new Intent(ScoreActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }


    public void onClickNewGame(View view) {
        if(Connection ==1)
        {
            if(hp >0)
            {
                Intent intent = new Intent(ScoreActivity.this, MainCattegoryActivity.class);
                startActivity(intent);
                finish();
                hp = hp-1;
                UpdateLeaguePoints();

            }
            else {
                Toast toast = Toast.makeText(ScoreActivity.this, "Brak wigoru, obejrzyj reklamę w celu odnowy", Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else
        {
            Toast.makeText(ScoreActivity.this, "Brak połączenia z internetem", Toast.LENGTH_SHORT).show();
        }


    }




    private void loadLeaguePoints() {

            firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                   Person newPerson = dataSnapshot.getValue(Person.class);
                   LeaguePoints = newPerson.LeaguePoints;
                   hp = newPerson.hp;
                   imageId = newPerson.imageId;
                   LpDeff = newPerson.LpDeff;
                   LpBoost = newPerson.LpBoost;
                   Connection = newPerson.Connection;
                   Division = newPerson.Division;

                    Readhp();


                   LoadScore();
                   FeedbackAndChangeLeaguePoints();
                   Division();









                       if(addLeaguePoints >= 0)
                       {
                           TextView lpField = (TextView) findViewById(R.id.Lp);
                           lpField.setText(Division + " " + RealLeaguePoints +  " " + "(" + "+"+addLeaguePoints + ")" +" pkt");
                       }
                       else
                       {
                           TextView lpField = (TextView) findViewById(R.id.Lp);
                           lpField.setText(Division + " " + RealLeaguePoints +  " " + "("+addLeaguePoints + ")" +" pkt");
                       }



                   ResetScore();
                   UpdateLeaguePoints();



                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {


                }
            });


    }

    private void UpdateLeaguePoints()
    {

            firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        Person person = new Person(UserName, imageId, Division, LeaguePoints, RealLeaguePoints, hp, LpDeff, LpBoost, Connection, idNumber);
                        firebaseDatabase.getReference().child("users").child(id).setValue(person);

                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {


                }
            });

    }

    private void FeedbackAndChangeLeaguePoints()
    {
        TextView feedback =(TextView) findViewById(R.id.feedback);

            if(Division.equals("Dziecko Niespodzianka"))
            {
                if (score==0)
                {
                    feedbackString = "Tragiczny wynik";
                    addLeaguePoints = -21;

                }
                if(score ==1)
                {
                    feedbackString = "Na pewno wzieliśmy dobre dziecko?";
                    addLeaguePoints = -18;

                }
                if(score ==2)
                {
                    feedbackString = "Na pewno wzieliśmy dobre dziecko?";
                    addLeaguePoints = -15;

                }

                if(score ==3)
                {
                    feedbackString = "Nie jesteś gotów prób traw";
                    addLeaguePoints = 0;
                }
                if(score ==4) {
                    feedbackString = "Brawo dzieciaku";
                    addLeaguePoints = 15;

                }

                if(score ==5 ) {
                    feedbackString = "Brawo dzieciaku";
                    addLeaguePoints = 18;

                }

                if(score ==6 || score ==7) {
                    feedbackString = "Dobry wynik";
                    addLeaguePoints = 22;

                }

                if(score ==8 ) {
                    feedbackString = "Wynik godny prób traw";
                    addLeaguePoints = 25;

                }

                if(score ==9 ) {
                    feedbackString = "Niemalże perfekcyjnie";
                    addLeaguePoints = 27;
                }

                if(score ==10 ) {
                    feedbackString = "Perfekcyjny wynik";
                    addLeaguePoints = 33;
                }

            }
            else if (Division.equals("Próba Traw"))
            {
                if (score==0)
                {
                    feedbackString = "Tragiczny wynik";
                    addLeaguePoints = -22;

                }
                if(score ==1 || score ==2)
                {
                    feedbackString = "Pomylono zioła?";
                    addLeaguePoints = -19;

                }

                if(score ==3)
                {
                    feedbackString = "Daleko Ci do adepta";
                    addLeaguePoints = -17;
                }
                if(score ==4)
                {
                    feedbackString = "Daleko Ci do adepta";
                    addLeaguePoints = 0;
                }

                if(score ==5 || score ==6) {
                    feedbackString = "Próby przechodzą pomyślnie";
                    addLeaguePoints = 18;

                }

                if(score ==7|| score ==8) {
                    feedbackString = "Wynik godny adepta";
                    addLeaguePoints = 21;

                }

                if(score ==9 ) {
                    feedbackString = "Niemalże perfekcyjnie";
                    addLeaguePoints = 25;
                }

                if(score ==10 ) {
                    feedbackString = "Gotowy zostać adeptem?";
                    addLeaguePoints = 29;
                }
            }
            else if (Division.equals("Adept"))
            {
                if (score==0 || score ==1)
                {
                    feedbackString = "Tragiczny wynik";
                    addLeaguePoints = -24;

                }
                if(score ==2 || score ==3)
                {
                    feedbackString = "Przeżyłeś próby traw?";
                    addLeaguePoints = -22;

                }

                if(score ==4)
                {
                    feedbackString = "Daleko Ci aby dostać medalion";
                    addLeaguePoints = -21;

                }

                if(score ==5)
                {
                    feedbackString = "Daleko Ci aby dostać medalion";
                    addLeaguePoints = 0;
                }

                if( score ==6) {
                    feedbackString = "Trening przechodzi pomyślnie";
                    addLeaguePoints = 17;

                }

                if(score ==7) {
                    feedbackString = "Tak szybko opanowałeś znaki?";
                    addLeaguePoints = 19;

                }

                if( score ==8) {
                    feedbackString = "Preceptor jest z Ciebie dumny";
                    addLeaguePoints = 21;

                }

                if(score ==9 ) {
                    feedbackString = "Niemalże perfekcyjnie";
                    addLeaguePoints = 23;
                }

                if(score ==10 ) {
                    feedbackString = "Gotowy zostać wiedźminem?";
                    addLeaguePoints = 25;
                }

                }
            else if (Division.equals("Wiedźmin"))
            {
                if (score==0 || score ==1 )
                {
                    feedbackString = "Nie jesteś godny medalionu";
                    addLeaguePoints = -27;

                }
                if(score ==2 || score ==3 )
                {
                    feedbackString = "Tragiczny wynik wiedźminie...";
                    addLeaguePoints = -25;
                }

                if(score ==4 || score ==5)
                {
                    feedbackString = "Wynik godny adepta...";
                    addLeaguePoints = -23;
                }

                if(score ==6)
                {
                    feedbackString = "Prawie...prawie...";
                    addLeaguePoints = 0;
                }

                if(score ==7 ) {
                    feedbackString = "Kolejny potwór ubity :)";
                    addLeaguePoints = 15;
                }

                if(score ==8 ) {
                    feedbackString = "To było ciężkie zlecenie";
                    addLeaguePoints =  17;
                }

                if(score ==9 ) {
                    feedbackString = "Niemalże perfekcyjnie";
                    addLeaguePoints = 19;
                }

                if(score ==10 ) {
                    feedbackString = "Wpadłeś w oko Yennefer";
                    addLeaguePoints = 22;
                }

            }
            else if (Division.equals("Biały Wilk")) {
                if (score == 0 || score == 1) {
                    feedbackString = "Tragiczny wynik biały wilku";
                    addLeaguePoints = -31;

                }
                if (score == 2 || score == 3) {
                    feedbackString = "Tragiczny wynik Biały Wilku";
                    addLeaguePoints = -27;
                }

                if (score == 4 || score == 5) {
                    feedbackString = "Mantikora rozrywa twoje flaki";
                    addLeaguePoints = -24;
                }

                if (score == 6) {
                    feedbackString = "Może jak na zwykłego wiedźmina...";
                    addLeaguePoints = -17;
                }

                if (score == 7) {
                    feedbackString = "Va fail Gwynbleidd";
                    addLeaguePoints = -1;
                }

                if (score == 8) {
                    feedbackString = "Cieżki dzień w Blaviken";
                    addLeaguePoints = 13;
                }

                if (score == 9) {
                    feedbackString = "Wpadłeś w objęcia Yennefer";
                    addLeaguePoints = 15;
                }

                if (score == 10) {
                    feedbackString = "Idę po Ciebie Vilgefotrz";
                    addLeaguePoints = 17;
                }

            }

        if (LpBoost >0|| LpDeff >0)
        {
            feedbackString = feedbackString + "\n" + "Pozostało: ";
        }

            if (LpBoost > 0)
            {

                if (Division.equals("Dziecko Niespodzianka"))
                {
                    addLeaguePoints = addLeaguePoints +8;
                }
                else if (Division.equals("Próba Traw"))
                {
                    addLeaguePoints = addLeaguePoints +7;
                }
                else if (Division.equals("Adept"))
                {
                    addLeaguePoints = addLeaguePoints +5;
                }
                else if (Division.equals("Wiedźmin"))
                {
                    addLeaguePoints = addLeaguePoints +3;
                }
                else if (Division.equals("Biały Wilk"))
                {
                    addLeaguePoints = addLeaguePoints +2;
                }
                LpBoost = LpBoost -1;
                feedbackString = feedbackString + "BoostPl - " + LpBoost + "\n";
            }
            if (LpDeff > 0)
            {
                LpDeff = LpDeff-1;
                feedbackString = feedbackString + "OchronyPkt - " + LpDeff;
                if (addLeaguePoints <0)
                {
                    addLeaguePoints = 0;
                    feedbackString = feedbackString + " \nOchrona utraty Pkt";
                }

                }

            LeaguePoints = LeaguePoints + addLeaguePoints;


        if (Division.equals("Dziecko Niespodzianka"))
        {
            if (LeaguePoints > 100)
            {

                feedbackString =feedbackString + "\nPróba traw w toku";
                LpDeff = LpDeff+1;
            }
            if (LeaguePoints <0)
            {
                feedbackString =feedbackString + "\nNiżej już nie spadniesz :)";
                LeaguePoints =0;
                addLeaguePoints =0;
            }
        }
        else if (Division.equals("Próba Traw"))
        {
            if (LeaguePoints <= 100)
            {
                feedbackString =feedbackString + "\nPrzerywamy próby traw";

            }
            if (LeaguePoints > 200)
            {
                feedbackString =feedbackString+"\nPrzeżyłeś próby traw";
                LpDeff = LpDeff+1;

            }
        }
        else if (Division.equals("Adept"))
        {
            if (LeaguePoints <= 200)
            {
                feedbackString =feedbackString + "\nPonawiamy próby traw";
            }
            if (LeaguePoints > 300)
            {
                feedbackString =feedbackString+"\nOtrzymujesz medalion";
                LpDeff = LpDeff+1;
            }
        }
        else if (Division.equals("Wiedźmin"))
        {
            if (LeaguePoints <= 300)
            {
                feedbackString =feedbackString + "\nTracisz medalion";
            }
            if (LeaguePoints > 400)
            {
                feedbackString =feedbackString+"\nZostajesz legendą";
                LpDeff = LpDeff+1;
            }
        }
        else if (Division.equals("Biały Wilk"))
        {
            if (LeaguePoints <= 400)
            {
                feedbackString =feedbackString + "\nZgubiłeś Ciri";
            }
        }



        feedback.setText(feedbackString);


    }




    private void LoadScore()
    {

        if(gameId == 21)
        {
            StringTableSQL = "QUESTIONSGAME1";
            limitScore = QuizGameActivity.NumberOfLimitQuestions;
        }

        if(gameId == 22)
        {
            StringTableSQL = "QUESTIONSGAME2";
            limitScore = QuizGameActivity.NumberOfLimitQuestions;

        }

        if(gameId == 23)
        {
            StringTableSQL = "QUESTIONSGAME3";
            limitScore = QuizGameActivity.NumberOfLimitQuestions;

        }


        if(gameId == 11)
        {
            StringTableSQL = "QUESTIONS";
            limitScore = QuizSerialActivity.NumberOfLimitQuestions;

        }

        if(gameId == 31)
        {
            StringTableSQL = "QUESTIONSBOOK1";

            limitScore = QuizBookActivity.NumberOfLimitQuestions;

        }

        if(gameId == 32)
        {
            StringTableSQL = "QUESTIONSBOOK2";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }

        if(gameId == 33)
        {
            StringTableSQL = "QUESTIONSBOOK3";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }

        if(gameId == 34)
        {
            StringTableSQL = "QUESTIONSBOOK4";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }

        if(gameId == 35)
        {
            StringTableSQL = "QUESTIONSBOOK5";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }

        if(gameId == 36)
        {
            StringTableSQL = "QUESTIONSBOOK6";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }

        if(gameId == 37)
        {
            StringTableSQL = "QUESTIONSBOOK7";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }
        if(gameId == 38)
        {
            StringTableSQL = "QUESTIONSBOOK8";
            limitScore = QuizBookActivity.NumberOfLimitQuestions;


        }
        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();
            Cursor cursor = db.query(StringTableSQL, new String[]{"SCORE"}, "SCORE = ?",
                    new String[]{Integer.toString(1)}, null, null, null);



            score = cursor.getCount();



            TextView feedback = (TextView) findViewById(R.id.score);
            feedback.setText(("Wynik: " + score + "/"+ limitScore));



            cursor.close();
            db.close();
        }
        catch (SQLiteException e)
        {
            Toast toast = Toast.makeText(this, "CHUJ", Toast.LENGTH_LONG);
            toast.show();
        }
    }
    private void ResetScore()
    {
        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update(StringTableSQL, ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        }
        catch (SQLiteException e)
        {
            Toast toast = Toast.makeText(this, "CHUJ", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    private void Division()
    {
        ImageView divisionImage = (ImageView) findViewById(R.id.division);
        if (LeaguePoints <=100)
        {
            RealLeaguePoints = LeaguePoints;
            imageId = R.drawable.bronze;
            divisionImage.setImageResource(imageId);
            Division = "Dziecko Niespodzianka";
        }
        if (LeaguePoints > 100 && (LeaguePoints<200 || LeaguePoints==200))
        {
            RealLeaguePoints = LeaguePoints-100;
            imageId = R.drawable.silver;
            divisionImage.setImageResource(imageId);
            Division = "Próba Traw";
        }
        if (LeaguePoints > 200 && (LeaguePoints<300 || LeaguePoints==300))
        {
            RealLeaguePoints = LeaguePoints-200;
            imageId = R.drawable.gold;
            divisionImage.setImageResource(imageId);
            Division = "Adept";
        }
        if (LeaguePoints > 300 && (LeaguePoints<400 || LeaguePoints==400))
        {
            RealLeaguePoints = LeaguePoints-300;
            imageId = R.drawable.master;
            divisionImage.setImageResource(imageId);
            Division = "Wiedźmin";
        }
        if (LeaguePoints > 400)
        {
            RealLeaguePoints = LeaguePoints-400;
            imageId = R.drawable.challenger;
            divisionImage.setImageResource(imageId);
            Division = "Biały Wilk";
        }
    }


    public void OnClickShowMessageAboutHp(View view) {
        Toast toast = Toast.makeText(ScoreActivity.this, "W celu resetu wigoru naciśnij reklamę", Toast.LENGTH_SHORT);
        toast.show();
    }

    private void loadAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-6555234985187895/1852324872",
                adRequest, new RewardedAdLoadCallback(){
                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        // Handle the error.
                        Log.d(TAG, loadAdError.getMessage());
                        mRewardedAd = null;
                    }

                    @Override
                    public void onAdLoaded(@NonNull RewardedAd rewardedAd) {
                        mRewardedAd = rewardedAd;
                        Log.d(TAG, "onAdFailedToLoad");
                    }
                });
    }


    public void showAd() {


        if (mRewardedAd != null) {
            Activity activityContext = ScoreActivity.this;
            mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    hp = hp +5;
                    UpdateLeaguePoints();
                    ImageButton imageButton = (ImageButton)findViewById(R.id.hp);
                    imageButton.setBackgroundResource(R.drawable.hp4);
                }
            });
        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }

    }


    private void goToLogin() {
        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    private void Readhp() {

        TextView textView = (TextView) findViewById(R.id.hp_number);
        textView.setText(hp + " wigoru");


        if (hp >= 5) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
            imageButton.setBackgroundResource(R.drawable.hp5);
        }
        else if (hp == 4) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
            imageButton.setBackgroundResource(R.drawable.hp4);
        }
        else if (hp == 3) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
            imageButton.setBackgroundResource(R.drawable.hp3);
        }
        else if (hp == 2) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
            imageButton.setBackgroundResource(R.drawable.hp2);
        }
        else if (hp == 1) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
            imageButton.setBackgroundResource(R.drawable.hp1);
        }
        else if (hp == 0) {
            ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
            imageButton.setBackgroundResource(R.drawable.hp0);
        }
            }

    @Override
    protected void onResume() {
        super.onResume();
        Readhp();
        loadAd();
    }



    private void getNameAndId()
    {

        if (AccessToken.getCurrentAccessToken() != null)
        {
            FirebaseEmail = firebaseAuth.getInstance().getCurrentUser().getDisplayName();
            UserName = StringUtils.substringBefore(FirebaseEmail, "@");
            UserName = UserName.replace(".", "");


        }
        else
        {
            FirebaseEmail = firebaseAuth.getInstance().getCurrentUser().getEmail();
            UserName = StringUtils.substringBefore(FirebaseEmail, "@");
            UserName = UserName.replace(".", "");
        }

        idNumber = firebaseAuth.getInstance().getCurrentUser().getUid();
        id =UserName + idNumber;

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
                    showAlertDialogButtonClicked(view);
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(ScoreActivity.this, "Błąd z bazą danych", Toast.LENGTH_SHORT).show();

        }
    }

    public void showAlertDialogButtonClicked(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(ScoreActivity.this);
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

    public void showAlertDialogButtonClickedView() {


        AlertDialog.Builder builder = new AlertDialog.Builder(ScoreActivity.this);
        builder.setTitle("Reklama z nagrodą.");
        builder.setMessage("Za obejrzenie tej reklamy otrzymasz 5 pkt wigoru. Jesteś pewny, że chcesz ją wyświetlić?");


        builder.setPositiveButton("TAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                showAd();

            }
        });

        builder.setNegativeButton("NIE", new DialogInterface.OnClickListener() {
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
