package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	    FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
     //   adelaideCrows.addPlayer(pat);
     //    adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> chicagoCubs = new Team<>("Chicago Cubs");
        chicagoCubs.addPlayer(pat);

//        Team<String> brokenTeam = new Team<>("This wont work");
//        brokenTeam.addPlayer("no one");

        Team<SoccerPlayer> chelsea = new Team<>("Chelsea");
        chelsea.addPlayer(beckham);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle , 10,10);
        hawthorn.matchResult(fremantle,20,10);
        hawthorn.matchResult(fremantle,10,20);

        System.out.println("Rankings ");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(chelsea.getName() + ": " + chelsea.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());

        System.out.println(adelaideCrows.compareTo(fremantle));
        System.out.println(hawthorn.compareTo(fremantle));
        System.out.println(fremantle.compareTo(adelaideCrows));

    }

}
