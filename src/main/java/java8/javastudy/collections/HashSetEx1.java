package java8.javastudy.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx1 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>(); //HashSet : 순서없이 저장, 중복 X

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size(); //저장된 객체수 얻기
        System.out.println("총 객체수: " + size);

        Iterator<String> iterable = set.iterator(); // 반복자 얻기
        while(iterable.hasNext()) { // 객체수 만큼 반복

            String element = iterable.next(); // 한 개의 객체를 가져온다
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체수: " + set.size()); //저장된 객체 수 얻기

        iterable = set.iterator(); //반복자 얻기

        while (iterable.hasNext()){

            String element = iterable.next();
            System.out.println("\t" + element);
        }

        set.clear();
        if(set.isEmpty()){ // 모든 객체를 제거하고 비움
            System.out.println("비어있음");
        }



    }
}
