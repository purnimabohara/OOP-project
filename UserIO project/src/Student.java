import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name of student");
        String n = scanner. nextLine();
        System.out.println("enter age of student");
        int a = scanner.nextInt();
        System.out.println("enter student ID");
        int i= scanner.nextInt();
        System.out.println("enter marks of student");
        int m= scanner.nextInt();
        System.out.println(n + "\n"+ a +"\n"+i + "\n"+ m + "\n");
    }




    
}
