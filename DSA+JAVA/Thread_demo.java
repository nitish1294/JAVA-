import java.util.*;

/**
 * InnerThread
 */
public class Thread_demo {

    public static void main(String[] args) {

        A obj=new A();
        B obj1=new B();
        obj.start();
        obj1.start();
    }
}

class A extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }

    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("*");
        }
    }
}
