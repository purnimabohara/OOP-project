import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.println("enter your name");
      String a = scanner.nextLine();
      System.out.println("enter your roll.no");
      int b = scanner.nextInt();
     System.out.println("enter your field of interest");
     String c= scanner.nextLine();
    System.out.println("Hey my name is " +a +"\n"+" and my roll.no is " +b +"\n"+"My field of interest is " +c+"\n");
    }
}