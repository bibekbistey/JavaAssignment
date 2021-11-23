import java.util.Scanner;
public class UserInput {
    public static  void main (String[] args){
        Scanner sc=new Scanner(System.in);
        //Data representation
        int first;
        int second;
        int result;
        //User input
        System.out.print("Enter first number:");
        first=sc.nextInt();
        System.out.print("Enter Second number:");
        second=sc.nextInt();
        result=first+second;
        System.out.print("The sum of" +first+ "and"+ second+ "is" +result);


    }}
