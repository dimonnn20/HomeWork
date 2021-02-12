package eu.senla.task5.containers;

public abstract class Container {
    private final int WATER_DENSITY_1 = 1000;
    private final int WATER_DENSITY_2 = 2000;
    private int currentDensity;
    public int height;
    boolean isBig;

    public abstract double getWeight ();

    public Container (boolean isBig, int height, int density) {
        this.isBig = isBig;
        if (height > 10 || height <100) {
            this.height = height;
        } else {
            System.out.println("Height is too big");
        }
        if (density == 1000 || density == 2000) {
            this.currentDensity = density;
        } else {
            System.out.println("Density must be 1000 or 2000");
        }
    }

}
