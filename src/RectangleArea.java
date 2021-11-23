import java.util.Scanner;
public class RectangleArea {
    public static void main (String[] args){
        int length;
        int breadth;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of a rectangle:");
        length=sc.nextInt();
        System.out.print("Enter the breadth of a rectangle:");
        breadth=sc.nextInt();
        int area=length*breadth;
        if (length==breadth){
            System.out.print("It is a perfect square");}
        else{
            System.out.print("It is not a perfect square");
        }
    }











}
