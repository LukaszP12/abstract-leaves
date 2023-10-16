package pl.piwowarski;

public class DeciduousTree extends AbstractTree {

    public DeciduousTree(int coneDiameterLength, int twigsNum) {
        super(coneDiameterLength, twigsNum, "broad and flat leaves");
    }

    @Override
    void grow() {
        System.out.println("Have a re-growth period (often during the summer) to develop the foliage");
    }
}
