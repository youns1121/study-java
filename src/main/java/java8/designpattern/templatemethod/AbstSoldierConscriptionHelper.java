package java8.designpattern.templatemethod;

/**
 * 템플릿은 비유하자면 일종의 붕어빵 틀, 타꼬야끼 틀과 비슷하다고 볼 수 있으며,알고리즘의 구조를 메소드에 정의하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 재정의 하는 패턴입니다.
 * 사용처
 * 일정한 프로세스 를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있습니다.
 * ex: Spring Security의 인증및 인가과정,  애노테이션 프로세서의 라운드구조, 로직의 완성까지의 로직이 순차적인 일정한 단계가 있는 경우 등.
 */

public abstract class AbstSoldierConscriptionHelper {

    protected abstract Citizen conscriptionCitizen(); // 시민들 중 마린이 될 수 있는 조건의 시민 징집합니다.

    protected abstract void training(Citizen citizen); //징집된 군인들을 훈련합니다.

    protected abstract void supplyEquipment(Solder solder); //보직을 시민에서 병사로 변경합니다.

    protected abstract Solder changeOfPosition(Citizen citizen);//장비를 보급합니다.

    public Solder conscription(){ //시민들을 징집해서 병사로 만들어 주세요.
        Citizen citizen = conscriptionCitizen();
        training(citizen);
        Solder solder = changeOfPosition(citizen);
        supplyEquipment(solder);
        return solder;
    }
}
