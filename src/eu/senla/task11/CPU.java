package eu.senla.task11;

public class CPU {
    private String model;
    private double frequency;

    public CPU (String model, double frequency) {
        this.model = model;
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "model='" + model + '\'' +
                ", frequency=" + frequency +
                '}';
    }
    public String getModel () {
        return model;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public double getfrequency () {
        return frequency;
    }
    public void setFrequency (double frequency) {
        this.frequency = frequency;
    }

}
