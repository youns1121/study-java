package java8.designpattern.prototype;

/**
 * 특정 객체의 인스턴스를 생성할때 우리는 new 명령어를 사용해서 생성합니다.  이처럼 new 를 사용해서 인스턴스를 만들 경우에는 클래스 이름을 반드시 지정해야 합니다.
 * 하지만, 클래스명을 지정하지 않고 인스턴스를 생성할 때도 있습니다.
 * 인스턴스로부터 다른 인스턴스를 만드는 것은 복사기를 사용하는것과 비슷합니다. 원본 서류를 어떻게 만들었는지 몰라도 복사기로 같은 종류의 서류를 몇 장이든 만들 수 있습니다.
 * Java에서는 cloneable 인터페이스와 clone 메소드를 이용합니다.
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
