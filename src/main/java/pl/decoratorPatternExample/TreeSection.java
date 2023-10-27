package pl.decoratorPatternExample;

import pl.piwowarski.AbstractTree;
import pl.piwowarski.YearPeriod;

import java.util.ArrayList;
import java.util.List;

public class TreeSection extends TreeDecorator implements Growable {

    private List<AbstractTree> trees = new ArrayList<>();

    public TreeSection(AbstractTree parentTree) {
        super(parentTree);
    }

    public void addTree(AbstractTree tree) {
        trees.add(tree);
    }

    @Override
    public void grow(YearPeriod yearPeriod) {
        super.grow(yearPeriod);
        trees.stream().forEach(t -> t.grow(yearPeriod));
    }
}
