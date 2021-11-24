package java8.javastudy.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Map 안에 리스트 넣기
public class ArrayListHashMapEx2 {
    public static void main(String[] args) {

        List list_1 = new ArrayList<Object>();
        ArrayList<HashMap<String, Object>> list_2 = new ArrayList<HashMap<String, Object>>();
        ArrayList<HashMap<String, Object>> list_3 = new ArrayList<HashMap<String, Object>>();
        HashMap<String, Object> map_1 = new HashMap<String, Object>();
        HashMap<String, Object> map_2 = new HashMap<String, Object>();
        HashMap<String, Object> map_3 = new HashMap<String, Object>();

        map_1.put("key_1","value_1");
        map_1.put("key_2","value_2");
        map_1.put("key_3", "value_3");

        map_3.put("key_1","value_1");
        map_3.put("key_2","value_2");
        map_3.put("key_3","value_3");


        list_1.add(map_1);
        list_2.add(map_1);



//        list_1.add(map_2);
        map_2.put("key_3", list_2);
        map_2.put("key_1", list_1);
        list_3.add(map_2);

   /*     for(int i=0; i<list_1.size(); i++) {
            System.out.println(list_1.get(i).toString());
        }
*/
         for (int i = 0; i < list_3.size(); i++) {
             System.out.println(list_3.get(i));
         }



    }
}
