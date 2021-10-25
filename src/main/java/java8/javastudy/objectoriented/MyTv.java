package java8.javastudy.objectoriented;

//Ex6_21
/*
    Tv 클래스를 주어진 로직대로 완성하시오 완성한 후에 실행해서 주어진 실행결과
와 일치하는지 확인하라.

 */
public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void trunOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        if (isPowerOn == true) {
            isPowerOn = false;
        } else {
            isPowerOn = true;
        }

//        isPowerOn == true ? false:true;
    }

    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    void channelUp() {

        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        }
        channel++;
    }

    void channelDown() {
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        }
        channel--;

    }
}

class Ex6_21{
    public static void main(String[] args) {
        MyTv t = new MyTv();

        t.channel = 100;
        t.volume = 0;
        System.out.println("CH: "+t.channel+", VOL:"+t.volume);

        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);

        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+t.volume);
    }
}





