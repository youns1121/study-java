package java8.modern.chapter10;

public class MethodChainingOrderBuilder {

    public Order order = new Order();

    public MethodChainingOrderBuilder(String customer) {
        order.setCustomer(customer);
    }

    public static MethodChainingOrderBuilder forCustomer(String customer) {
        return new MethodChainingOrderBuilder(customer);
    }

//    public TradeBuilder buy(int quantity) {
//        return new TradeBuilder(this, Trade.Type.BUY, quantity);
//    }
//
//    public TradeBuilder sell(int quantity) {
//        return new TradeBuilder(this, Trade.Type.SELL, quantity);
//    }

    public MethodChainingOrderBuilder addTrade(Trade trade) {
        order.addTrade(trade);
        return this;
    }

    public Order end() {
        return order;
    }

    public static void main(String[] args) {

        /**
         * 10.3.1 메서드 체인
         */

//                forCustomer("BigBank")
//                .buy(80)
//                .stock("IBM")
//                .on("NYSE")
//                .at(125.00)
//                .sell(50)
//                .stock("GOOGLE")
//                .on("NASDAQ")
//                .at(375.00)
//                .end();


    }
}
