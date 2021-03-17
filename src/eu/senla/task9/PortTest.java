package eu.senla.task9;

import eu.senla.task5.Port;
import eu.senla.task5.Ship;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PortTest {
    Ship ship = new Ship(2);
    Port port = new Port(2);

    @Test
    public void portAdd () {
        assertEquals(true,port.add(ship));
        assertEquals(true,port.add(ship));
        assertEquals(false,port.add(ship));

    }
    @Test
    public void portRemove () {
        assertEquals(false,port.remove());
        assertEquals(true,port.add(ship));
        assertEquals(true,port.remove());


    }
}
