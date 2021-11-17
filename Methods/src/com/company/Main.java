package com.company;

public class Main {

    public static void main(String[] args) {
        
        calculateScore(true , 800,5,100);

        calculateScore(true,10000,8,200);

        int highScore = calculateScoreInt(true,2000,4,200);
        System.out.println("Your final score was "+ highScore);

        int playerHighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Mihajlo" , playerHighScorePosition);

         playerHighScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Stefan" , playerHighScorePosition);

         playerHighScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Mario",playerHighScorePosition);

         playerHighScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Viktor",playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Nikol",playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Dimitar",playerHighScorePosition);

        playerHighScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bojan",playerHighScorePosition);

    }

    public static void displayHighScorePosition(String name , int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int score){
//        if(score >= 1000) {
//            return 1;
//        } else if (score >= 500){
//            return 2;
//        }else if(score >= 100){
//            return 3;
//        }
//
//            return 4;

        int position = 4; // pretpostavuvame deka pos 4 ke bidi vraten ako ne se izvrshat if

        if(score>=1000) {
            position = 1;
        }else if(score >= 500) {
            position = 2;
        }else if(score >= 100); {
            position = 3;
        }
        return position;
    }

    public static void calculateScore(boolean gameOver, int score , int levelCompleted , int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }
    public static int calculateScoreInt(boolean gameOver, int score , int levelCompleted , int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

}
