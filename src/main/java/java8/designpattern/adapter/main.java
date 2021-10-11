package java8.designpattern.adapter;
/**
 * 어댑터 패턴(Adapter Pattern)
 * 알고리즘을 요구사항에 맞춰서 사용할 수 있도록 해주는 방법
 */
public class main {
    /**
     * 기존에 존재하던 twoTime, half 메서드를 이용해서 전혀 다른 인자값을 받아 로직을 수행하도록 완성되었습니다.
     */
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();
        System.out.println(adapter.twiceOf(100f));
        System.out.println(adapter.halfOf(50f));

    }

}
