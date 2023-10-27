package pl.decoratorPatternExample;

import pl.piwowarski.ConiferTree;
import pl.piwowarski.DeciduousTree;
import pl.piwowarski.YearPeriod;

public class DecoratorMain {

    public static void main(String[] args) {
        TreeSection treeSection = new TreeSection(new DeciduousTree(5, 10, 120, 100));
        treeSection.addTree((new ConiferTree(8, 3, 100, 200)));
        treeSection.addTree(new ConiferTree(8, 0, 100, 200));

        for (YearPeriod yearPeriod : YearPeriod.values()) {
            treeSection.growTheTree(yearPeriod);
        }
    }

}
