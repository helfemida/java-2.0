package practice2.generics;

public class Task1 {

    // T, E, K
    // wildcard - upperbounded, lowerbounded, unbounded
    /*
    arrayList = {109232094}
    for(I < length)
     */

    public static void main(String[] args) {
        Integer[] array1 = {1, 2, 4, 5, 7};
        Integer[] array2 = {1, 3, 2, 4, 6, 2};

        Integer[] array3 = {1, 4, 2, 5, 2, 5};
        Integer[] array4 = {1, 4, 2, 5, 2, 5};

        String[] strings1 = {"Hello", "Its", "Java"};
        String[] string2 = {"Hello", "sdkjfksd"};

        String[] strings3 = {"noodle", "egg", "sauce"};
        String[] strings4 = {"noodle", "ramen", "sauce"};

        System.out.println(isEqualArrays(array1, array2));
        System.out.println(isEqualArrays(array3, array4));
        System.out.println(isEqualArrays(strings1, string2));
        System.out.println(isEqualArrays(strings3, strings4));
    }

    public static <T> boolean isEqualArrays(T[] array1, T[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

}
