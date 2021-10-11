package java8.designpattern.templatemethod;

public class SoldierConscriptionHelperImpl extends AbstSoldierConscriptionHelper{
    @Override
    protected Citizen conscriptionCitizen() { // 시민들 중 마린이 될 수 있는 조건의 시민 징집합니다.
        System.out.println("징집");
        return new Citizen();
    }

    @Override
    protected void training(Citizen citizen) { //징집된 군인들을 훈련합니다.
        citizen.updateStrength(5); // 힘
        citizen.updateAgility(4); //민첩성
        citizen.updateIntelligence(-3); //지능
        System.out.println("병사 훈련!");
    }

    @Override
    protected void supplyEquipment(Solder solder) { //장비를 보급합니다.
        solder.setWeapon(new Gun());
        solder.setArmor(new StellAmor());
        System.out.println("장비 보급!");
    }

    @Override
    protected Solder changeOfPosition(Citizen citizen) { //보직을 시민에서 병사로 변경합니다.
        System.out.println("시민 -> 병사 변경!");
        return new Solder(citizen);
    }
}
