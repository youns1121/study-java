package java8.javastudy.loop;

/**
 * 다음의 문장들을 조건식으로 표현하라.
 */
public class ex4_1 {
    public static void main(String[] args) {

        int x = 11; // 1
        if(x > 10 && x < 20){
            System.out.println(true); }

        char ch = 'a'; //2
        if (ch != ' ' && ch != '\t'){
            System.out.println(true); }

         if(ch == 'x' || ch =='X'){ //3
             System.out.println(true); }

         if(ch  >= '0' && ch <= '9'){ //4
             System.out.println(true); }

         if(ch >= 'a' && ch <= 'z' || ch >='A' && ch <= 'Z'){ //5
             System.out.println(true);
         }

         int year = 200; // 6
         if ((year % 400 == 0) || (year % 4 ==0 && year % 100 != 0)){
             System.out.println(true);
         }

         boolean powerOn = false ? true: false;//7
         System.out.println(powerOn);

         String str = "yes";//8
         if(str.equals("yes") ){
             System.out.println(true);
         }


    }
}
