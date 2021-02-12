package eu.senla.task5;

public class Ship {
    double  shipTotalWeight;
    private String name;
    int deckNumber;
    private int deckCounter = 0;
    private double shipResultWeight = 0;
    private Deck [] shipDeck;

    public Ship (int deckNumber) {
        this.deckNumber = deckNumber;
        shipDeck = new Deck[deckNumber];
        System.out.println(deckNumber + " -  deck ship is created. Please add decks");
    }

    public Ship (String name, Deck [] shipDeck) {
        this.name = name;
        this.shipDeck = shipDeck;
        deckCounter = shipDeck.length;
        deckNumber = shipDeck.length;
        for (Deck shd : shipDeck) {
            shipResultWeight += shd.getTotalWeight();
        }
        System.out.println(deckNumber + " - deck ship with " +deckNumber+ " - decks is created");
    }

    public boolean add (Deck shd) {
        if (deckCounter < shipDeck.length ) {
            shipDeck [deckCounter] = shd;
            shipResultWeight += shd.getTotalWeight();
            deckCounter++;
            System.out.println("Deck is added to the ship");
            return true;
        } else {
            System.out.println("Reached maximum decks for the ship");
            return false;
        }
    }
    public boolean remove () {
        if (deckCounter > 0) {
            deckCounter--;
            shipResultWeight-=shipDeck[deckCounter].getTotalWeight();
            shipDeck [deckCounter] = null;
            System.out.println("Deck is removed");
            return true;
        }else {
            System.out.println("No decks to remove");
            return false;
        }
    }
    public double getShipResultWeight () {
        return shipResultWeight;
    }
    public String getShipName () {
        return name;
    }
}
