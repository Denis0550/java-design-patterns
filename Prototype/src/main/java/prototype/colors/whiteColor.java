package prototype.colors;

import prototype.example.Color;
import prototype.example.ColorStore;

public class whiteColor extends Color {

    public whiteColor()
    {
        this.colorName = ColorStore.COLORS.white.name();
    }

    @Override
    public void addColor() {
        System.out.println("White color added");
    }
}
