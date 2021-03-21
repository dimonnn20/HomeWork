package eu.senla.task10.MyArrayList;

import eu.senla.task10.MyElementIsNull;
import eu.senla.task10.MySublistIsOutOfRange;
import eu.senla.task10.MyIndexOutOfBound;

import java.util.Comparator;
import java.util.ListIterator;

public interface MyList <E>{


    boolean add (E obj);
    void add(int index, E obj) throws MyIndexOutOfBound;
    // добавляет в список по индексу index объект obj

    boolean addAll(int index, MyList<? extends E> col) throws MyIndexOutOfBound;
    // добавляет в список по индексу index все элементы коллекции col. Если в результате добавления список был изменен,
    // то возвращается true, иначе возвращается false

    E get(int index) throws MyIndexOutOfBound, MyElementIsNull;
    // возвращает объект из списка по индексу index

    int indexOf(Object obj);
    // возвращает индекс первого вхождения объекта obj в список. Если объект не найден, то возвращается -1

    int lastIndexOf(Object obj);
    // возвращает индекс последнего вхождения объекта obj в список. Если объект не найден, но возвращается -1

    ListIterator<E> listIterator();
    // возвращает ListIterator для обхода элементов списка

    <E> MyList<E> of(Object... e);
    // создает из набора элементов объект List

    E remove(int index) throws MyIndexOutOfBound;
    // удаляет объект из списка по индексу index, возвращая при этом удаленный объект

    E set(int index, E obj) throws MyIndexOutOfBound;
    // присваивает значение объекта obj элементу, который находится по индексу index

    void sort(Comparator<? super E> comp);
    // сортирует список с помощью компаратора comp методом пузырька

    MyList<E> subList(int start, int end) throws MySublistIsOutOfRange;

    Object[] toArray();
}
