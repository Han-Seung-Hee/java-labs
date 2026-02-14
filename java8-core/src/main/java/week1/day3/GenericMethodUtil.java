package week1.day3;

public class GenericMethodUtil {
    // ObjectUitl.identity 메서드를 저네릭 클래스로 교정
    public static <T> T identity(T value) {
        return value;
    }

    // 제네릭 메서드의 타입 검사
    // 컴파일 타임에 타입이 결정되나 런타임에서는 어떤 타입인지 모르므로 , class 를 인자로 받아서 타입 검사를 수행
    public static <T> boolean isInstance(Object obj, Class<T> type) {
        return type.isInstance(obj);
    }

    public static void main(String[] args) {
        String s = identity("Hello");
        Integer i = identity(123);

        boolean res = isInstance("Hello", String.class);

    }
}
