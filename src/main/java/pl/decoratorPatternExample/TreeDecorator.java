package pl.decoratorPatternExample;

import pl.piwowarski.AbstractTree;
import pl.piwowarski.YearPeriod;

public abstract class TreeDecorator implements Growable {

    private AbstractTree tree;

    public TreeDecorator(AbstractTree groweable) {
        tree = groweable;
    }

    @Override
    public void grow(YearPeriod yearPeriod) {
        tree.grow(yearPeriod);
    }
}
