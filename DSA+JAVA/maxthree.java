import java.util.*;

/**
 * maxthree
 */
// find max of 3 number
public class maxthree {

    public static void main(String[] args) {
        int a=5;
        int b=10;
        int c=15;
        if (a>b && a>c) {
            System.out.println("a is greater");
            
        }
        else if (b>a && b>c) {
            System.out.println("b is greater");
            
        }
        else if (c>a && c>b) {
            System.out.println("c is greater");
            
        }
        else if (c==a && c==b){
            System.out.println("all are equal");
        }
        else{
            System.out.println("something went wrong");
        }

}}