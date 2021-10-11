package java8.designpattern.templatemethod;



/**
 * 템플릿은 비유하자면 일종의 붕어빵 틀, 타꼬야끼 틀과 비슷하다고 볼 수 있으며,알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴입니다.
 */
public class Solder extends  Citizen{ //병사

    private Weapon weapon;
    private Armor armor;

    public void attack(){
        if(weapon == null){
            System.out.println("맨손 공격");
        }
        weapon.attack();
    }

    public void defense(){
        if(armor == null){
            System.out.println("맨몸으로 방어!");
        }
        armor.defense();
    }

    public Solder(){
        super();
    }

    public Solder(Weapon weapon, Armor armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    public Solder(Citizen citizen){
        super(citizen);
    }

    public Armor getArmor(){
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Solder{" +
                "weapon=" + weapon +
                ", armor=" + armor +
                '}';
    }
}
