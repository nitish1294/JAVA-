import java.util.*;


// calculate Area of circle
public class areaofcircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius :");
        int radius = sc.nextInt();
        float pi = 3.14f;
        float area = pi * radius * radius;
        System.out.println("Area of circle is :" + area);

    }

}
