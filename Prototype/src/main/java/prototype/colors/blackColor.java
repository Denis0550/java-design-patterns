package prototype.colors;

import prototype.example.Color;

import static prototype.example.ColorStore.COLORS.orange;

public class blackColor extends Color {

    public blackColor()
    {
        this.colorName = orange.name();
    }

    @Override
    public void addColor() {
        System.out.println( String.format( "%s color added",
                this.colorName.toUpperCase() ));
    }
}
