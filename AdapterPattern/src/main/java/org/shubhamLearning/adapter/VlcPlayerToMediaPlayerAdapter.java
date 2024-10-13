package org.shubhamLearning.adapter;

import org.shubhamLearning.adaptee.VlcPlayer;
import org.shubhamLearning.adaptee.WavPlayer;
import org.shubhamLearning.target.MedialPlayer;

public class VlcPlayerToMediaPlayerAdapter implements MedialPlayer {

    private final VlcPlayer vlcPlayer;

    public VlcPlayerToMediaPlayerAdapter(VlcPlayer vlcPlayer) {
        this.vlcPlayer = vlcPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            vlcPlayer.playVlcFile(fileName);
        }else{
            System.out.println("Unsupported file : "+fileName);
        }
    }
}
