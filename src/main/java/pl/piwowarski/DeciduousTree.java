package pl.piwowarski;

/**
 * DeciduousTree usually loses leaves in autumn
 * Drzewa liściaste zazwyczaj tracą liście jesienią
 **/

public class DeciduousTree extends AbstractTree {

    public DeciduousTree(int coneDiameterLength, int twigsNum, int leaves, int lifeSpan) {
        super(0, coneDiameterLength, twigsNum, leaves, lifeSpan);
    }

    public DeciduousTree(int age, int coneDiameterLength, int twigsNum, int leaves, int lifeSpan) {
        super(age, coneDiameterLength, twigsNum, leaves, lifeSpan);
    }

    /**
     * grow method
     * implements strategy design pattern
     */
    @Override
    public void grow(YearPeriod yearPeriod) {
        if (getAge() >= getLifeSpan()) {
            System.out.println("our tree" + getClass().getName() + " has reached its life span and will not grow any more");
            return;
        }

        switch (yearPeriod) {
            case AUTUMN:
                super.setLeaves(0);
                super.setTwigsNum(getTwigsNum() - 5);
                break;
            case WINTER:
                break;
            case SPRING:
                super.setLeaves(getLeaves() + 200);
                super.setTwigsNum(getTwigsNum() + 3);
                break;
            case SUMMER:
                super.setLeaves(getLeaves() + 100);
                super.setTwigsNum(getTwigsNum() + 2);
                super.setAge(getAge() + 1);
                break;
        }

        super.setConeDiameterLength(getConeDiameterLength() + 2);
        System.out.println("Have a re-growth period (often during the summer) to develop the foliage" + " our tree " + "DeciduousTree" + " is growing through " + yearPeriod);
    }

    @Override
    public String toString() {
        return "DeciduousTree{} " + super.toString();
    }
}
