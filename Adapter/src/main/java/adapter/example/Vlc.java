package adapter.example;

import java.util.regex.Pattern;
import org.apache.commons.lang3.NotImplementedException;

public class Vlc implements MediaPackage {

    static final protected String avi = "avi";

    /**
     * System.out.printf("Playing Vlc file: %s%n", filename);
     *
     * @param filename filename of playing file
     * @return postfix of filename
     */
    @Override
    public String playFile(String filename) {

        System.out.printf("Request to play as %s file: %s%n", avi, filename);

        String[] strings = filename.split(Pattern.quote("."));
        return strings[1];
    }

    public String convertFile(String filename) {
        throw new NotImplementedException("[Conversion for AVI is not implemented or not needed.]");
    }
}
