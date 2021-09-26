package java8.javastudy.loop;

import java.util.Scanner;

/**
 * while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해 보시오
 */
public class Loop_Q5 {

    public static void main(String[] args) {
        boolean run = true;

        int balance = 0;


        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.print("선택> ");

            int input = scanner.nextInt();

            int money = 0;

            switch (input) {
                case 1:
                    System.out.print("예금액> ");
                    money = scanner.nextInt();
                    balance += money;
                    System.out.println(" ");
                    continue;
                case 2:
                    System.out.print("출금액> ");
                    money = scanner.nextInt();
                    balance -= money;
                    continue;

                case 3:
                    System.out.print("잔고> ");
                    System.out.print(balance);
                    System.out.println(" ");
                    continue;
                case 4:

                    run = false;
                    break;


            }

            System.out.println("프로그램 종료");
        }

    }
}
