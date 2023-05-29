package headfirst.designpatterns.composite;

import headfirst.designpatterns.composite.Iterator.DinerMenuIterator;
import headfirst.designpatterns.composite.Iterator.Iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주의자용 BLT", "통밀 위에 콩고기과 베이컨과 상추 그리고 토마토를 얹은 메뉴", true, 2.99);
        addItem("BLT", "통밀 위에 베이컨과 상추 그리고 토마토를 얹은 메뉴", false, 2.99);
        addItem("오늘의 스프y", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        addItem("핫도그", "샤워크라우트와 갖은 양념과 양파 그리고 치즈가 곁들여진 핫도그", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {

        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("죄송합니다 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        } else {
            menuItems[numberOfItems]= menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
}
