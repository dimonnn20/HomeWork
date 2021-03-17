package eu.senla.task9;

import eu.senla.task5.Deck;
import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Konus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeckTest {
    Container container = new Konus(true,20,1000);
    Deck deck = new Deck(true);

    @Test
    public void addBigContainerTest () {
        assertEquals(true,deck.add(container));
        assertEquals(true,deck.add(container));
        assertEquals(false,deck.add(container));

    }
    @Test
    public void removeContainerTest () {
        assertEquals(true,deck.add(container));
        assertEquals(true,deck.remove());
    }
}
