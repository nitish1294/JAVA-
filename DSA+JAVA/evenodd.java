import java.util.*;

public class evenodd {

    public static void main(String[] args) {
        // int i =50;
        for (int i = 1; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " is odd");

            }
            else if (i % 2 ==0) {
                System.out.println(i + " is even");
                
            }

            else {
                System.out.println("something went wrong");
            }
        }

    }

}
