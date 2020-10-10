package prototype;

// A Java program to demonstrate working of
// Prototype Design Pattern with example
// of a ColorStore class to store existing objects.

import prototype.example.Color;
import prototype.example.ColorStore;
import static prototype.example.ColorStore.COLORS.*;
import java.util.ArrayList;

class Prototype {

    public static void main(String[] args) {

        // Orange is new black!

        ColorStore.getColor( blue.name() ).addColor();
        ColorStore.getColor( orange.name() ).addColor();
        ColorStore.getColor( white.name() ).addColor();

        final ArrayList< Color > allColorsCollected = new ArrayList<>();

        allColorsCollected.add( ColorStore.getColor( blue.name() ));
        allColorsCollected.add( ColorStore.getColor( orange.name()) );
        allColorsCollected.add( ColorStore.getColor( white.name()) );

        allColorsCollected.forEach( Color::addColor );
    }
}
