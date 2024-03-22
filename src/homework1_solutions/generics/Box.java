package homework1_solutions.generics;

import java.util.ArrayList;

public class Box <E> {
    /*
    Создайте generic класс Box,
    который может хранить любой тип данных.
    Он должен иметь методы для добавления элемента - add(E e),
    удаления элемента - remove(int index) и
    получения элемента из коробки - get (int index).

    Подсказка: используйте ArrayList
     */
    private ArrayList<E> list = new ArrayList<>();
    public void add(E e){
        this.list.add(e);
    }
    public E get(int i){
        if (i < 0 || i >= list.size()){
            throw new IllegalArgumentException();
        }
        return list.get(i);
    }
    public void remove(int i){
        if (i < 0 || i >= list.size()){
            throw new IllegalArgumentException();
        }
        this.list.remove(i);
    }
}
