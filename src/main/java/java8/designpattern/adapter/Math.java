package java8.designpattern.adapter;
/**
 * 어댑터 패턴(Adapter Pattern)
 * 알고리즘을 요구사항에 맞춰서 사용할 수 있도록 해주는 방법
 */

public class Math {
    /**
     * 기존에 double 타입의 값을 받아 두배를 반환하는 twoTime 메서드와 절반을 반환하는 half가 있습니다.
     */

    public static double twoTime(double num){
        return num * 2;
    }

    public static double half(double num){
        return num / 2;
    }
}
