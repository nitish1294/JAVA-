import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Aslist {
    public static void main(String[] args) {
        
        List <Integer > num=Arrays.asList(4,5,7,3,2,6);
        // Collections.sort(num); //in collctions class sort method easily sort the array
        // System.out.println(num);

        int sum=0;
        for( int n: num){
            if(n%2==0){
                n=n*2;
                sum=sum+n;
            }

        }
        System.out.println(sum);

    }
    
}
