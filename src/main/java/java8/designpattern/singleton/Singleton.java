package java8.designpattern.singleton;

/**
 * 우리는 보통 new 명령어를 통해 인스턴스를 생성해서 사용합니다. new 를통해 IDCard 클래스를 10번 호출하면 10개의 IDCard 인스턴스가 생기는 것이죠.
 * 그런데 클래스의 인스턴스가 단 하나만 필요한 경우가 있습니다. 시스템안에서 하나의 인스턴스만 생성되서 사용되야하는 클래스들인데
 * 예를 들면 회사내의 공공재로 사용하는 프린터나 컴퓨터등이 그렇습니다. 우리가 원한다고 마음대로 new를 통해 생성할수도 없습니다.
 * 물론, 조심해서 new를 한 번만 사용해서 1개의 인스턴스만 사용하겠다고 할 수도 있지만, 이것은 결코 지정한 클래스가 '절대로' 1개 밖에 존재하지 않는 것을 '보증' 할 수 없습니다.
 * 이처럼 인스턴스가 한 개밖에 존재하지 않는 것을 보증하는 패턴을 Singletone pattern 이라 합니다.
 */
public class Singleton {
    /*
    역할 :
        Singleton ⇒ Singleton 패턴에는 Singleton의 역할만이 존재합니다. Singleton 의 역할은 유일한 인스턴스를 얻기 위한 static 메소드를 가지고 있습니다.
        이 메소드는 언제나 동일한 인스턴스를 반환합니다.
     */
    private static Singleton singleton = new Singleton();

    protected Singleton(){
        System.out.println("created Singleton");
    }
    public static Singleton getInstance(){
        return singleton;
    }

}
