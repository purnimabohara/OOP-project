import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        if (num1 % 5 == 0 && num1 % 11 == 0) {
            System.out.println("Divisible by 5 and 11!");
        } else {
            System.out.println("Not divisible by 5 and 11!");
        }

    }
}