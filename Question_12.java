
//Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
//        check if both the conditions 'a < 50' and 'a < b' are true.
import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter a number1");
        int a = scanner.nextInt();
        System.out.println("Enter a number2");
        int b = scanner.nextInt();
        String output;
        output = (a<50 && a<b)?"First number is smaller than 50 and second number":"the condition is false";
        System.out.println(output);
    }
}