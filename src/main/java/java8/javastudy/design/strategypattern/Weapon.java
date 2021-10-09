package java8.javastudy.design.strategypattern;

/**
 * 전략 패턴(Strategy Pattern)
 * 여러 알고리즘을 하나의 추삭적인 접근점(Interface)을 만들어 접근점에서 서로 교환 가능(Deligate)하도록 하는 패턴
 */
public interface Weapon {
    void attack();
}
