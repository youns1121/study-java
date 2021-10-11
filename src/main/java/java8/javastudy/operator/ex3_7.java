package java8.javastudy.operator;

/**
 * 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다. 변환공식이 "C = 5/9 * (F - 32)"라고 할 떄, (1)에 알맞은 코드를 넣으시오. 단, 변환 결과값은 소수점 셋째자리에서 반올림해야한다.
 * (Math.round()를 사용하지 않고 처리할 것)
 *
 * float celcius = (int)((5/9f * (fahrenheit - 32))*100 + 0.5) / 100f;
 * 5/9는 int로는 0이 나오기 때문에, 정수형 리터럴인 9 대신  float 타입인 9f로 나눠주면 소숫점까지 계산된다.
 * 계산 결과를 반올림 하려면 *100 한 후 +0.5 더해주기. int타입으로 변환하면 소숫점 아래 삭제되고, 다시 100으로 나눈다. 그런데 이때 그냥 100으로 나누면 소숫점 아래값이 사라지므로, 똑같이  float 타입인 100f로 나눠주면 소숫점이 그대로 유지된다.
 */
public class ex3_7 {

    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius =   (float) (((int)(((float)5/9 * (fahrenheit - 32) ) *100+1)) / 100.);

        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println("Celcius: "+ celcius);


    }

}
