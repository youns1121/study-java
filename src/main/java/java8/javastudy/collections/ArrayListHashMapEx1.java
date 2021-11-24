package java8.javastudy.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ArrayListHashMapEx1 {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String, String>>();
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "고양이");
        map.put("3", "송어지");
        map.put("2", "강아지");
        //key, value로 String의 값들을 넣어준다.
        list.add(map);


        for (int i = 0; i < list.size(); i++) {
            System.out.println("list 순서" + i + "번째");
            for (Map.Entry<String, String> elem : list.get(i).entrySet()) {
                //list 각각 HashMap받아서 출력한다
                System.out.println(String.format("키 : %s, 값 : %s", elem.getKey(), elem.getValue()));
            }
        }
    }
}
