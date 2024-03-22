package homework1_solutions.exceptionhandling;

import java.util.Scanner;

public class AgeException {
    /*
    Создайте custom exception InvalidAgeException,
    которое будет брошено, если возраст человека
    меньше 0 или больше 150. Напишите программу,
    которая запрашивает возраст пользователя
    и бросает это исключение, если условие не выполняется.

    Examples:

     */
    public static void main(String[] args) throws InvalidAgeException {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you age: ");
        int age = in.nextInt();
        if(age < 0 || age > 150){
            throw new InvalidAgeException("This is an impossible age");
        }
        else{
            System.out.println("Fine!");
        }
    }
}
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}

