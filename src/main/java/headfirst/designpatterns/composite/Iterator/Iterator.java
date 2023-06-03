package headfirst.designpatterns.composite.Iterator;

import headfirst.designpatterns.composite.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
    void remove();
}
