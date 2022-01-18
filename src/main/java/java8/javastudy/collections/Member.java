package java8.javastudy.collections;

public class Member {

    public String name;
    public int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) { // name과 age값이 같으면 true를리턴

        if(obj instanceof Member) {
            Member member = (Member) obj;

            return member.name.equals(name) && (member.age == age);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    } //String의 hashCode() 이용
}
