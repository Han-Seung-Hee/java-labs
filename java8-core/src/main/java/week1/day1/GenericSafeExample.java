package week1.day1;

import java.util.ArrayList;
import java.util.List;

public class GenericSafeExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Helllo");
/*      ClassCastException 방지를 위해 제네릭스로 타입을 지정한것임.
        list.add(123);
        list.add(true);
        */

        for (String val : list) {
            System.out.println(val);
        }
    }
}
