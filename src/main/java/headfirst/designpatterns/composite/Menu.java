package headfirst.designpatterns.composite;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
