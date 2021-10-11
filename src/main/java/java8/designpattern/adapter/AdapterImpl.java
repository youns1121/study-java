package java8.designpattern.adapter;
/**
 * 어댑터 패턴(Adapter Pattern)
 * 알고리즘을 요구사항에 맞춰서 사용할 수 있도록 해주는 방법
 */
public class AdapterImpl implements Adapter{
    @Override
    public Float twiceOf(Float f) {
        return (float)Math.twoTime(f.doubleValue());
    }

    @Override
    public Float halfOf(Float f) {
        return (float) Math.half(f.doubleValue());
    }
}
