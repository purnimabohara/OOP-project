import java.util.Scanner;

class Question18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter CP: ");
        int cp = input.nextInt();
        System.out.print("Enter SP:");
        int sp = input.nextInt();

        if (sp>cp) {
            System.out.println("Profit");
        } else if (sp<cp) {
            System.out.println("Loss");
        } else {
            System.out.println("Neither profit nor loss");
        }
    }
}