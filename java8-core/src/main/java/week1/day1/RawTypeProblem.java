package week1.day1;

import java.util.ArrayList;
import java.util.List;

public class RawTypeProblem {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Hello");
        list.add(123); // 컴파일 시점에 오류가 발생하지 않음
        list.add(true); // 컴파일 시점에 오류가 발생하지 않음

        for (Object o : list) {
            String str = (String) o; // 런타임 시점에 ClassCastException 발생 가능
            System.out.println(o);
        }
    }
}
