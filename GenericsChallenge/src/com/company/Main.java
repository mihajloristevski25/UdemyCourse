package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footballLeague = new League<>("Premier League");

        Team<FootballPlayer> chelsea = new Team<>("Chelsea");
        Team<FootballPlayer> liverpool = new Team<>("Liverpool");
        Team<FootballPlayer> manutd = new Team<>("Manchester United");
        Team<FootballPlayer> mancity = new Team<>("Manchester City");

        chelsea.matchResult(liverpool, 2 ,1);
        manutd.matchResult(mancity,1,3);
        liverpool.matchResult(chelsea,1,2);
        liverpool.matchResult(manutd,2,3);


        footballLeague.add(chelsea);
        footballLeague.add(liverpool);
        footballLeague.add(manutd);
        footballLeague.add(mancity);

        footballLeague.showLeagueTable();

    }
}
