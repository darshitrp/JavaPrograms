package com.darshitpanchal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Stormbringer","Deep purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Holy Man",4.3);
        album.addSong("Hold On",5.6);
        album.addSong("High ball shooter",4.27);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock",5.66);
        album.addSong("Lets go",3.25);
        album.addSong("C.O.D",5.25);
        album.addSong("Evil walks",3.45);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Hold On",playList);
        albums.get(0).addToPlayList("High ball shooter",playList);
        albums.get(0).addToPlayList("Speed king",playList); // Does not exist
        albums.get(0).addToPlayList(1, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(4, playList);
        albums.get(1).addToPlayList(50, playList); // Does not exist

        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist.");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
    }
}