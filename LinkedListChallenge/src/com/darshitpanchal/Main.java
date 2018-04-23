package com.darshitpanchal;

import java.util.*;

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
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist.");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("PlayList complete.");
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
                    }else{
                        System.out.println("We have reached the end of the playlist.");
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
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We have reached the start of the playlist.");
                        forward = true;
                    }
                    break;

                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list.");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We are at the end of the list.");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else{
                            if(listIterator.hasPrevious()){
                                System.out.println("Now playing " + listIterator.previous());
                            }
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\nPress");
        System.out.println("0 - To quit\n" +
                "1 - To play next song\n" +
                "2 - To play previous song\n" +
                "2 - To play previous song\n" +
                "3 - To replay current song\n" +
                "4 - List songs in playlist\n" +
                "5 - Print Menu\n" +
                "6 - Delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=======================");
    }

}