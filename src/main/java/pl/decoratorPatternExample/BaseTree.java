package pl.decoratorPatternExample;

import pl.piwowarski.AbstractTree;
import pl.piwowarski.YearPeriod;

import java.util.List;

public class BaseTree implements Growable {

    private List<AbstractTree> trees;

    public BaseTree(List<AbstractTree> trees) {
        this.trees = trees;
    }

    @Override
    public void grow(YearPeriod yearPeriod) {
        trees.stream().forEach(t -> t.grow(yearPeriod));
    }
}
