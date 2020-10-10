package adapter.example;

public abstract class MediaPlayer implements MediaPlayable {

    protected String[] allMedia;

    public abstract String play(String file);

}
