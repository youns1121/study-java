package java8.javastudy.objectoriented.polymorphism;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();

        FireEngine fe2 = null;

        fe.water();
        car = fe; // car =(Car)fe; 에서 형변환이 생략된 상태

//        fe2.water(); // fe2가 null인 상태에서 메서드를 호출함
//        car.water(); Car타입의 참조변수로는 water()를 호출할 수 없음
        fe2 = (FireEngine) car; // 자손타입 <- 조상타입
        fe2.water();


    }
}

class Car{
    String color; //색상
    int door;

    void drive(){ //운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop(){ //멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car{ //소방차
    void water(){
        System.out.println("water!!!!");
    }
}
