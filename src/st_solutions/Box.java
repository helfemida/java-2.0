package st_solutions;

import java.util.ArrayList;

public class Box<T>{
    ArrayList<T> elements;
    public Box() {
        this.elements = new ArrayList<>();
    }
    public void getElements(){
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i));
        }
    }

    public void  add (T element)throws NullPointerException{
        if(element == null){
            throw new NullPointerException("cannot add null element");
        }
        this.elements.add(element);
    }

    public void remove(int index){
        if (elements == null || index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        this.elements.remove(index);
    }

    public void get(int index){
        if (index < 0 || index >= elements.size()) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        this.elements.get(index);
    }

    public <T> void printArray(T[] array){
        for(int i = 0 ; i < array.length;i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

}