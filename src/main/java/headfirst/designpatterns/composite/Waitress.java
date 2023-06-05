package headfirst.designpatterns.composite;

import headfirst.designpatterns.composite.component.MenuComponent;

public class Waitress {

    MenuComponent allMenus;
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
