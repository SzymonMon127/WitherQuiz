package com.sm.witherquiz.RankBoard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sm.witherquiz.ObjectAndAdapters.CaptionedImagesAdapter;
import com.sm.witherquiz.ObjectAndAdapters.Person;
import com.sm.witherquiz.R;

import java.util.ArrayList;


public class BoardFragment extends Fragment {

    private FirebaseDatabase firebaseDatabase;
    int size;
    int sizeBigger;
    RecyclerView boardRecyclerView;
    private  int LeaguePoints;
    private int RealLp5;



    public BoardFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,Bundle savedInstanceState) {
        firebaseDatabase = FirebaseDatabase.getInstance();

        boardRecyclerView =(RecyclerView)inflater.inflate(R.layout.fragment_board, container, false);

        firebaseDatabase.getReference().child("users").orderByChild("LeaguePoints").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                size = (int) dataSnapshot.getChildrenCount();




                if (size <100)
                {
                    ArrayList<String> cityList = new ArrayList<>();

                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList.add(newPerson.name.toString());
                    }

                    ArrayList<String> cityList2 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList2.add(newPerson.Division.toString());

                    }

                    ArrayList<String> cityList3 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList3.add(String.valueOf(newPerson.RealLeaguePoints));
                    }

                    ArrayList<Integer> cityList4 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList4.add(newPerson.imageId);
                    }

                    ArrayList<Integer> cityList5 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList5.add(newPerson.LeaguePoints);
                    }


                    String[] position = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        position[i] = String.valueOf(i+1 +".");
                    }

                    String[] name = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        name[i] = cityList.get(size-1 -i);
                    }

                    int[] imageId = new int[size];


                    String[] divison = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        divison[i] = cityList2.get(size-1 -i);
                    }
                    String[] Lp = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        Lp[i] = cityList3.get(size-1 -i) + " " + "Lp";
                    }

                    int[] RealLp = new int[size];
                    for ( int i=0; i < size; i++)
                    {
                        RealLp[i] = cityList5.get(size-1 -i);
                    }

                    for (int i=0; i<size; i++)
                    {
                        RealLp5 = RealLp[i];
                        LeaguePoints = RealLp5;

                        if (LeaguePoints <=100)
                        {
                            imageId[i] = R.drawable.bronze;
                        }
                        if (LeaguePoints > 100 && (LeaguePoints<200 || LeaguePoints==200))
                        {
                            imageId[i] =  R.drawable.silver;
                        }
                        if (LeaguePoints > 200 && (LeaguePoints<300 || LeaguePoints==300))
                        {
                            imageId[i] =  R.drawable.gold;
                        }
                        if (LeaguePoints > 300 && (LeaguePoints<400 || LeaguePoints==400))
                        {
                            imageId[i] =  R.drawable.master;
                        }
                        if (LeaguePoints > 400)
                        {
                            imageId[i] =  R.drawable.challenger;
                        }
                    }





                    CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(position,name, imageId, divison, Lp);
                    boardRecyclerView.setAdapter(adapter);
                    LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                    boardRecyclerView.setLayoutManager(layoutManager);
                }

                else
                {
                    sizeBigger =100;
                    ArrayList<String> cityList = new ArrayList<>();

                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList.add(newPerson.name.toString());
                    }

                    ArrayList<String> cityList2 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList2.add(newPerson.Division.toString());

                    }

                    ArrayList<String> cityList3 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList3.add(String.valueOf(newPerson.RealLeaguePoints));
                    }

                    ArrayList<Integer> cityList4 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList4.add(newPerson.imageId);
                    }

                    ArrayList<Integer> cityList5 = new ArrayList<>();
                    for (DataSnapshot postSnapshot : dataSnapshot.getChildren()){
                        Person newPerson = postSnapshot.getValue(Person.class);
                        cityList5.add(newPerson.LeaguePoints);
                    }

                    String[] position = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        position[i] = String.valueOf(i+1 +".");
                    }

                    String[] name1 = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        name1[i] = cityList.get(size-1 -i);
                    }


                    String[] divison1 = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        divison1[i] = cityList2.get(size-1 -i);
                    }
                    String[] Lp1 = new String[size];
                    for ( int i=0; i < size; i++)
                    {
                        Lp1[i] = cityList3.get(size-1 -i) + " " + "Lp";
                    }

                    int[] RealLp1 = new int[size];
                    for ( int i=0; i < size; i++)
                    {
                        RealLp1[i] = cityList5.get(size-1 -i);
                    }

                    String[] name = new String[sizeBigger];
                    for ( int i=0; i < sizeBigger; i++)
                    {
                        name[i] = name1[i];
                    }

                    int[] imageId = new int[sizeBigger];



                    String[] divison = new String[sizeBigger];
                    for ( int i=0; i < sizeBigger; i++)
                    {
                        divison[i] = divison1[i];
                    }
                    String[] Lp = new String[sizeBigger];
                    for ( int i=0; i < sizeBigger; i++)
                    {
                        Lp[i] = Lp1[i];
                    }

                    int[] RealLp = new int[sizeBigger];
                    for ( int i=0; i < sizeBigger; i++)
                    {
                        RealLp[i] = RealLp1[i];
                    }

                    for (int i=0; i<sizeBigger; i++)
                    {
                        RealLp5 = RealLp[i];
                        LeaguePoints = RealLp5;

                        if (LeaguePoints <=100)
                        {
                            imageId[i] = R.drawable.bronze;
                        }
                        if (LeaguePoints > 100 && (LeaguePoints<200 || LeaguePoints==200))
                        {
                            imageId[i] = R.drawable.silver;
                        }
                        if (LeaguePoints > 200 && (LeaguePoints<300 || LeaguePoints==300))
                        {
                            imageId[i] = R.drawable.gold;
                        }
                        if (LeaguePoints > 300 && (LeaguePoints<400 || LeaguePoints==400))
                        {
                            imageId[i] =  R.drawable.master;
                        }
                        if (LeaguePoints > 400)
                        {
                            imageId[i] =  R.drawable.challenger;
                        }
                    }


                    CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(position,name, imageId, divison, Lp);
                    boardRecyclerView.setAdapter(adapter);


                    LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());
                    boardRecyclerView.setLayoutManager(layoutManager);

                }





            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }








        });










        return boardRecyclerView;

    }


}