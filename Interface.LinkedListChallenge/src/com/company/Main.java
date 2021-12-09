package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer" , "Deep purple");
        album.addSong("Stormbringer" , 4.6);
        album.addSong("hold on" , 3.4);
        album.addSong("The gypsy" , 4.1);
        album.addSong("Lady double dealer" , 4.13);
        album.addSong("you cant do it right" , 4.23);
        album.addSong("high ball shooter" , 7.43);
        albums.add(album);


        album =new Album("For those about ot rock","AC/DC");
        album.addSong("rock" , 4.23);
        album.addSong("For  rock" , 5.21);
        album.addSong("For  ot rock" , 7.21);
        album.addSong("For those about " , 2.24);
        album.addSong("For those about ock" , 3.23);
        album.addSong("For those about " , 1.24);
        album.addSong("For" , 1.24);
        albums.add(album);


       List<Song> playlist = new ArrayList<Song>();
        albums.get(0).addToPlayList("Lady double dealer",playlist);
        albums.get(0).addToPlayList("The gypsy",playlist);
        albums.get(0).addToPlayList("you cant do it right",playlist);
        albums.get(0).addToPlayList("hold on",playlist);
        albums.get(0).addToPlayList(1,playlist);
        albums.get(0).addToPlayList("speed king",playlist);

        albums.get(1).addToPlayList(1,playlist);
        albums.get(1).addToPlayList(2,playlist);
        albums.get(1).addToPlayList(4,playlist);
        albums.get(1).addToPlayList(6,playlist);
        albums.get(1).addToPlayList(10,playlist);

        play(playlist);

    }

    private static void play(List<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }else
                    {
                        System.out.println("You have reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                        System.out.println("Now replaying " + listIterator.previous().toString());
                        forward = false;
                        }else{
                            System.out.println("we are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size() > 0) {
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions: \n press" +
                "0- to quit\n" +
                "1- next song\n" +
                "2- previous song\n" +
                "3- replay song\n" +
                "4- list songs\n" +
                "5- print menu");
    }
    private static void printList(List<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("============================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=============================");
    }
}
