package week1.day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 타입 안정 컬렉션
// DTO는 제너릭이 없어도 타입 안저이다.
// 그렇다고 Raw Type을 사용하면 타입 안정이 깨질 수 있다.
public class CollectionExample {
    public static void main(String[] args) {
        // 타입 안정 List
        List<UserImmutable> users = new ArrayList<>();

        users.add(new UserImmutable("Alice", 30));
        users.add(new UserImmutable("Bob", 25));

        for (UserImmutable user : users) {
            System.out.println(user.getName() + " - " + user.getAge());
        }

        // 타입 안정 Map
        Map<Long, UserImmutable> userMap = new HashMap<>();

        userMap.put(1L, new UserImmutable("Charlie", 35));

        UserImmutable user = userMap.get(1L);
        System.out.println(user.getAge());
    }
}
