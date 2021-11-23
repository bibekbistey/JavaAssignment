import java.util.Scanner;
public class DiscountAmount {
    public static void main(String[] args){
        float quantity;
        float newprice;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the quantity:");
        quantity= sc.nextFloat();
        float n=100;
        float totalprice=quantity*n;
        if(totalprice>1000){
            newprice=10*totalprice/100;
            System.out.println("Total price after discont is "+newprice);}
        else{
            System.out.print("The total price is "+totalprice);
            }


    }
}
