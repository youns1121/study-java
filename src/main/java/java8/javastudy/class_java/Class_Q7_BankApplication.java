package java8.javastudy.class_java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 다음은 키보드로부터 계좌 정보를 입력받아서, 계좌를 관리하는 프로그램입니다. 실행 결과를 보고, 알맞게 BankApplication 클래스의 메소드를 작성해보세요
 */
public class Class_Q7_BankApplication {

    private static Class_Q7_Account[] accountArray = new Class_Q7_Account[100];
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
//        Class_Q7_Account account = new Class_Q7_Account();

        boolean run = true;

        while (run) {
            System.out.println("--------------------------------------");
            System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료");
            System.out.println("--------------------------------------");
            System.out.print("선택> ");
            int selectNo = scanner.nextInt();

            if (selectNo == 1) {
                createAccount();
            } else if (selectNo == 2) {
                accountList();
            } else if (selectNo == 3) {
                deposit();
            } else if (selectNo == 4) {
                withdraw();
            } else if (selectNo == 5) {
                run = false;
            }

        }
        System.out.println("프로그램 종료");


    }

    //출금
    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.print("계좌번호 : ");
        String ano = scanner.next();
        System.out.print("출금액 : ");
        int money = scanner.nextInt();

        Class_Q7_Account newAccount = findAccount(ano);
        if(ano == null){
            System.out.println("계좌가 없습니다.");
        } else{
            newAccount.setBalance(newAccount.getBalance()-money);
            System.out.println("출금에 성공했습니다.");
        }




    }

    //예금하기
    private static void deposit() {
        System.out.println("----------");
        System.out.println("예금");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String ano = scanner.next();
        System.out.print("예금액: ");
        int money = scanner.nextInt();

        Class_Q7_Account newAccount = findAccount(ano);

        if (ano == null) {
            System.out.println("계좌가 없습니다.");
        } else {
            newAccount.setBalance(newAccount.getBalance() + money);
            System.out.println("예금에 성공했습니다.");
        }


    }

    //계좌목록
    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌목록");
        System.out.println("----------");

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] != null) {
                System.out.printf("%s\t\t%s\t%d\n", accountArray[i].getAno(), accountArray[i].getOwner(), accountArray[i].getBalance());
            }

        }

    }

    //계좌생성
    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌생성");
        System.out.println("----------");
        System.out.print("계좌번호: ");
        String a = scanner.next();
        System.out.print("계좌주: ");
        String b = scanner.next();
        System.out.print("초기입금액: ");
        int c = scanner.nextInt();

        Class_Q7_Account account = new Class_Q7_Account(a, b, c);

        for (int i = 0; i < accountArray.length; i++) {
            if (accountArray[i] == null) {
                accountArray[i] = account;
                System.out.println("결과: 계좌가 생성되었습니다.");
                break;
            }
        }
    }

    //Class_Q7_Account 배열에서 ano와 동일한 Account 객체 찾기
    private static Class_Q7_Account findAccount(String ano) {
        for (int i = 0; i < accountArray.length; i++) {
            if (ano.equals(accountArray[i].getAno())) {
                return accountArray[i];
            }


        }
        return null;
    }



}
