package adapter.test;

import adapter.example.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FormatAdapterTest {

    @Test
    void testMediaPlayerAdapter() {

        MediaPlayer player = new Mp3();
        assertEquals("mp3", player.play("song.mp3"));

        player = new FormatAdapter(new Mp4());
        assertEquals("mp4", player.play("song.mp4"));

        player = new FormatAdapter(new Vlc());
        assertEquals("avi", player.play("movie.avi"));
    }

    @Test
    void testMediaPlayersWithAdapters() {

        final List<String> allMediaFiles = Arrays.asList("song.mp3", "song.mp4", "movie.avi");

        final ArrayList<MediaPackage> allPlayers = new ArrayList<>();

        allPlayers.add( new Mp3() );
        allPlayers.add( new Mp4() );
        allPlayers.add( new Vlc() );

        allPlayers.forEach( player -> { allMediaFiles.forEach( player::playFile ); } );

    }

}