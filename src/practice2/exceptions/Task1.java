package practice2.exceptions;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] bolganElementter = new int[n];
        for (int i = 0; i < n; i++) {
            int kazirgiSan = in.nextInt();
            for (int j = 0; j < bolganElementter.length; j++) {
                if (kazirgiSan == bolganElementter[j]) {
                    throw new IllegalArgumentException();
                }
            }
            bolganElementter[i] = kazirgiSan;
        }
        System.out.println(Arrays.toString(bolganElementter));
    }
}

