import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s() {
        bestSongs = new ArrayList<SongInfo>();

        addSongs("Imagine", "John Lennon", 1971);
        addSongs("American Pie", "Don McLean", 1971);
        addSongs("I Will Survive", "Gloria Gaynor", 1979);
    }

    public void addSongs(String songName, String bandName, int yearReleased) {
        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);
    }

    // public ArrayList<SongInfo> getBestSongs() {
    // return bestSongs;
    // }

    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}