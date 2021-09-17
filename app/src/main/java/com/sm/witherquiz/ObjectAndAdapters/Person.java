package com.sm.witherquiz.ObjectAndAdapters;

public class Person {

    public String name;
    public int imageId;
    public String Division;
    public int LeaguePoints;
    public int RealLeaguePoints;
    public int hp;
    public int LpDeff;
    public int LpBoost;
    public  int Connection;
    public String id;



    public Person() {
    }




    public Person(String name, int imageId, String division, int leaguePoints, int realLeaguePoints, int hp, int lpDeff, int lpBoost, int connection, String id) {
        this.name = name;
        this.imageId = imageId;
        Division = division;
        LeaguePoints = leaguePoints;
        RealLeaguePoints = realLeaguePoints;
        this.hp = hp;
        LpDeff = lpDeff;
        LpBoost = lpBoost;
        Connection = connection;
        this.id = id;
    }


}
