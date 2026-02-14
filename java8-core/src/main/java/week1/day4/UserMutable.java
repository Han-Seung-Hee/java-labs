package week1.day4;

// 가변DTO
// 객체 생성 후 값 변경 가능
// 단점 : 객체의 상태가 변경될 수 있기 때문에, 멀티스레드 환경에서 동기화 문제 발생 가능
public class UserMutable {
    private String name;
    private int age;

    public UserMutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
