import java.util.Scanner;

public class UIOPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String a = scanner.nextLine();
        System.out.println("enter your age");
        int b = scanner.nextInt();
        System.out.println("enter your city");
        String c= scanner.nextLine();
        System.out.println("My name is " +a +"\n"+" My age is " +b+"\n" + "I live in " +c);


        System.out.println("enter principle");
        String p= scanner.nextLine();
        System.out.println("enter time");
        String t= scanner.nextLine();
        System.out.println("enter rate");
        String r= scanner.nextLine();
        int val1= Integer.parseInt(p);
        int val2= Integer.parseInt(t);
        int val3= Integer.parseInt(r);
        System.out.println("simple Interest is:"+ (val1*val2*val3)/ 100);




        System.out.println("enter principle");
        double p= scanner.nextDouble();
        System.out.println("enter time");
        double t= scanner.nextDouble();
        System.out.println("enter rate");
        double r= scanner.nextDouble();
        System.out.println("simple Interest is:"+ (p*t*r)/ 100);






    }
}
