package pl.decoratorPatternExample;

import pl.piwowarski.AbstractTree;
import pl.piwowarski.YearPeriod;

public abstract class TreeDecorator implements Growable {

    private AbstractTree tree;

    public TreeDecorator(AbstractTree tree) {
        this.tree = tree;
    }

    @Override
    public void growTheTree(YearPeriod yearPeriod) {
        tree.grow(yearPeriod);
    }
}
