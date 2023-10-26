package pl.piwowarski;

/**
 * DeciduousTree usually loses leaves in autumn
 * Drzewa liściaste zazwyczaj tracą liście jesienią
 **/

public class DeciduousTree extends AbstractTree {

    public DeciduousTree(int coneDiameterLength, int twigsNum, int leaves) {
        super(coneDiameterLength, twigsNum, leaves);
    }

    @Override
    void grow(YearPeriod yearPeriod) {
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
                break;
        }

        super.setConeDiameterLength(getConeDiameterLength() + 5);
        System.out.println("Have a re-growth period (often during the summer) to develop the foliage" + " our tree is growing through " + yearPeriod);
    }

    @Override
    public String toString() {
        return "DeciduousTree{} " + super.toString();
    }
}
