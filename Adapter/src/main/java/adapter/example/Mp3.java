package adapter.example;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Mp3 extends MediaPlayer implements MediaPlayable, MediaPackage {

    static final protected String mp3 = "mp3";

    /**
     * System.out.printf("Playing MP3 file: %s %n", file);
     *
     * @param file filename of file
     * @return postfix of file
     */
    @Override
    public String play(String file) {

        System.out.printf("Request to play as %s file: %s%n", mp3, file);

        String[] strings = file.split(Pattern.quote("."));
        allMedia = new String[] { file };

        return strings[1];
    }

    @Override
    public String toString() {
        return Arrays.asList( super.allMedia ).toString();
    }

    @Override
    public String playFile(String filename) {
        return play(filename);
    }
}
