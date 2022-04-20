import java.util.Scanner;

class Question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();
        if ((year%4==0&&year%100!=0)||year%400==0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Normal Year");
        }
    }
}