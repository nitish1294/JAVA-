import java.util.Set;
import java.util.TreeSet;

public class treeset {
    public static void main(String[] args) {

        Set<Integer> st = new TreeSet<>();
        st.add(4); // ARRANGE AUTOMATIC IN ASSENDING ORDER
        st.add(2);
        st.add(6);
        st.add(1);
        st.add(3); //NOT SUPPORT DUBLICATION AND 
        st.add(3);

        for (Integer i : st) {
            System.out.println(i);
        }

    }

}
