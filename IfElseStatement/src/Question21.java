import java.util.Scanner;

class Question21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total units: ");
        int units = input.nextInt();
        double price;

        if (units<=50) {
            price=units*0.5;
        } else if (units<=150) {
            price=25+(units-50)*0.75;
        } else if (units<=250) {
            price=25+75+(units-150)*1.2;
        } else {
            price=25+75+180+(units-250)*1.5;
        }
        double total=price+0.2*price;
        System.out.println("Total price: "+total);
    }
}