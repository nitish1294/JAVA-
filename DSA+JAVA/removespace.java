
/**
 * removespace: remove space from sentence
 */
public class removespace {
    public static void main(String[] args) {
        String str = "Hello Java     I Am     Nitish";

        String str2=str.replaceAll("\\s", "");
        System.out.println(str2);


    }

    
}