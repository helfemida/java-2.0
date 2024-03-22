package homework1_solutions.exceptionhandling;

import java.util.Scanner;

public class EmailValidator {
    /*
    Создайте метод validateEmail,
    который принимает строку с адресом
    электронной почты и проверяет, соответствует
    ли он стандартам электронной почты (например,
    содержит символ "@" и "."). Если формат адреса
    неправильный, метод должен бросить исключение
    IllegalArgumentException с сообщением “Invalid format for email”
     */
    public static void main(String[] args) throws InvalidEmailException {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an email: ");
        String email = in.next();

        try{
            validateEmail(email);

        }
        catch (InvalidEmailException exception){
            System.out.println("Invalid format for email");
        }

    }
    public static void validateEmail(String email) throws InvalidEmailException {
        if(!(email.contains("@") && email.contains("."))){
            throw new IllegalArgumentException("Invalid format for email");
        }
        else{
            System.out.println("Everything is fine!");
        }
    }
}
class InvalidEmailException extends Exception{
    public InvalidEmailException(String message){
        super(message);
    }
}
