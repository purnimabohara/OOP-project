import java.util.Scanner;

class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char str = input.next().charAt(0);
        boolean result = Character.isDigit(str);
        boolean result2 = Character.isAlphabetic(str);
        if(result) {
            System.out.println("'"+ str+"' is a number");
        }
        else if (result2) {
            System.out.println("'"+ str+"' is a letter");
        } else {
            System.out.println("'"+ str+"' is a special character");
        }
    }
}
