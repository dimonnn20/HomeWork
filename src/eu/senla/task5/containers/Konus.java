package eu.senla.task5.containers;

import eu.senla.task5.containers.Container;

public class Konus extends Container {
    private double weight;

    public Konus(boolean isBig, int height, int density) {
        super(isBig, height, density);
    }

    @Override
    public double getWeight() {
        if(isBig) {
        weight = (3.14*height*100)/3;
        } else {
            weight = (3.14*height*25)/3;
        }
        return weight;
    }
}
