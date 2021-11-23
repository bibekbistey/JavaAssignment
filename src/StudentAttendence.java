import java.util.Scanner;
public class StudentAttendence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        float held;
        float attended;
        System.out.print("Enter the no of classes held:");
        held= sc.nextInt();
        System.out.print("Enter the number of classes attended:");
        attended= sc.nextInt();
        float percentage=attended*100/held;

        if(percentage<75){
            System.out.println("You are not eligible for examination");
        }
        else{
            System.out.println("You are  eligible for examination");
        }
        System.out.print("Your class attendence percentage is "+ percentage+"%");

    }
}
