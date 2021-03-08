package eu.senla.task8;

import java.util.*;

public class MyArrayList <E> implements MyList <E> {
    Object [] myArray;
    static final int DEFAULTSIZE = 10;
    int size;

    public MyArrayList () {
        this.myArray = new Object[DEFAULTSIZE];
    }

    @Override
    public boolean add(E obj) {
        if (size == myArray.length) {
            myArray = expandArray ();
        } else
        myArray[size] = obj;
        size++;
        return true;
    }

    private Object[] expandArray() {
        Object [] tempArray = new Object[(int) (myArray.length*1.5)];
        for (int i=0; i< myArray.length;i++) {
            tempArray [i] = myArray [i];
        }
        return tempArray;
    }

    @Override
    public void add(int index, E obj) {
        if (inRange (index)) {
            if (size== myArray.length) {
                myArray = expandArray();
            } else {
                Object [] arrayTemp = new Object[size];
                for (int i = 0; i < index; i++) {
                    arrayTemp [i] = myArray [i];
                }
                arrayTemp[index] = obj;
                for (int i = index+1; i<size; i++) {
                    arrayTemp [i] = myArray[i];
                }
            }
        } else {
            System.out.println("Index is not existed");
        }
    }

    private boolean inRange(int index) {
        if (index > 0 && index < myArray.length ) {
            return true;
        } else {
            System.out.println("Index is out of range");
            return false;
        }
    }

    @Override
    public boolean addAll(int index, MyList<? extends E> col) {
        if (inRange(index)) {
            Object[] newArrayTemp = col.toArray();
            Object [] myTempArray = new Object[size];
            int j =0;
            for (int i =0; i<size; i++) {
                myTempArray[i] = myArray[i];
            }
            if ((size + newArrayTemp.length) > myArray.length) {
                myArray = expandArray();
            } else {
                for (int i = 0; i < index; i++ ) {
                    myArray [i] = myTempArray[i];
                }
                for (int i = index; i < (index + newArrayTemp.length); i++) {
                    myArray  [i] = newArrayTemp [j];
                    j++;
                }
                for (int i =(index+ newArrayTemp.length); i<size;i++) {
                    myArray [i] = myTempArray [i- newArrayTemp.length];
                }
            }

            size = size + newArrayTemp.length;
            return true;
        }
        System.out.println("Index for addAll is out of range");
        return false;
    }


    @Override
    public E get(int index) {
        if (inRange(index)) {
            return (E) myArray[index];
        } else
            System.out.println("Index for get is out of range");
        return (E) "-1";
    }

   @Override
    public int indexOf(Object obj) {
       for (int i = 0; i < size; i++) {
           if (obj.equals(myArray[i])) {
               return i;
    }
       }
       return -1;
       }

    @Override
    public int lastIndexOf(Object obj) {
        for (int i = size; i>0; i--) {
            if (obj.equals(myArray[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<E> listIterator() {
       return (ListIterator<E>) new MyListIterator();
    }
    private class MyListIterator <E> implements Iterator <E> {
        int size = MyArrayList.this.size;
        int currentPointer = 0;
        @Override
        public boolean hasNext() {
            return (currentPointer<size);
        }

        @Override
        public E next() {
            if (!hasNext()) {
                System.out.println("Out of range");
            }
            E a = (E) myArray[currentPointer];
            currentPointer = currentPointer+1;
            return a;
        }
    }

    @Override
    public <E> MyList<E> of(Object... e) {
        MyList eArrayList = new MyArrayList();
        for (int i =0; i <e.length; i++) {
            eArrayList.add(e[i]);
        }
        return eArrayList;
    }

    @Override
    public E remove(int index) {
        E a = null;
        if (inRange(index)) {
            a = (E) myArray[index];
            myArray[index] = null;
        } else {
            System.out.println("index for remove is not in the Range");
        }
        return a;
    }

    @Override
    public E set(int index, E obj) {
        E a = null;
        if (inRange(index)){
            a = (E) myArray [index];
            myArray[index] = obj;
            System.out.println("the element setted");
        }
        return a;
    }

    @Override
    public void sort(Comparator<? super E> comp) {
        Object [] tempArray = new Object[size];
        Object tempObject;
        for (int i =0; i< size; i++) {
            tempArray [i] = myArray [i];
        }
        for (int i = size-1; i > 0;i--) {
            for (int j = 0; j<i; j++) {
                if (comp.compare((E) tempArray[j], (E) tempArray[j+1]) > 0){
                    tempObject = tempArray[j];
                    tempArray[j] = tempArray[j+1];
                    tempArray[j+1] = tempObject;
                }
            }
        }
        for (int i =0; i < size; i++ ) {
            myArray[i] = tempArray[i];
        }
    }

    @Override
    public MyList<E> subList(int start, int end) {
        if (inRangeSublist (start,end,size)) {
            MyList tempSub = new MyArrayList();
            for (int i = start; i<end; i++) {
                tempSub.add(myArray[i]);
            }
            return tempSub;
        } else {
            System.out.println("subList index are out of the range");
        }
        return null;
    }
    private boolean inRangeSublist(int start, int end, int size) {
        if (start > end || start < 0|| end > size) {
            System.out.println("Start index is out of range");
            return false;
        } else return true;

    }


    public Object[] toArray() {
        Object [] newArray = new Object[size];
        for (int i = 0; i<size; i++) {
            newArray [i] = myArray[i];
        }
        return newArray;
    }


    @Override
    public String toString() {
        return "MyArrayList{" + Arrays.toString(myArray) +
                '}';
    }
}
