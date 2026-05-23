public class MusicPlayerSystem {

    public static void main(String[] args) {

        System.out.println("Music Player Application Started");

        DatabaseConnection.connect();

        MusicPlayer player = new MusicPlayer();

        player.playSong("Shape of You");

        player.pauseSong();

        player.stopSong();

        Song s1 = new Song(1, "Believer", "Imagine Dragons");
        Song s2 = new Song(2, "Perfect", "Ed Sheeran");

        PlaylistManager playlist = new PlaylistManager();

        playlist.addSong(s1);
        playlist.addSong(s2);

        playlist.showPlaylist();

        playlist.removeSong(s1);

        playlist.showPlaylist();
    }
}