package prototype.colors;

import prototype.example.Color;

public class blueColor extends Color {

    public blueColor() {
        this.colorName = "blue";
    }

    @Override
    public void addColor() {
        System.out.println("Blue color added");
    }

}
