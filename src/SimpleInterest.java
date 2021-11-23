import java.util.Scanner;
public class SimpleInterest {
    public static void main (String[] args){
        float Principle;
        float rate;
        float time;
        float Interest;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of Principle:");
        Principle=sc.nextFloat();
        System.out.print("Enter the Time:");
        time=sc.nextFloat();
        System.out.print("Enter the Rate:");
        rate=sc.nextFloat();
        Interest=Principle*time*rate/100;
        System.out.print("The simple interest is:"+Interest);

    }}
