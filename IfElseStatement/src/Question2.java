import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter third number: ");
        int num3 = input.nextInt();

        if (num1>num2&&num1>num3) {
            System.out.println(num1+" is greatest.");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2+" is greatest.");
        }
        else if (num3>num1&&num3>num2) {
            System.out.println(num3+" is greatest.");
        } else {
            System.out.println("Numbers are equal.");
        }
    }
}
