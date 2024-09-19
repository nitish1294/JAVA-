import java.util.*;
// find if number is prime or not
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        boolean flag = false;
        for(int i=2;i<n;i++){
            if(n%i ==0){
                flag = true;
                break;

            }
           
            else{
                flag=false;
            }
          
            
        }
        if (flag==true) {
            System.out.println("it is not prime");
    
        }
       else if(flag==false)
       {
        System.out.println("this is  prime");
       }


        
    }
}
// import java.util.Scanner;

// public class prime {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         boolean flag = false;

//         if (n <= 1) {
//             flag = true; // Numbers less than or equal to 1 are not prime
//         } else {
//             for (int i = 2; i <= n / 2; i++) { // Loop from 2 to n/2
//                 if (n % i == 0) {
//                     flag = true; // Found a divisor, number is not prime
//                     break;       // No need to check further
//                 }
//             }
//         }

//         if (flag) {
//             System.out.println(n + " is not prime.");
//         } else {
//             System.out.println(n + " is prime.");
//         }

       
//     }
// }
