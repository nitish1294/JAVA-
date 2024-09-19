import java.util.ArrayList;

public class list {


    public static void main(String[] args) {
        ArrayList<Integer> student=new ArrayList<>();
        student.add(1);
        student.add(2);
        student.add(3);
        student.add(3); //list allow Dublication 
        for(Object n : student){
            System.out.println(n);
        }


    }
    
}
