package java8.javastudy.class_java;

/**
 * Class_Q5_ShopService 객체를 싱글톤으로 만들고 싶습니다, Class_Q5 클래스에서 Class_Q5_ShopService의 getInstance() 메소드로 싱글톤을 얻을 수 있도록 클래스를 작성하시오
 */
public class Class_Q5 {

    public static void main(String[] args) {
        Class_Q5_ShopService obj1 = Class_Q5_ShopService.getInstance();
        Class_Q5_ShopService obj2 = Class_Q5_ShopService.getInstance();

        if(obj1 == obj2){
            System.out.println("같은 Class_Q5_ShopService 객체 입니다.");
        } else{
            System.out.println("다른 Class_Q5_ShopService 객체 입니다.");
        }


    }
}
