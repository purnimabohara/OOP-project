import java.util.Scanner;

class Question1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();
        System.out.print("Enter another number:");
        int num2 = input.nextInt();

        if (num1>num2) {
            System.out.println(num1 + " is greater.");
        } else if (num1<num2) {
            System.out.println(num2 + " is greater.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
