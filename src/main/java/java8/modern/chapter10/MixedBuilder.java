package java8.modern.chapter10;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class MixedBuilder {

    public static Order forCustomer(String customer, TradeBuilder... builders) {

        Order order = new Order();
        order.setCustomer(customer);
        Stream.of(builders).forEach(b -> order.addTrade(b.trade));
        return order;
    }

    public static TradeBuilder sell(Consumer<TradeBuilder> consumer) {

        return buildTrade(consumer, Trade.Type.SELL);
    }

    public static TradeBuilder buy(Consumer<TradeBuilder> consumer) {

        return buildTrade(consumer, Trade.Type.BUY);
    }

    private static TradeBuilder buildTrade(Consumer<TradeBuilder> consumer, Trade.Type buy) {

        TradeBuilder builder = new TradeBuilder();
        builder.trade.setType(buy);
        consumer.accept(builder);
        return builder;
    }

    public static void main(String[] args) {

        /**
         * 10.3.4 조합하기
         */
        Order order = forCustomer("BigBank",
                buy(t -> t.quantity(80)
                        .stock("IBM")
                        .on("NYSE")
                        .at(125.00)),
                sell(t -> t.quantity(50)
                        .stock("GOOGLE")
                        .on("NASDAQ")
                        .at(125.00)));

        System.out.println("order = " + order.getCustomer());
    }
}
