package java8.designpattern.templatemethod;

/**
 * 템플릿은 비유하자면 일종의 붕어빵 틀, 타꼬야끼 틀과 비슷하다고 볼 수 있으며,알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴입니다.
 */
public class Citizen{ // 시민

    /**
     * 시민들 중 마린이 될 수 있는 조건의 시민 징집합니다.
     * conscriptionCitizen():Citizen
     */

    private String id;
    private String age;
    private String name;
    private String position;
    private int strength; // 힘
    private int agility; // 민첩성
    private int intelligence; //지능

    @Override
    public String toString() {
        return "Citizen{" +
                "id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", strength=" + strength +
                ", agility=" + agility +
                ", intelligence=" + intelligence +
                '}';
    }

    public Citizen(Citizen citizen) {
        this.id = citizen.getId();
        this.age = citizen.getAge();
        this.name = citizen.getName();
        this.position = citizen.getPosition();
        this.strength = citizen.getStrength();
        this.agility = citizen.getAgility();
        this.intelligence = citizen.getIntelligence();
    }

    public void updateStrength(int stat){
        strength += stat;
    }

    public void updateAgility(int stat){
        agility += stat;
    }

    public void updateIntelligence(int stat){
        intelligence += stat;
    }

    public Citizen(String id, String age, String name, String position, int strength, int agility, int intelligence) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.position = position;
        this.strength = strength;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public Citizen() {
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
