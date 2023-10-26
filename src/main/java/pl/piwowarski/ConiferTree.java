package pl.piwowarski;

/**
 * ConiferTree have more sort of needles as leaves and keep them thorough the whole winter
 * Drzewa iglaste posiadają raczej igły, niż tradycyjne liście i zachowują je przez całą zimę
 **/

public class ConiferTree extends AbstractTree {

    public ConiferTree(int coneDiameterLength, int twigsNum, int leaves) {
        super(coneDiameterLength, twigsNum, leaves);
    }

    @Override
    void grow(YearPeriod yearPeriod) {
        switch (yearPeriod) {
            case AUTUMN:
                super.setLeaves(getLeaves() + 50);
                super.setTwigsNum(getTwigsNum() + 1);
                break;
            case WINTER:
                super.setTwigsNum(getTwigsNum() - 2);
                break;
            case SPRING:
                super.setLeaves(getLeaves() + 150);
                super.setTwigsNum(getTwigsNum() + 2);
                break;
            case SUMMER:
                super.setLeaves(getLeaves() + 100);
                super.setTwigsNum(getTwigsNum() + 1);
                break;
        }
        super.setConeDiameterLength(getConeDiameterLength() + 4);
        System.out.println("ConiferTrees are evergreen, so they don't re-grow" + " our tree is growing through " + yearPeriod);
    }

    @Override
    public String toString() {
        return "ConiferTree{} " + super.toString();
    }
}
