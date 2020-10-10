import adapter.example.*;

public class Adapter {

    public static void main(String[] args) {

        MediaPlayer player = new Mp3();

        System.out.println( "Play " + player.play("ABBA-Waterloo.mp3" ) +
                " in playlist: " + player.toString() );

        player = new FormatAdapter(new Mp4());
        System.out.println( "Play " + player.play("Queen-We're_the_champions.mp3" ) );

        player = new FormatAdapter(new Vlc());
        System.out.println( "Play as: " +
                player.play("The-Hobbit-An_Unexpected_Journey_[DVD].avi" ).toUpperCase() );

    }

}
