import java.util.*;

/**
 * print1to5
 * like 
 *  *
 *  * *
 *  * * *
 *  * * * *
 *  * * * * * 
 */
public class print1to5 {

    public static void main(String[] args) {
    int n=5;
    // int j=0;
    for(int i=1; i<=n;i++){
        for(int j=1; j<=i;j++){
            System.out.print("*");
        }
        System.out.println();

    }
    
    
    }
}