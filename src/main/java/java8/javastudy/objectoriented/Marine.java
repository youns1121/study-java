package java8.javastudy.objectoriented;

/**
 * 다음은 컴퓨터 게임의 병사(marine)를 클래스로 정의한 것이다. 이 클래스의 멤버
 * 중에 static을 붙여야 하는 것은 어떤 것들이고 그 이유는 무엇인가?
 * (단, 모든 병사의 공격력과 방어력은 같아야 한다.)
 */
/*
    weapon, armor 변수를 클래스 변수로 만든다, 공통적으로 적용해야 하기 때문
 */
public class Marine {

    int x=0, y=0; // Marine의 위치좌표(x,y)
    int hp = 60; // 현재 체력
    int weapon = 6; //공격력
    int armor = 0; // 방어력

    void setWeapon(){
        weapon++;
    }

    void armorUP(){
        armor++;
    }

    void move(int x, int y){
        this.x=x;
        this.y=y;
    }

    public Marine(int x, int y, int hp, int weapon, int armor) {
        this.x = x;
        this.y = y;
        this.hp = hp;
        this.weapon = weapon;
        this.armor = armor;
    }


}
