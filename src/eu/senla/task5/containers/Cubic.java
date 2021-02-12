package eu.senla.task5.containers;

public class Cubic extends Container{
    private double weight;

    public Cubic(boolean isBig, int height, int density) {
        super(isBig, height, density);
    }

    @Override
    public double getWeight() {
        if(isBig) {
            weight = (20*20/2)*height;
        } else {
            weight = (10*10/2)*height;
        }
        return weight;
    }
}
