package java8.javastudy.class_java;

public class Class_Q5_ShopService {

    private static Class_Q5_ShopService singleton = new Class_Q5_ShopService();


    private Class_Q5_ShopService() {
    }

    static Class_Q5_ShopService getInstance(){
        return singleton;
    }
}
