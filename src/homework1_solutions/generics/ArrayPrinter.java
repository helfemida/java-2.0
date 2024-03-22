package homework1_solutions.generics;

public class ArrayPrinter <E>{
    /*
    Напишите generic метод printArray,
    который принимает массив любого типа и выводит его элементы в консоль.

     */
    public void printArray(E[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
