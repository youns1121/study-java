package java8.javastudy.objectoriented;

//ex6_3
public class Student {

    public String name;
    public int ban;
    public int no;
    public int kor;
    public int eng;
    public int math;

    public int getTotal(){

        return kor + eng + math;
    }

    public float getAverage(){

        return getTotal()/3;
    }
}
