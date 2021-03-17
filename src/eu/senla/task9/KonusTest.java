package eu.senla.task9;
import eu.senla.task5.*;
import eu.senla.task5.containers.Container;
import eu.senla.task5.containers.Konus;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

    class KonusTest {
        @Test
        public void getDefaultKonusWeightBig () {
            Container konusBig = new Konus(true,50,1000);
            assertEquals(5233.333333333333,konusBig.getWeight());
        }
        @Test
        public void getDefaultKonusWeightSmall () {
            Container konusSmall = new Konus(false,20,1000);
            assertEquals(523.3333333333334,konusSmall.getWeight());
        }
    }
