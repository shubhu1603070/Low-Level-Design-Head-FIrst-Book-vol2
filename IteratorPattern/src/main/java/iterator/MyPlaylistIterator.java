package iterator;

import java.util.ArrayList;
import java.util.List;

public class MyPlaylistIterator implements Iterator{

    List<String> songs = new ArrayList<>();
    int index = 0;

    public MyPlaylistIterator(List<String> songs){
        this.index = 0;
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return this.songs.size() > index;
    }

    @Override
    public String next() {
        return hasNext() ? this.songs.get(index++) : "Playlist ended";
    }
}
