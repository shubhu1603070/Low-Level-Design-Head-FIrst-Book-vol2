package org.shubhamLearning.adapter;

import org.shubhamLearning.adaptee.WavPlayer;
import org.shubhamLearning.target.MedialPlayer;

public class WabPlayerToMediaPlayerAdapter implements MedialPlayer {

    private final WavPlayer wavPlayer;

    public WabPlayerToMediaPlayerAdapter(WavPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("wav")){
            wavPlayer.playWavFile(fileName);
        }else{
            System.out.println("Unsupported file : "+fileName);
        }
    }
}
