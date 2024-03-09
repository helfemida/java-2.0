package practice2.generics;

import java.util.ArrayList;

public class Task {

    public static void main(String[] args) {

    }

    public static Double[] oddEvenSums(ArrayList<? extends Number> nums) {
        Double oddSum = 0D;
        Double evenSum = 0D;

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i).doubleValue() % 2 == 0) {
                evenSum += nums.get(i).doubleValue();
            } else {
                oddSum += nums.get(i).doubleValue();
            }
        }
        return new Double[]{oddSum, evenSum};
    }

}
