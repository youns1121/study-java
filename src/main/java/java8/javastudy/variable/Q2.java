package java8.javastudy.variable;

/**
 * 다음 중 형변환을 생략할 수 있는 것은?
 */
public class Q2 {



    public static void main(String[] args) {
        byte b = 10;
        char ch = 'A';
        int i = 100;
        long l = 1000L;

        b = (byte)i;
        ch = (char)b;
        short s = (short)ch;
        float f = (float)l;
        i = (int)ch;
    }
}
