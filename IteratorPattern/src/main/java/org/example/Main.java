package org.example;

import iterator.Iterator;
import songs.PlayList;

public class Main {
    public static void main(String[] args) {

        //Let's say i have created one playlist
        PlayList playList = new PlayList();
        playList.addSongs("Co2 by Bharat Chauhan");
        playList.addSongs("Ghar by Anuv jain");
        playList.addSongs("Baarish by Anuv jain");
        playList.addSongs("Lagaya dil by Sajid Ali");
        playList.addSongs("Jo tum mere ho by Anuv Jain");

        System.out.println("***********************Liked Songs***********************\n");
        Iterator songIterator = playList.createSongIterator();
        while(songIterator.hasNext()){
            System.out.println(songIterator.next());
        }

        /*
            Suppose if i have created one another playlist and want to iterate that too
            what do i have to is to just create the iterator and iterate it without even thinking about the logic of iteration
            Let's say instead of String we had some other objects and each object can have different kind of iterating logic
            So Client can just use the createIterator and sequentially access the objects
            This way we're creating one uniform way for client to iterate
            Also we're encapsulating the logic of iterator so the client don't worry about the logic.
         */
        System.out.println("\n***********************Played recently songs***********************\n");
        Iterator songIterator1 = playList.createSongIterator();
        while(songIterator1.hasNext()){
            System.out.println(songIterator1.next());
        }
    }
}