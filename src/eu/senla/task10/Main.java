package eu.senla.task10;


import eu.senla.task10.MyArrayList.MyArrayList;
import eu.senla.task10.MyArrayList.MyList;

public class Main {
    public static void main (String [] args) throws Exception{
        MyList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        try {
            list.subList(-2,8);
        } catch (MySublistIsOutOfRange e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(list);
        }

        try {
            list.get (-1);
        } catch (MyIndexOutOfBound e) {
            System.out.println(e.getMessage());
        } finally{
        System.out.println(list);
    }
        try {
            list.get (8);
        } catch (MyElementIsNull e) {
            System.out.println(e.getMessage());
        } finally{
            System.out.println(list);
        }

}
}

