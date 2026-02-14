package week1.day3;

public class ObjectUtil {
    public static Object identity(Object value) {
        return value;
    }

    // ObjectUtil.identity 메서드는 Object 타입을 반환하기 때문에, 반환된 값을 원하는 타입으로 캐스팅해야 합니다.
    // 이 과정에서 잘못된 타입으로 캐스팅하면 ClassCastException이 발생
    public static void main(String[] args) {

        String s = (String) identity("Hello");
        Integer i = (Integer) identity(123);

    }
}
