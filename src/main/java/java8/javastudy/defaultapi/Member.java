package java8.javastudy.defaultapi;

/**
 * 객체 동등 비교(equals() 메소드
 */
public class Member {

    public String id;

    public Member(String id) {
        this.id = id;
    }

    public boolean equals(Object obj){
        if(obj instanceof Member){ //매개 값이 defaultApiClass_equals 인지 확인
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }

       }

        return false;
    }
}
