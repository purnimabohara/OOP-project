import java.util.Scanner;

class Question20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary = input.nextInt();

        double hra, da, grossSalary;

        if (salary<10000) {
            hra = 0.2*salary;
            da = 0.8*salary;
        } else if (salary<=20000) {
            hra = 0.25*salary;
            da = 0.9*salary;
        } else {
            hra = 0.3*salary;
            da=0.95*salary;
        }

        grossSalary=salary+hra+da;

        System.out.println("Gross salary:  Rs."+grossSalary);
    }
}
