package homework1_solutions;

import homework1_solutions.generics.ArrayPrinter;
import homework1_solutions.generics.Box;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {1, 4, 2, 4, 4, 5, 6, 7};
        String[] array2 = {"Hello", "world", "I", "Love", "Java"};

        new ArrayPrinter<>().printArray(array1);
        new ArrayPrinter<>().printArray(array2);

        Box<Integer> integerBox = new Box<>();
        integerBox.add(1);
        integerBox.add(2);
        integerBox.add(3);
        integerBox.add(4);
        integerBox.add(5);
    }
}
