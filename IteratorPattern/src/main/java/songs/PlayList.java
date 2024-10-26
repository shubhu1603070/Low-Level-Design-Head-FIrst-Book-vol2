package songs;

import iterator.Iterator;
import iterator.MyPlaylistIterator;

import java.util.ArrayList;
import java.util.List;

public class PlayList implements SongsIterator{

    List<String> songs = new ArrayList<>();

    public void addSongs(String songName){
        songs.add(songName);
    }

    @Override
    public Iterator createSongIterator() {
        return new MyPlaylistIterator(this.songs);
    }
}
