package pl.piwowarski;


public class DemoClass {

    public static void main(String[] args) {
        DeciduousTree deciduousTree = new DeciduousTree(5, 10, 120);

        for (YearPeriod yearPeriod : YearPeriod.values()) {
            deciduousTree.grow(yearPeriod);
        }

        System.out.println(deciduousTree);

        ConiferTree coniferTree = new ConiferTree(8, 3, 100);
        for (YearPeriod yearPeriod : YearPeriod.values()) {
            coniferTree.grow(yearPeriod);
        }

        System.out.println(coniferTree);

        ConiferTree coniferTree2 = new ConiferTree(8, 0, 100);
        for (YearPeriod yearPeriod : YearPeriod.values()) {
            coniferTree2.grow(yearPeriod);
        }

        System.out.println(coniferTree2);
    }

}
