package com.mihajlo;

import com.mihajlo.model.Artist;
import com.mihajlo.model.Datasource;
import com.mihajlo.model.SongArtist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Can't open datasource");
            return;
        }
        List<Artist> artistList = datasource.queryArtists(Datasource.ORDER_BY_NONE);
        if (artistList == null) {
            System.out.println("No artists!");
            return;
        }
        for (Artist artist : artistList){
            System.out.println("ID = " +artist.getId() + ", Name = " + artist.getName());
        }

        List<String> albumsForArtist =
                datasource.queryAlbumsForArtist("Carole King", Datasource.ORDER_BY_DESC);
        for (String album : albumsForArtist){
            System.out.println(album);
        }

        List<SongArtist> songArtistList = datasource.queryArtistsForSong("Go Your Own Way" , Datasource.ORDER_BY_DESC);
        if(songArtistList == null){
            System.out.println("Couldn't find the artist for the song");
            return;
        }
        for (SongArtist artist : songArtistList){
            System.out.println("Artist name = " + artist.getArtistName() +
                    " Album Name = " + artist.getAlbumName() +
                    " Track = " + artist.getTrack());
        }

        datasource.querySongsMetaData();

        int count = datasource.getCount(Datasource.TABLE_SONGS);
        System.out.println(count);
        datasource.createViewForSongArtists();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sont title: ");
        String title = scanner.nextLine();

        songArtistList = datasource.querySongInfoView(title);
        if (songArtistList.isEmpty()){
            System.out.println("Couldn't find artist");
            return;
        }
        for(SongArtist artist: songArtistList){
            System.out.println("FROM VIEW - Artist name = " + artist.getArtistName()+
                    " Album name = " + artist.getAlbumName() +
                    " Track Number = " + artist.getTrack());
        }

        datasource.insertSong("Touch of Gray" , "Grateful Dead" , "In The Dark" , 1);
        datasource.insertSong("Like A Rolling Stone" , "Bob Dylan" , "Bob Dylan's Greatest Hits" , 5);

        datasource.close();
    }
}
