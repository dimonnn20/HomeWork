package eu.senla.task8;

public class Main {
    public static void main (String [] args) {

        MyList <Integer> list = new MyArrayList<>();

       list.add(3);
       list.add(5);
       list.add(2);
       list.add(1);

        MyList <Integer> list2 = new MyArrayList<>();
        list.add(9);
        list.add(7);
        list.add(6);
        list.add(8);

        list.addAll(4,list2);
        System.out.println(list);
        list.sort(Integer::compareTo);
        System.out.println(list);
        System.out.println(list.subList(2,5));
    }
}
