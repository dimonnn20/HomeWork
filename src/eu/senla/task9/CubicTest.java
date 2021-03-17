package eu.senla.task9;

import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Cubic;
import eu.senla.task5.containers.Cylinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubicTest {
    @Test
    public void getDefaultCubicWeightBig () {
        Container cubicBig = new Cubic(true,50,1000);
        assertEquals(10000.0,cubicBig.getWeight());
    }
    @Test
    public void getDefaultCubicWeightSmall () {
        Container cubicSmall = new Cubic(false,20,1000);
        assertEquals(1000.0,cubicSmall.getWeight());
    }
}
