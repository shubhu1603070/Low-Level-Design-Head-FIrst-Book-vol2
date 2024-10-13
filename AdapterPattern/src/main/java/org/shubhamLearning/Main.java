package org.shubhamLearning;

import org.shubhamLearning.adaptee.VlcPlayer;
import org.shubhamLearning.adaptee.WavPlayer;
import org.shubhamLearning.adapter.VlcPlayerToMediaPlayerAdapter;
import org.shubhamLearning.adapter.WabPlayerToMediaPlayerAdapter;
import org.shubhamLearning.client.Mp3Player;
import org.shubhamLearning.target.MedialPlayer;

public class Main {
    public static void main(String[] args) {
        MedialPlayer mp3MediaPlayer = new Mp3Player();
        mp3MediaPlayer.play("mp3","abc.mp3");
        mp3MediaPlayer.play("wav","test.wav");

        //Now we see wavMediaPlayer have method called playWavFile but when called play we're able to play the wavMediaPlayer also
        mp3MediaPlayer = new WabPlayerToMediaPlayerAdapter(new WavPlayer());
        mp3MediaPlayer.play("wav","def.wav");

        //Now we see vlcMediaPlayer have method called playWavFile but when called play we're able to play the vlcMediaPlayer also
        mp3MediaPlayer = new VlcPlayerToMediaPlayerAdapter(new VlcPlayer());
        mp3MediaPlayer.play("vlc","ghi.wav");


        /*
            Target : Here is MediaPlayer bcuz we're building mediaPlayer which supports mp3, but we have legacy code also which needs to be supported

            Adaptee : Classes which needs adapter to be converted into the Target
                      We have two adaptee classes .wavPlayer and .vlcPlayer they both are like legacy code

            Adapter : Two Adapter
                One to convert .wavPlayer into MediaPlayer
                Second to convert .vlcPlayer into MediaPlayer

            Concrete implementation of MediaPlayer for .mp3 file

            Client : Client Code that uses the Target Interface for eg: MediaPlaying application which is using MediaPlayer (Target)
            
         */


    }
}