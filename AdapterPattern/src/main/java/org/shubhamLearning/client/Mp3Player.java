package org.shubhamLearning.client;

import org.shubhamLearning.target.MedialPlayer;

public class Mp3Player implements MedialPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing .mp3 file : "+fileName);
        }else{
            System.out.println("Unsupported file : "+fileName);
        }
    }
}
