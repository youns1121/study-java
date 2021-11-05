package java8.javastudy.objectoriented.accessmodifier;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(15, 35, 30);

        System.out.println(t);
        //t.hour =13; 제어자가 private 이므로 접근할 수 없음

        t.setHour(t.getHour()+1); //현재 시간보다 + 1
        System.out.println(t);

    }

}

class Time{

    private int hour, minute, second; // 인스턴스 변수 생성


    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) { //hour이 0보다 작거나 23보다 클때
            return;
        }
            this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >59 ){
            return;
        }
        this.minute = minute;
    }


    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if(second < 0 || second > 59) return;
        this.second = second;
    }

    public String toString(){
        return hour + ":"+ minute +":" +second;
    }
}
