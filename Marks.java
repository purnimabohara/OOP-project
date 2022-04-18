import java.sql.SQLOutput;

public class Marks {
    public static void main(String[]args){
        float m1,m2,m3,m4,marks;//marks of first,second,third,fourth subject
        m1=55;
        m2=65;
        m3=80;
        m4=0;
        marks=(m1+m2+m3+m4)/400*100;
        System.out.println(marks);
//        if (marks>=70){
//       System.out.println( "first class");}
//      else if (marks>59){
//      System.out.println("upper second class");}
//      else if (marks>49){
//      System.out.println("second class");}
//      else if (marks>39){
//     System.out.println("third class");}
//      else {
//      System.out.println("Fail");}

        String grade;
        grade = (marks>=70)? "First class":
                (marks>59 && marks<70)? "upper second class":
                        (marks>49 && marks<60)? "second class":
                                (marks>39 && marks<59)? "third class":
                                "fail";
        System.out.println(grade);

//        System.out.printf("purnima");
//        System.out.printf("bohara");







    }





}
