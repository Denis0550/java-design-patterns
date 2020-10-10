package prototype.example;

public abstract class Color implements Cloneable {

    protected String colorName;

    public abstract void addColor();

    @Override
    public Object clone() {

        System.out.println( "Cloning::" + this.getClass() + " of " + colorName );
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
