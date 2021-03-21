package eu.senla.task11;

import java.util.Comparator;

public class myComparator implements Comparator <CPU> {
    public int compare (CPU cpu1, CPU cpu2) {
        if (cpu1.getfrequency() > cpu2.getfrequency())
            return 1;
        if (cpu1.getfrequency() < cpu2.getfrequency())
            return -1;
        else return 0;
    }
}
