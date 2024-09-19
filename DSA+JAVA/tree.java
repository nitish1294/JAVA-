import java.util.HashSet;
import java.util.Set;

public class tree {


    public static void main(String[] args) {
        Set<Integer> st=new HashSet<>();
        st.add(1);
        st.add(5); //and not support indexing
        st.add(3);
        st.add(4);
        st.add(4);//set not allow dublication
        for(Object i : st){
            System.out.println(i);
        }

    }
    
}
