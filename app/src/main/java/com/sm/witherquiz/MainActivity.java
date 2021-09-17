package com.sm.witherquiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.room.Update;

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
import com.google.android.material.navigation.NavigationView;
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
import com.sm.witherquiz.RankBoard.BoardActivity;

import org.apache.commons.lang3.StringUtils;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

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
    private final String TAG = "MainActivity";
    private String updateInfo;


    int[][] state = new int[][] {
            new int[] {android.R.attr.state_checked},
            new int[] {-android.R.attr.state_checked}
    };

    int[] colorTextNavMenu = new int[] {
            Color.rgb(166,166,166), (Color.BLACK) };
    ColorStateList colorStateListNavMenuText = new ColorStateList(state, colorTextNavMenu);

    int[] colorIconNavMenu = new int[] {
            Color.rgb(163,99,24), (Color.BLACK) };
    ColorStateList colorStateListNavMenuIcon = new ColorStateList(state, colorIconNavMenu);


    private void startMyService() {
        Intent serviceIntent = new Intent(this, UpdateHpService.class);
        startService(serviceIntent);
    }

    private void stopMyService() {
        Intent serviceIntent = new Intent(this, UpdateHpService.class);
        stopService(serviceIntent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbVersion = QuestionsDatabaseHelper.getDbVersion()-1;
        TextView textView = (TextView) findViewById(R.id.DbVersion);
        textView.setText("Version: " + 1 + "." +DbVersion);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_main);
        setSupportActionBar(toolbar);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_open_drawer, R.string.nav_close_draver);

        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();




        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setBackgroundResource(R.drawable.pattern);
        navigationView.setItemTextColor(colorStateListNavMenuText);
        navigationView.setItemIconTintList(colorStateListNavMenuIcon);
        navigationView.setNavigationItemSelectedListener(this);


        Menu menu = navigationView.getMenu();

        MenuItem storeHp= menu.findItem(R.id.storeHp);
        MenuItem storeLp = menu.findItem(R.id.storeLp);
        SpannableString s = new SpannableString(storeHp.getTitle());
        s.setSpan(new TextAppearanceSpan(this, R.style.TextAppearance44), 0, s.length(), 0);
        storeHp.setTitle(s);
        storeLp.setTitle(s);
        navigationView.setNavigationItemSelectedListener(this);


        loadAd();
        ResetScore();

        firebaseDatabase = FirebaseDatabase.getInstance();


        if (firebaseAuth.getInstance().getCurrentUser() != null) {

            getNameAndId();

            ReadOrInitFromFirebase();
        }
        else
        {
            goToLogin();

        }





        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

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


    @Override
    public void onBackPressed() {

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
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

            Toast toast = Toast.makeText(MainActivity.this, "Wylogowano", Toast.LENGTH_SHORT);
            toast.show();


            LoginManager.getInstance().logOut();
            AccessToken.setCurrentAccessToken(null);

            firebaseAuth.getInstance().signOut();
            goToLogin();


            return true;
        }
        if (id == R.id.hpReset) {

            showAlertDialogButtonClickedView();

            return true;
        }

        if (id == R.id.private_policy) {

            Intent intent = new Intent(MainActivity.this, PrivatePolicyURLActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.producents_info) {

            Intent intent = new Intent(MainActivity.this, ProducentsInfoActivity.class);
            startActivity(intent);

            return true;
        }

        if (id == R.id.newQuestionsMenu)
        {
            Intent intent = new Intent(MainActivity.this, NewQuestionsActivity.class);
            startActivity(intent);
        }

        if (id == R.id.updateInfoMenu)
        {
            ReadPatchInfo();
        }

        return super.onOptionsItemSelected(item);
    }


    public void CloseApplication(View view) {
        Intent intent = new Intent(MainActivity.this, SignInActivity.class);
        intent.putExtra(SignInActivity.EXIT_ID,1);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void OnClickStartQuiz(View view) {


        if(Connection ==1)
        {
            if (hp > 0) {
                Intent intent = new Intent(MainActivity.this, MainCattegoryActivity.class);
                startActivity(intent);


                hp = hp - 1;
                saveHpAndBoosts();

            }
            else {
                Toast toast = Toast.makeText(MainActivity.this, "Brak wigoru, obejrzyj reklamę w celu odnowy", Toast.LENGTH_LONG);
                toast.show();
            }
        }
        else
        {
            TestConnetionWithFirebase();
        }

    }

    private void goToLogin() {

        Intent intent = new Intent(this, SignInActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }



    private void Division() {

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
        if (LeaguePoints > 400 )
        {
            RealLeaguePoints = LeaguePoints-400;
            imageId = R.drawable.challenger;
            divisionImage.setImageResource(imageId);
            Division = "Biały Wilk";
        }

    }

    private void User() {
        TextView userNameTextView = (TextView) findViewById(R.id.UserName);
        TextView userLeaguePoints = (TextView) findViewById(R.id.LeaguePoints);

        userNameTextView.setText(userName);
        userLeaguePoints.setText(Division + " " + RealLeaguePoints + " " + "Pkt.");
    }

    public void onClickOpenRank(View view) {

        Intent intent = new Intent(MainActivity.this, BoardActivity.class);
        startActivity(intent);

        TestConnetionWithFirebase();

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

                        System.out.println("KURWA JEBANA MAC + " + userName + " " + idNumber);


                        Readhp();
                        Division();
                        User();
                        saveHpAndBoosts();
                    } else {

                        Person person = new Person(userName, R.drawable.bronze, "Dziecko Niespodzianka", 0, 0, 5, 0, 0, 1, idNumber);
                        firebaseDatabase.getReference().child("users").child(id).setValue(person);

                        ImageView divisionImage = (ImageView) findViewById(R.id.division);
                        divisionImage.setImageResource(R.drawable.bronze);
                        Division = "Dziecko Niespodzianka";
                        imageId = R.drawable.bronze;
                        Connection =1;

                        System.out.println("KURWA JEBANA MAC + " + userName + " " + idNumber);

                        Readhp();
                        User();

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

    private void Readhp() {
        firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Person person1 = dataSnapshot.getValue(Person.class);
                hp = person1.hp;
                LpDeff = person1.LpDeff;
                LpBoost = person1.LpBoost;

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
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        ReadOrInitFromFirebase();
        if (!UpdateHpService.running)
        {
            startMyService();
        }
        loadAd();
    }

    private void saveHpAndBoosts() {
        firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                    Person person = new Person(userName, imageId, Division, LeaguePoints, RealLeaguePoints, hp, LpDeff, LpBoost, Connection,idNumber);
                    firebaseDatabase.getReference().child("users").child(id).setValue(person);

                    TextView textView = (TextView) findViewById(R.id.hp_number);
                    textView.setText(hp + " wigoru");


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });
    }

    private void loadAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "cca-app-pub-6555234985187895/1852324872",
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
            Activity activityContext = MainActivity.this;
            mRewardedAd.show(activityContext, new OnUserEarnedRewardListener() {
                @Override
                public void onUserEarnedReward(@NonNull RewardItem rewardItem) {
                    hp = hp + 5;
                    saveHpAndBoosts();
                    ImageButton imageButton = (ImageButton) findViewById(R.id.hp);
                    imageButton.setBackgroundResource(R.drawable.hp5);
                }
            });
        } else {
            Log.d("TAG", "The rewarded ad wasn't ready yet.");
        }

    }

    public void OnClickShowMessageAboutHp(View view) {
        Toast toast = Toast.makeText(MainActivity.this, "W celu resetu wigoru nacisnij reklamę", Toast.LENGTH_SHORT);
        toast.show();
    }

    private void ResetScore() {

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONS", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSGAME1", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSGAME2", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }
        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSGAME3", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK1", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK2", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK3", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK4", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK5", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK6", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK7", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

        try {
            SQLiteOpenHelper questionDatabaseHelper = new QuestionsDatabaseHelper(this);
            SQLiteDatabase db = questionDatabaseHelper.getReadableDatabase();

            ContentValues ResetScore = new ContentValues();
            ResetScore.put("SCORE", 0);

            db.update("QUESTIONSBOOK8", ResetScore, "SCORE = ?", new String[]{Integer.toString(1)});
            db.close();
        } catch (SQLiteException e) {
            Toast toast = Toast.makeText(this, "Błąd", Toast.LENGTH_LONG);
            toast.show();
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();



        switch (id) {
            case R.id.hp50:
                Intent intent = new Intent(MainActivity.this, CheckoutActivity.class);
                intent.putExtra(CheckoutActivity.ammount, "500");
                intent.putExtra(CheckoutActivity.ammountId, 1);
                startActivity(intent);
                //  Add50Hp();
                break;
            case R.id.hp150:
                Intent intent1 = new Intent(MainActivity.this, CheckoutActivity.class);
                intent1.putExtra(CheckoutActivity.ammount, "1000");
                intent1.putExtra(CheckoutActivity.ammountId, 2);
                startActivity(intent1);
                //   Add150Hp();
                break;
            case R.id.hpFull:
                Intent intent2 = new Intent(MainActivity.this, CheckoutActivity.class);
                intent2.putExtra(CheckoutActivity.ammount, "2000");
                intent2.putExtra(CheckoutActivity.ammountId, 3);
                startActivity(intent2);
                // AddFullhp();
                break;
            case R.id.LpBoost10:
                Intent intent3 = new Intent(MainActivity.this, CheckoutActivity.class);
                intent3.putExtra(CheckoutActivity.ammount, "500");
                intent3.putExtra(CheckoutActivity.ammountId, 4);
                startActivity(intent3);
                // Add10LpBoost();
                break;
            case R.id.LpBoost25:
                Intent intent4 = new Intent(MainActivity.this, CheckoutActivity.class);
                intent4.putExtra(CheckoutActivity.ammount, "1000");
                intent4.putExtra(CheckoutActivity.ammountId, 5);
                startActivity(intent4);
                //  Add25LpBoost();
                break;
            case R.id.LpDeff10:
                Intent intent5 = new Intent(MainActivity.this, CheckoutActivity.class);
                intent5.putExtra(CheckoutActivity.ammount, "500");
                intent5.putExtra(CheckoutActivity.ammountId, 6);
                startActivity(intent5);
                //   Add10LpDeff();
                break;
            case R.id.LpDeff25:
                Intent intent6 = new Intent(MainActivity.this, CheckoutActivity.class);
                intent6.putExtra(CheckoutActivity.ammount, "1000");
                intent6.putExtra(CheckoutActivity.ammountId, 7);
                startActivity(intent6);
                //   Add25LpDeff();
                break;


        }


        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    private void TestConnetionWithFirebase() {
        if (Connection ==1)
        {

        }
        else
        {
            Toast.makeText(MainActivity.this, "Brak połączenia z internetem", Toast.LENGTH_SHORT).show();
        }

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
            Toast.makeText(MainActivity.this, "Błąd z bazą danych", Toast.LENGTH_SHORT).show();

        }
    }

    public void showAlertDialogButtonClicked(View view) {


        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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


        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
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
