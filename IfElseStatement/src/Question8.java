import java.util.Scanner;

class Question8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String str = input.next();
        if (str.equals("a")||str.equals("e")||str.equals("i")||str.equals("o")||str.equals("u")) {
            System.out.println("'"+ str+"' is a vowel!");
        }
        else {
            System.out.println("'"+ str+"' is a consonant!");
        }
    }
}
