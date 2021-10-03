package java8.javastudy.class_java;

public class Class_Q6_Account {

    //상수 선언
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;

    public int balance=0;


    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if(balance > MIN_BALANCE && balance <= MAX_BALANCE){
            this.balance = balance;
        }
        else getBalance();

    }
}
