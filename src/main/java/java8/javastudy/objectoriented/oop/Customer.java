package java8.javastudy.objectoriented.oop;

public class Customer { //고객

    private int changes;
    private String hasJuice = null;

    public Customer(int changes){
        this.changes=changes;
    }

    public int getChanges() {
        return changes;
    }

    public void setHasJuice(String hasJuice) {
        this.hasJuice = hasJuice;
    }

    //잔액 설정
    public void resettingJuice(int changes, String hasJuice){
        this.changes = changes;
        this.hasJuice = hasJuice;
    }

    @Override
    public String toString() {
        return "잔액 : " + changes + "\t갖고있는 음료 : " + hasJuice;
    }
}
