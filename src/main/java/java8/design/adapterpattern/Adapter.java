package java8.design.adapterpattern;
/**
 * 어댑터 패턴(Adapter Pattern)
 * 알고리즘을 요구사항에 맞춰서 사용할 수 있도록 해주는 방법
 */
public interface Adapter {
    /**
     * Adapter Interface 및 메서드 작성
     */
    public Float twiceOf(Float f);
    public Float halfOf(Float f);
}
