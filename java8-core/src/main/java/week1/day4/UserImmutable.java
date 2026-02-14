package week1.day4;

// 불변DTO
// 객체 생성 후 값 변경 불가능
// 장점 : 객체의 상태가 변경되지 않기 때문에, 멀티스레드 환경에서 동기화 문제 발생하지 않음
// 단점 : 객체의 상태가 변경되지 않기 때문에, 객체를 새로 생성해야 하는 경우가 많아질 수 있음
public class UserImmutable {
    private final String name;
    private final int age;

    public UserImmutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
