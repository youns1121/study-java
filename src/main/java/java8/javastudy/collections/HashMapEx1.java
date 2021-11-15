package java8.javastudy.collections;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234"); //지정된 키와 값을 HashMap에 저장
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in); //화면으로부터 라인단위로 입력받는다.

        while (true) {
            System.out.println("id와 password를 입력해 주세요.");
            System.out.print("id :");
            String id = s.nextLine().trim();

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) { // HashMap에 지정된 key가 포함되어 있는지 알려준다 포함되면 true
                System.out.println("입력하신 id는 존재하지 않습니다" + " 다시입력해 주세요.");
            } else {
                if (!(map.get(id).equals(password))) {// 지정된 키(key)의 값 반환 못찾으면 null
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                } else {
                    System.out.println("id와 비밀번호가 일치합니다.");
                    break;
                }
            }
        }
    }
}
