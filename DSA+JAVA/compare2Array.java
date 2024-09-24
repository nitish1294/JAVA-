// compare 2 array in java
import java.util.*;

public class compare2Array {
    public static void main(String[] args) {
        int[] arr1 = {1, 88, 3};
        int[] arr2 = {1, 2, 3};
        
        boolean areEqual = Arrays.equals(arr1, arr2);
        
        if (areEqual) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }
    }
}
