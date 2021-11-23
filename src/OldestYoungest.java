import java.util.Scanner;
public class OldestYoungest {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int vik;
        int josh;
        int harry;
        System.out.print("Vik enter your age");
        vik=sc.nextInt();
        System.out.print("Josh enter your age");
        josh=sc.nextInt();
        System.out.print("Harry enter your age");
        harry=sc.nextInt();


        //For oldest
        if (vik>josh && vik>harry) {
            System.out.println("Vik is oldest");
        }
        else if (josh>vik && josh>harry){
            System.out.println("Josh is oldest");}
        else  {
            System.out.println("Harry is oldest");
        }


        // FOr youngest
        if (vik<josh && vik<harry){
            System.out.println("Vik is youngest");
        }
        else if (josh<vik && josh<harry){
            System.out.println("Josh is youngest");
        }
        else{
            System.out.println("Harry is youngest");
        }

    }
}
