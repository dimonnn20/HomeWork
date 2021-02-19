package eu.senla.task7;

public class Main {
    public static void main (String [] args){
        int count;
        for (int i =0; i< 9; i++) {
            count = i+1;
            System.out.println("Номер робота "+ count +" "+ new Factory().toString());
        }

    }
}
