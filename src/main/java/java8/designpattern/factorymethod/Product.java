package java8.designpattern.factorymethod;

/**
 * 객체를 만들어내는 부분을 서브 클래스(SUB-CLASS)에 위임하는 패턴
 * 즉 new 명령어를 호출해 객체를 생성하는 역할을 서브 클래스에 위임하는 것입니다.  결국 팩토리 메소드 패턴은 객체를 만들어내는 공장을 만드는 패턴이라 할 수 있습니다.
 * 팩토리 메소드 패턴에서는 인스턴스를 만드는 방법을 상위 클래스 측에서 결정하지만 구체적인 클래스명 까지는 결정하지 않습니다.
 * 구체적인 내용은 모두 하위 클래스 측에서 수행합니다. 따라서 인스턴스 생성을 위한 골격(framework)과 실제의 인스턴스 생성의 클래스를 분리해서 생각할 수 있습니다.
 */
public abstract class Product {


    /**
     * Product(제품)
     * ⇒ framework 에 포함되있습니다. 이 패턴에서 생성되는 인스턴스가 가져야 할 인터페이스(API)를 결정하는 것은 추상 클래스입니다. 구체적인 내용(구현부)은 ConcreteProduct 역할이 결정합니다.
     *  골격(framework)에서는 제품의 골격인 Product와 제품을 생성하는 Factory가 있습니다.
     *   Product에서는 제품을 사용합니다. → use
     */
    public abstract void use();
}
