package pl.decoratorPatternExample;

import pl.piwowarski.ConiferTree;
import pl.piwowarski.DeciduousTree;
import pl.piwowarski.YearPeriod;

import java.util.List;

public class DecoratorMain {

    public static void main(String[] args) {

        BaseTree initialTreeSection = new BaseTree(List.of(new DeciduousTree(5, 10, 120, 100),
                new ConiferTree(8, 3, 100, 200),
                new ConiferTree(8, 0, 100, 200)));

        TreeSection treeSection1 = new TreeSection(initialTreeSection);
        treeSection1.addTree(new DeciduousTree(5.5, 12, 145, 100));
        treeSection1.addTree(new DeciduousTree(5.7, 14, 145, 100));
        treeSection1.addTree(new ConiferTree(8.5, 17, 110, 200));

        TreeSection treeSection2 = new TreeSection(treeSection1);
        treeSection2.addTree(new ConiferTree(8.5, 15, 130, 205));
        treeSection2.addTree(new ConiferTree(6.5, 11, 110, 205));
        treeSection2.addTree(new ConiferTree(7.5, 13, 135, 205));

        Growable beeHive = new BeeHive(treeSection2);

        TreeSection treeSection3 = new TreeSection(beeHive);
        treeSection3.addTree(new DeciduousTree(4.5, 10, 95, 100));
        treeSection3.addTree(new DeciduousTree(4.8, 9, 85, 100));

        for (YearPeriod yearPeriod : YearPeriod.values()) {
            treeSection3.grow(yearPeriod);
        }
    }

}
