package Behavioural.Iterator.Spotify;

import java.util.*;
import java.util.stream.Collectors;

interface Iterator<T>
{
    boolean hasNext();
    T next();
}
interface Aggregator<T>
{
    void add(T item,boolean isFavourite);
    T remove(int indx);
    Iterator<T> createIterator(String str);
}
class Song<T>
{
    T Genere;
    T name;
    T singer;
    public Song(T genere,T name,T singer)
    {
        this.Genere=genere;
        this.name=name;
        this.singer=singer;
    }
    public String toString()
    {
        String s = "genere :"+Genere+" name :"+name+" singer :"+singer;
        return s;
    }
}
class PlayList<T> implements Aggregator<T>
{
    private List<T> songs ;
    List<T> favoriteSongs;
    List<T> shuffled;
    Map<String,List<T>> generToListofSong;
    public PlayList()
    {
        songs = new ArrayList<>();
        favoriteSongs = new ArrayList<>();
        shuffled = new ArrayList<>();
        generToListofSong = new HashMap<>();
    }

    @Override
    public void add(T item, boolean isFavourite) {
        songs.add(item);

        if(isFavourite)
        {
            favoriteSongs.add(item);
        }
    }

    @Override
    public T remove(int indx) {
        if(indx<songs.size())
        return songs.remove(indx);
        return null;
    }

    @Override
    public Iterator<T> createIterator(String str) {
       return null;
    }
    private class ListIterator implements Iterator<T>
    {
           int cursor=0;
           List<T> clone = new ArrayList<>();
        public ListIterator() {
            clone = new ArrayList<>();
            for (T song : songs) {
                clone.add(song);
            }
        }


        @Override
        public boolean hasNext() {
            return cursor<clone.size();
        }

        @Override
        public T next() {
            if(cursor<clone.size())
                return clone.get(cursor++);
            return null;
        }
    }
    private class ShuffleIterator implements Iterator<T>
    {
        int cursor=0;
        List<T> clone = new ArrayList<>();
        public ShuffleIterator() {
            clone = new ArrayList<>();
            for (T song : songs) {
                clone.add(song);
            }
            Collections.shuffle(clone,new Random());
        }


        @Override
        public boolean hasNext() {
            return cursor<clone.size();
        }

        @Override
        public T next() {
            if(cursor<clone.size())
                return clone.get(cursor++);
            return null;
        }
    }
    private class FavoriteIterator implements Iterator<T>
    {
        int cursor=0;
        List<T> clone = new ArrayList<>();
        public FavoriteIterator() {
            clone = new ArrayList<>();
            for (T song : favoriteSongs) {
                clone.add(song);
            }
        }


        @Override
        public boolean hasNext() {
            return cursor<clone.size();
        }

        @Override
        public T next() {
            if(cursor<clone.size())
                return clone.get(cursor++);
            return null;
        }
    }



}
public class SpotifyIteratorDemo {
    public static void main(String[] args) {
        Song song1 = new Song("a","b","c");
        Song song2 = new Song("a","b","c");
        Song song3 = new Song("a","b","c");
        PlayList<Song> spotifyPlaylist = new PlayList<>();
        spotifyPlaylist.add(song1,true);
        spotifyPlaylist.add(song2,true);
        spotifyPlaylist.add(song3,false);


    }
}
