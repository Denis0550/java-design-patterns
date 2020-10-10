package prototype.example;

import prototype.colors.blackColor;
import prototype.colors.blueColor;
import prototype.colors.whiteColor;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {

    public enum COLORS {
        blue,
        orange,
        white
    }

    // Create color map once - throughout the application
    private static final Map<String, Color> colorMap = new HashMap<>();

    // Run once as static in a class
    static {
        colorMap.put( COLORS.blue.name(), new blueColor() );
        colorMap.put( COLORS.orange.name(), new blackColor() );
        colorMap.put( COLORS.white.name(), new whiteColor() );
    }

    public static Color getColor(String colorName) {
        return (Color) colorMap.get(colorName).clone();
    }
}
