package project1_copy;

import java.util.Scanner;

public class Draft {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the topping info: ");
        String allInfo = in.nextLine();

        String[] infos = allInfo.split(" ");

        Topping topping = new Topping(infos[0], infos[1], infos[2]);

        System.out.println(topping.toString());
    }
}
