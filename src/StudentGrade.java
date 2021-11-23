import java.util.Scanner;
public class StudentGrade {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       float marks;
       System.out.print("Enter the marks of a student:");
       marks=sc.nextFloat();
       if (marks<25) {
           System.out.print("Failed");
       }
       else if (marks>=25 && marks<=45){
            System.out.print("You scored E grade");
           }
       else if (marks>=45 && marks<=50){
           System.out.print("You scored D grade");
       }
       else if (marks>=51 && marks<=60){
           System.out.print("You scored E grade");
       }
       else if (marks>=61 && marks<=80){
           System.out.print("You scored B grade");
       }
       else if (marks>80){
           System.out.print("You scored A grade");
       }

    }
}
