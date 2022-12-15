package java8.javastudy.lamda;

public class RunMain {

    public static void main(String[] args) {
        int testNum = 20;

        //기존에 사용하는 방법
        RunSomting runSomting = new RunSomting() {
            @Override
            public int dolt(int number) {

                //testNum++; 사이드 이펙트를 만들 수 없다. (함수 밖에 있는 값을 변경하지 못한다.)

                return testNum + 10;
            }
        };

        System.out.println(runSomting.dolt(10));

        //람다 사용시
        RunSomting runSomtingLamda = (number) -> {
            //testNum++; 사이드 이펙트를 만들 수 없다.(함수 밖에 있는 값을 변경하지 못한다.)
            return number + 20 + testNum;
        };
        System.out.println(runSomtingLamda.dolt(1));
    }
}
