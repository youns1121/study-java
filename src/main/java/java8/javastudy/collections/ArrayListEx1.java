package java8.javastudy.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(); //ArrayList 생성
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4)); // 1부터 4사이에 저장된 객체를 반환 -> 2,3,4
        print(list1, list2);

        Collections.sort(list1); // list1을 오름차순정렬
        Collections.sort(list2); // list2를 오름차순정렬

        System.out.println("list1.containsAll(list2):" + list1.containsAll(list2)); // list1이 컬렉션 list2를 포함 확인 맞으면 True

        list2.add("B"); //list에 마지막에 객체 추가 성공사면 true
        list2.add("C");
        list2.add("A");
        print(list1, list2);

        list2.set(3,"AA"); //주어진 객체(element)를 지정된 위치(index)에 저장
        print(list1,list2);

        //list1에서 list2와 겹치는 부분과 남기고 나머지는 삭제.
        System.out.println("list1.retainAll(list2): "+list1.retainAll(list2)); // list1에 list2가 포함되냐

        //list2에서 list1에 포함된 객체들을 삭제한다.
        for(int i=list2.size()-1; i >=0; i--){
            if(list1.contains(list2.get(i))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
}
