package eu.senla.task9;

import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Cylinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {
    @Test
    public void getDefaultCylinderWeightBig () {
        Container cylinderBig = new Cylinder(true,50,1000);
        assertEquals(62800.0,cylinderBig.getWeight());
    }
    @Test
    public void getDefaultCylinderWeightSmall () {
        Container cylinderSmall = new Cylinder(false,20,1000);
        assertEquals(6280.0,cylinderSmall.getWeight());
    }
}

