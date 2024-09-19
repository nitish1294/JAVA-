import java.util.*;

// calculate rate of interest 

public class interest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principal amount: ");
        int amount=sc.nextInt();
        System.out.println("Enter the rate of  interest: ");
        int rate =sc.nextInt();
        System.out.println("Enter the year :");
        int year=sc.nextInt();
        int SI=(amount*rate*year)/100;
        System.out.println("Simple Interest is: "+SI);
        
        


    }
    
}
