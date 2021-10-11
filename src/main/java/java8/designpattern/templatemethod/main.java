package java8.designpattern.templatemethod;

/**
 * 위와 같이 구현을 하게되면 각각의 상세 요구사항들을 모듈화 했기 때문에 재사용성을 높히고 강화되거나 변경된 정책이나 요구사항을 적용하기가 더 편해집니다.
 * 예를들어 훈련내용이 변경되어 근력강화 훈련을 줄이고, 지능 강화훈련을 높혀서 시민의 스탯변경을 바꾸려고하면 SoldierConscriptionHelperImpl 구현체의 traning 메서드내용만 변경하면 됩니다.
 * 결론: 이처럼 일정한 프로세스 를 가진 요구사항을 알고리즘으로 정의할 때 알고리즘의 구조를 메소드에 정의 후 하위 클래스에서 알고리즘 구조의 변경 없이 알고리즘을 재정의 하는 패턴을 템플릿 메서드 패턴이라 합니다.
 */
public class main {
    public static void main(String[] args) {
//        Citizen h1 = new Citizen();
        SoldierConscriptionHelperImpl helper = new SoldierConscriptionHelperImpl();
        Solder solder = helper.conscription(); // 시민들을 징집해서 병사로 만들기
        solder.attack();
        solder.defense();
    }
}
