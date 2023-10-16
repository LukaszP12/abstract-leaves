package pl.piwowarski;

public class ConiferTree extends AbstractTree {

    public ConiferTree(int coneDiameterLength, int twigsNum) {
        super(coneDiameterLength, twigsNum, "small needle like leaves");
    }

    @Override
    void grow() {
        System.out.println("ConiferTrees are evergreen, so they don't re-grow");
    }
}
