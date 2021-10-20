package java8.designpattern.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
//        Singleton singleton = new Singleton();
//        singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        Singleton instance3 = Singleton.getInstance();

        System.out.println("instance1과 instance2 동일성 비교:"+ (instance1==instance2)); //true
//        System.out.println("instance1과 instance2 객체 비교:"+ (instance1.equals(instance2))); //true

        System.out.println("end");
    }
}
