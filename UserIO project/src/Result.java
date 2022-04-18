import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter marks of first subject");
        double m1= scanner.nextDouble();
        System.out.println("enter marks of second subject");
        double m2= scanner.nextDouble();
        System.out.println("enter marks of third subject");
        double m3= scanner.nextDouble();
        System.out.println("enter marks of fourth subject");
        double m4= scanner.nextDouble();
        double marks;
        String grade;
        System.out.println(marks= (m1+m2+m3+m4)/4);
        grade=(marks>=70)?"First class":
                (marks>59 && marks<69)?"Upper second class":
                        (marks>49 && marks<58)?"second class":
                                (marks>39 && marks<48)?"third class":
                                        "Fail";
        System.out.println(grade);













    }




}
