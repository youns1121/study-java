package java8.designpattern.builder;

import static sun.tools.serialver.SerialVer.usage;

/*
프로젝트 구동시 인자값으로 주어지는 args 에따라 plain과 html으로 분기합니다.
둘 다 동일한 Director 클래스의 constructor()를 사용하여 동일한 비즈니스 로직을 타지만, 구현부분은 각각 다릅니다.
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }

        if (args[0].equals("plans")){
            TextBuilder textBuilder = new TextBuilder();
            Director director = new Director(textBuilder);
            director.constructor();
            String result = textBuilder.getResult();
            System.out.println(result);
        } else if (args[0].equals("html")){
            HTMLBuilder htmlBuilder = new HTMLBuilder();
            Director director = new Director(htmlBuilder);
            director.constructor();
            String filename = htmlBuilder.getResult();
            System.out.println(filename + "가 작성되었습니다");
        } else{
            usage();
            System.exit(0);
        }
    }
    public static void usage(){
        System.out.println("Usage: java Main plain 일반 텍스트로 문서 작성");
        System.out.println("Usage: java Main html HTML 파일 문서 작성");
    }
}
