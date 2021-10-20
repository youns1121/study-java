package java8.designpattern.builder;

/**
 * 도시에 빌딩(building) 을 짓는 것을 build 라 합니다.
 * 빌딩을 짓는 순서는 우선 지반을 다지고 골격을 세우고, 아래에서 위로 조금씩 만들어 갑니다.
 * 이처럼 복잡한 구조물을 한 번에 완성시키는 것은 어렵기 때문에  전체를 구성하는 각 부분을 만들면서 단계를 밟아가며 만들어 나갑니다.
 * Builder 패턴 또한 이처럼 구조를 가진 인스턴스를 쌓아 올리는 방식의 패턴입니다.
 */
public abstract class Builder {
    /**
     * 문서를 만들 메소드들을 선언하고 있는 추상 클래스입니다.
     * 각각 타이틀(makeTitle), 문자열(makeString), 개별항목(makeItems)을 구현하는 메소드이고 마무리짓는 메소드는 close입니다.
     * Builder 역할은 인스턴스를 생성하기 위한 인터페이스(API)를 결정합니다. Builder역할에는 인스턴스의 각 부분을 만들기 위한 메소드가 준비되어 있습니다.
     */

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();
}
