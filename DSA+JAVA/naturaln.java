import java.util.*;

// sum of first n number
public class naturaln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A Number: ");
        int n = sc.nextInt();


        // using for loop
        int sum = 0;
        for(int i=1; i<=n;i++){
            sum=sum+i;
        }
        System.out.println(sum);




// Using while loop
        // int counter = 1;
        // int sum=0;
        // while (counter <= n) {
        //     sum=sum+counter;
        //     counter++;
        // }
        // System.out.println(sum);

    }

}
