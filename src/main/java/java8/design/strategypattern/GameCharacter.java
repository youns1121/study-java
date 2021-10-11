package java8.design.strategypattern;

/**
 * 전략 패턴(Strategy Pattern)
 * 여러 알고리즘을 하나의 추삭적인 접근점(Interface)을 만들어 접근점에서 서로 교환 가능(Deligate)하도록 하는 패턴
 */
public class GameCharacter{

    /**
     * 무기(Weapon)는 공격(attack)이라는 기능을 가지는 하나의 접근점(strategy)이 됩니다.
     *  setWeapon 메서드를 통해 접근점을 변경할 수 있습니다.
     *  weapon.attack() 으로 weapon에게 공격기능을 위임합니다.
     */

    //접근점
    private Weapon weapon;

    //교환기능
    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    public void attack(){
        if (weapon == null){
            System.out.println("맨손 공격");
        }else{
            //위임(Delegate)
            weapon.attack();
        }
    }

}
