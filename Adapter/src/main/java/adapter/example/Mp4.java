package adapter.example;

import java.util.regex.Pattern;

public class Mp4 implements MediaPackage {

    static final protected String mp4 = "mp4";

    /**
     * System.out.printf("Playing Mp4 file: %s%n", filename);
     *
     * @param filename filename of playing file
     * @return postfix of file
     */
    @Override
    public String playFile(String filename) {

        System.out.printf("Request to play as %s file: %s%n", mp4, filename);

        String[] strings = filename.split(Pattern.quote("."));

        String convertedFormat = strings[1];
        return ( !convertedFormat.equalsIgnoreCase( mp4 ) ) ?
                convertFile( filename) + " to: " + strings[0] + "." + mp4 : convertedFormat;
    }

    // Do not need to expose
    private String convertFile(String filename) {
/*
        ConvertorOfFiles actual = new ConvertorOfAudioFiles( filename, "mp3", "mp4");
*/
        //TODO: Do actual conversion here.
/*
        actual.convert();
*/
        return "[converted]";
    }
}
