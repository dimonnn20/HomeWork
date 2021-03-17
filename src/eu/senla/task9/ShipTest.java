package eu.senla.task9;

import eu.senla.task5.Deck;
import eu.senla.task5.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipTest {
    Ship ship = new Ship(2);
    Deck deck = new Deck(true);

    @Test
    public void addShipTest () {
        assertEquals(true,ship.add(deck));
        assertEquals(true,ship.add(deck));
        assertEquals(false,ship.add(deck));
    }
    @Test
    public void removeShipTest () {
        assertEquals(false,ship.remove());
        assertEquals(true,ship.add(deck));
        assertEquals(true,ship.remove());
    }
}
