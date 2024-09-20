import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(4, 5, 7, 3, 2, 6);
        // Collections.sort(num); //in collctions class sort method easily sort the
        // array
        // System.out.println(num);

        // int sum=0;
        // for( int n: num){
        // if(n%2==0){
        // n=n*2;
        // sum=sum+n;
        // }

        // }
        // System.out.println(sum); // if you want perform some operation like this

        // USING STREAM API

        // Stream<Integer> s1= num.stream();
        // Stream<Integer> s2=s1.filter(n -> n%2==0);
        // Stream<Integer> s3=s2.map(n -> n*2);
        // int sum = s3.reduce(0,(c,e)-> c+e );
        // System.out.println(sum);

        // ALSO EASY WAY
        int sum = num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .reduce(0, (c, a) -> c + a);
        System.out.println(sum);

    } 

}
