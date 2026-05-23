import java.util.ArrayList;

public class PlaylistManager {

    ArrayList<Song> playlist = new ArrayList<>();

    public void addSong(Song song) {
        playlist.add(song);
        System.out.println(song.getTitle() + " added to playlist");
    }

    public void removeSong(Song song) {
        playlist.remove(song);
        System.out.println(song.getTitle() + " removed from playlist");
    }

    public void showPlaylist() {

        System.out.println("Playlist Songs:");

        for (Song s : playlist) {
            System.out.println(s.getTitle() + " - " + s.getArtist());
        }
    }
}