package com.sm.witherquiz.RankBoard;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.facebook.AccessToken;
import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.ObjectAndAdapters.CaptionedImagesAdapter;
import com.sm.witherquiz.ObjectAndAdapters.Person;
import com.sm.witherquiz.R;
import com.sm.witherquiz.Login.SignInActivity;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BoardUserRankFragment extends Fragment {

    private FirebaseDatabase firebaseDatabase;
    RecyclerView boardRecyclerView;
    private String userName;
    int size;
    private String userName1;
    private int rank;
    private FirebaseAuth firebaseAuth;
    private String FirebaseEmail;
    private String[] name = new String[1];
    private String[] divisionTable = new String[1];
    private String[] lpTable = new String[1];
    private String[] rankTable = new String[1];
    private int[] imageId = new int[1];
    private int lp;
    private int LeaguePoints;
    private String divison;
    String[] name1;
    private String id;
    private String idNumber;

    ArrayList<String> cityList;

    public BoardUserRankFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        firebaseDatabase = FirebaseDatabase.getInstance();

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        cityList = new ArrayList<>();


        firebaseDatabase = FirebaseDatabase.getInstance();

        boardRecyclerView =(RecyclerView)inflater.inflate(R.layout.fragment_board_user_rank, container, false);

        if (firebaseAuth.getInstance().getCurrentUser() != null) {

            getNameAndId();
            name[0] = userName;
            LoadRank();
                firebaseDatabase.getReference().child("users").child(id).addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {


                        Person newPerson = dataSnapshot.getValue(Person.class);
                        lp = newPerson.RealLeaguePoints;
                        divison = newPerson.Division;
                        LeaguePoints = newPerson.LeaguePoints;


                        if (LeaguePoints <= 100) {

                            imageId[0] = R.drawable.bronze;

                        }
                        if (LeaguePoints > 100 && (LeaguePoints < 200 || LeaguePoints == 200)) {

                            imageId[0] = R.drawable.silver;

                        }
                        if (LeaguePoints > 200 && (LeaguePoints < 300 || LeaguePoints == 300))
                        {

                            imageId[0] = R.drawable.gold;

                        }
                        if (LeaguePoints > 300 && (LeaguePoints<400 || LeaguePoints==400))
                        {
                            imageId[0] =  R.drawable.master;
                        }
                        if (LeaguePoints > 400)
                        {
                            imageId[0] =  R.drawable.challenger;
                        }

                        LoadRank();

                        lpTable[0] = String.valueOf(lp + " Lp");
                        divisionTable[0] = divison;

                        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(rankTable, name, imageId, divisionTable, lpTable);
                        boardRecyclerView.setAdapter(adapter);
                        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                        boardRecyclerView.setLayoutManager(layoutManager);

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });




        }
        else
        {
            goToLogin();
        }







        return boardRecyclerView;
    }



    private void LoadRank()
    {
        firebaseDatabase.getReference().child("users").orderByChild("LeaguePoints").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                size = (int) dataSnapshot.getChildrenCount();



                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                    Person newPerson = postSnapshot.getValue(Person.class);
                    cityList.add(String.valueOf(newPerson.name));
                }

                name1 = new String[size];
                for ( int i=0; i < size; i++)
                {
                    name1[i] = cityList.get(size-1 -i);
                }

                for ( int i =0; i <size; i++)
                {
                    userName1 = name1[i];
                    if (userName1.equals(userName)) {

                        rank = i + 1;
                        rankTable[0] = (rank+".");
                    }
                }





            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


    private void goToLogin() {

        Toast toast = Toast.makeText(getContext(), "Brak połączenia z internetem", Toast.LENGTH_LONG);
        LoginManager.getInstance().logOut();
        AccessToken.setCurrentAccessToken(null);
        toast.show();
        Intent intent = new Intent(getContext(), SignInActivity.class);
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
