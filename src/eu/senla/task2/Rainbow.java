package eu.senla.task2;

public class Rainbow {

    public void printColor (float number) {

        if (0 <= number && number <=5 ) {
            if (0 <= number && number <= 1) {
                System.out.println("Red");
            }
            if (1 < number && number < 2) {
                System.out.println("Red-Orange");
            }
            if (number == 2) {
                System.out.println("Orange");
            }
            if (2 < number && number < 3) {
                System.out.println("Orange-Yellow");
            }
            if (number == 3) {
                System.out.println("Yellow");
            }
            if (3 < number && number < 4) {
                System.out.println("Yellow - Green");
            }
            if (number == 4) {
                System.out.println("Green");
            }
            if (4 < number && number < 5) {
                System.out.println("Green - Blue");
            }
            if (number == 5) {
                System.out.println("Blue");
            }
        }
        else System.out.println("Wrong number entered");
    }
}
