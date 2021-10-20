package java8.designpattern.builder;

public class PersonInfoMain {
    public static void main(String[] args) {

//        PersonInfoBuilder personInfoBuilder = new PersonInfoBuilder();
//
//        PersonInfo personInfo = personInfoBuilder
//                .setName("Min")
//                .setAge(20)
//                .setFavoriteAnimal("뽀미")
//                .setFavoriteColor("blue")
//                .setFavoriteNumber(7)
//                .build();
//
//
//        System.out.println(personInfo.getPersonInfo());


        PersonInfo personInfo = PersonInfo.Builder()
                .setName("민식이네")
                .setAge(26)
                .setFavoriteAnimal("뽀미")
                .setFavoriteColor("BLUE")
                .setFavoriteNumber(777)
                .build();


        System.out.println(personInfo.getPersonInfo());

    }



}
