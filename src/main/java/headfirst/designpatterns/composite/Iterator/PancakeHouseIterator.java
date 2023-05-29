package headfirst.designpatterns.composite.Iterator;

import headfirst.designpatterns.composite.MenuItem;

import java.util.List;

public class PancakeHouseIterator implements Iterator{

    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = menuItems.get(position);
        position += 1;
        return menuItem;
    }
}
