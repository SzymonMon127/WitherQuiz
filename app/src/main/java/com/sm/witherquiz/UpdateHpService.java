package com.sm.witherquiz;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

import com.facebook.AccessToken;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.ObjectAndAdapters.Person;
import com.sm.witherquiz.Quizes.QuestionsBookFragment;
import com.sm.witherquiz.Quizes.QuizBookActivity;

import org.apache.commons.lang3.StringUtils;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;


/**
 * Created by Thor Odynson on 18.02.2021.
 */
public class UpdateHpService extends Service {

    private Toast toast;
    private Timer timer;
    private TimerTask timerTask;
    private int hp;
    private FirebaseDatabase firebaseDatabase;
    private int LeaguePoints;
    private int RealLeaguePoints;
    private String Division;
    private int imageId;
    private int LpDeff;
    private int LpBoost;
    private FirebaseAuth firebaseAuth;
    private int Connection;
    private String id;
    private String userName;
    private String FirebaseEmail;
    private String  idNumber;

    public static boolean running;
    private class MyTimerTask extends TimerTask {
        @Override
        public void run() {

            try {
                getNameAndId();
                ReadHp();
            }
            catch (Exception e)
            {
                showToast("Chwilowy problem z połączeniem.");
            }

        }
    }

    private void showToast(String text) {
        toast.setText(text);
        toast.show();
    }

    private void writeToLogs(String message) {
        Log.d("HelloServices", message);
        timer = new Timer();
        toast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        firebaseDatabase = FirebaseDatabase.getInstance();
        writeToLogs("Called onCreate() method.");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        writeToLogs("Called onStartCommand() methond");
        clearTimerSchedule();
        initTask();
        timer.scheduleAtFixedRate(timerTask,  300 * 1000, 300 * 1000);
        showToast("Resetowanie wigoru aktywne");
        running = true;
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        writeToLogs("Called onDestroy() method");
        clearTimerSchedule();
        showToast("Your service has been stopped");
        running = false;
        super.onDestroy();
    }



    private void clearTimerSchedule() {
        if(timerTask != null) {
            timerTask.cancel();
            timer.purge();
        }
    }

    private void initTask() {
        timerTask = new MyTimerTask();
    }

    private void ReadHp() {

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
                        hp = newPerson.hp;
                        LpDeff = newPerson.LpDeff;
                        LpBoost = newPerson.LpBoost;

                        if (hp < 5)
                        {
                            hp = hp+1;
                            UpdateHp();
                            showToast("Dodano punkt wigoru");
                        }
                        else
                        {
                            showToast("Wigor odnawia się samoczynnie tylko do 5");
                        }

                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Problem z odnowieniem darmowego wigoru", Toast.LENGTH_LONG).show();
        }


    }

    private void UpdateHp()
    {

        firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                Person person = new Person(userName, imageId, Division, LeaguePoints, RealLeaguePoints, hp, LpDeff, LpBoost, Connection, idNumber);
                firebaseDatabase.getReference().child("users").child(id).setValue(person);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {


            }
        });

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



    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
