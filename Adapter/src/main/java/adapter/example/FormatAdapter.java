package adapter.example;

public class FormatAdapter extends MediaPlayer implements MediaPlayable {

    private MediaPackage mediaPackage;

    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    /**
     * System.out.print("Using java_patterns.singleton.adapter ==> ");
     *
     * @param file filename of playing file
     * @return postfix of filename
     */
    @Override
    public String play(String file) {

        System.out.println( "Original file: " + file );
        return mediaPackage.playFile(file);
    }
}
