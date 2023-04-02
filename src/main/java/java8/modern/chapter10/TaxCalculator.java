package java8.modern.chapter10;

import java.util.function.DoubleUnaryOperator;

public class TaxCalculator {

    /**
     * 리펙터링 전
     */
//    private boolean useRegional;
//    private boolean useGeneral;
//    private boolean useSurcharge;
//
//    public TaxCalculator withTaxRegional() {
//        useRegional = true;
//        return this;
//    }
//
//    public TaxCalculator withTaxGeneral() {
//        useGeneral = true;
//        return this;
//    }
//
//    public double calculate(Order order) {
//        return Tax.calculate(order, useRegional, useGeneral, useSurcharge);
//    }

    public DoubleUnaryOperator taxFunction = d -> d;

    public TaxCalculator with(DoubleUnaryOperator f) {
        taxFunction = taxFunction.andThen(f);
        return this;
    }

    public double calculate(Order order) {
        return taxFunction.applyAsDouble(order.getValue());
    }
}
