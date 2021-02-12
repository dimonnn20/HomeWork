package eu.senla.task5;

public class Port {
    private int maxShipsNumber = 0;
    private int shipCounter = 0;
    private double portResultWeight = 0;
    private Ship [] ships;

    public Port (int maxShipsNumber) {
        this.maxShipsNumber = maxShipsNumber;
        ships = new Ship [maxShipsNumber];
        System.out.println("Port of "+ maxShipsNumber + " ships is created. Please add ships");
    }
    public boolean add (Ship ship) {
        if (shipCounter < ships.length) {
            ships [shipCounter] = ship;
            portResultWeight +=ship.getShipResultWeight();
            shipCounter++;
            System.out.println("Ship - "+ ship.getShipName()+ " - with " + ship.getShipResultWeight()+ " of water is added to the port");
            return true;
        } else {
            System.out.println("Reached maximum number of ships for the port");
            return false;
        }
    }
    public boolean remove () {
        if (shipCounter > 0) {
            shipCounter--;
            portResultWeight -= ships[shipCounter].getShipResultWeight();
            System.out.println ("Ship - "+ships[shipCounter].getShipName()+" - with "+ ships[shipCounter].getShipResultWeight() + " is removed");
            ships [shipCounter] = null;
            return true;
        } else {
            System.out.println("No ship to remove");
            return false;
        }
    }
    public double getPortResultWeight () {
        return portResultWeight;
    }
}
