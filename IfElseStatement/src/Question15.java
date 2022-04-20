import java.util.Scanner;

class Question15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first side of triangle: ");
        int side1 = input.nextInt();
        System.out.println("Enter second side of triangle: ");
        int side2 = input.nextInt();
        System.out.println("Enter third side of triangle: ");
        int side3 = input.nextInt();

        if (side1+side2>=side3&&side1-side2<=side3) {
            System.out.println("Triangle is valid.");
        } else {
            System.out.println("Triangle is invalid.");
        }
    }
}