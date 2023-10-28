package pl.decoratorPatternExample;

import pl.piwowarski.AbstractTree;
import pl.piwowarski.YearPeriod;

import java.util.List;

public class TreeExtension implements Growable {

    private Growable treeSection;

    public TreeExtension(Growable treeSection) {
        this.treeSection = treeSection;
    }

    public void grow(YearPeriod yearPeriod) {
        treeSection.grow(yearPeriod);
    }

}
