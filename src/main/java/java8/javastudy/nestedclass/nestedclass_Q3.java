package java8.javastudy.nestedclass;

/**
 * 다음 nestedclass_Q3 클래스는 컴파일 에러가 발생합니다. 원인이 무엇입니까?
 */
public class nestedclass_Q3 {
    void startChart(String chartId){
        String nickName = null;
        nickName = chartId;
        Chat chat = new Chat(){
            @Override
            public void start(){
                while(true){
                    String inputDate = "안녕하세요";
                    // null은 변경 할 수 없는 상수 final nickName에 값을 넣으려고 하니 컴파일 에러가 발생
                    String message = "[" + nickName + "]" + inputDate;
                    sendMessage(message);
                }
            }
        };
        chat.start();


    }

    class Chat {
        void start(){}
        void sendMessage(String message){}
    }
}
