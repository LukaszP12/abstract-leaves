package pl.piwowarski;

/**
 * ConiferTree have more sort of needles as leaves and keep them thorough the whole winter
 * Drzewa iglaste posiadają raczej igły, niż tradycyjne liście i zachowują je przez całą zimę
 **/

public class ConiferTree extends AbstractTree {

    public ConiferTree(int age, double coneDiameterLength, int twigsNum, int leaves, int lifeSpan) {
        super(age, coneDiameterLength, twigsNum, leaves, lifeSpan);
    }

    public ConiferTree(double coneDiameterLength, int twigsNum, int leaves, int lifeSpan) {
        super(0, coneDiameterLength, twigsNum, leaves, lifeSpan);
    }

    /**
     * grow method
     * implements strategy design pattern
     */
    @Override
    void grow(YearPeriod yearPeriod) {
        if (getAge() >= getLifeSpan()) {
            System.out.println("our tree" + getClass().getName() + " has reached its life span and will not grow any more");
            return;
        }

        switch (yearPeriod) {
            case AUTUMN:
                super.setLeaves(getLeaves() + 50);
                super.setTwigsNum(getTwigsNum() + 1);
                break;
            case WINTER:
                break;
            case SPRING:
                super.setLeaves(getLeaves() + 150);
                super.setTwigsNum(getTwigsNum() + 2);
                break;
            case SUMMER:
                super.setLeaves(getLeaves() + 100);
                super.setTwigsNum(getTwigsNum() + 1);
                super.setAge(getAge() + 1);
                break;
        }
        super.setConeDiameterLength(getConeDiameterLength() + 1.5);
        System.out.println("ConiferTrees are evergreen, so they don't re-grow" + " our tree is growing through " + yearPeriod);
    }

    @Override
    public String toString() {
        return "ConiferTree{} " + super.toString();
    }
}
