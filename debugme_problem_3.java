/*
    Problem 3
    Expected Output :
            [hello,
             , world]
*/
import java.util.List;
public class Problem4 {

    public static void main(String[] args) {

        List<String> list = new List<String>();
        list.add("hello,");
        list.add("/n");
        list.add(", world");

        System.out.printf(list.toString());

    }
}
