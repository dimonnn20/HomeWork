package eu.senla.task3;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int i = 0;
        int counter = 0;
        while (i<10) {
            i++;
            System.out.println(new Cat().toString());
        }
        // Задание 2
        System.out.println("Задание 2");
        for (int j = 0; j<10; j++) {
            Cat cat = new Cat ();
            cat.setName("Pavel");
            cat.setAge((int) 1);
            System.out.println("Cat { " + cat.getName()+ ", age = "+ cat.getAge () + " } ");
        }
        // Задание 3
        System.out.println("Задание 3");
        do {
            System.out.println(new Cat ("Vaska",5).toString());
            counter++;
        } while (counter<10);
        // Задание 4
        System.out.println("Задание 4");
        Cat cat1 = new Cat ("Barsiak", 8);
        Cat cat2 = new Cat ("Tom", 30);
        Cat cat3 = new Cat ("Kasper", 34);
        Cat cat4 = new Cat ("Chetvertuy", 20);
        Cat cat5 = new Cat ("Myukala", 15);
        Cat [] catArray = new Cat [] {cat1,cat2,cat3,cat4,cat5};
        for (Cat print: catArray) {
            System.out.println(print.toString());
        }





    }
}
