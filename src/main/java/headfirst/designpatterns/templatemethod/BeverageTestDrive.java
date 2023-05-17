package headfirst.designpatterns.templatemethod;

public class BeverageTestDrive {
    public static void main(String[] args) {

        CoffeeWithHook coffeeHook = new CoffeeWithHook();

        System.out.println("\n커피 준비 중...");
        coffeeHook.prepareRecipe();
    }
}
