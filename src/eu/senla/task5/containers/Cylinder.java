package eu.senla.task5.containers;

public class Cylinder extends Container{
    private double weight;

    public Cylinder(boolean isBig, int height, int density) {
        super(isBig, height, density);
    }

    @Override
    public double getWeight() {
        if(isBig) {
            weight = 3.14*height*20*20;
        } else {
            weight = 3.14*height*10*10;
        }
        return weight;
    }
}
