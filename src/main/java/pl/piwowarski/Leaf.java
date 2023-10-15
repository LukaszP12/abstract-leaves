package pl.piwowarski;

public abstract class Leaf {
    private int coneDiameterLength;
    private int twigsNum;
    private String leaves;

    public Leaf(int coneDiameterLength, int twigsNum, String leaves) {
        this.coneDiameterLength = coneDiameterLength;
        this.twigsNum = twigsNum;
        this.leaves = leaves;
    }

    abstract void grow();

    public int getConeDiameterLength() {
        return coneDiameterLength;
    }

    public void setConeDiameterLength(int coneDiameterLength) {
        this.coneDiameterLength = coneDiameterLength;
    }

    public int getTwigsNum() {
        return twigsNum;
    }

    public void setTwigsNum(int twigsNum) {
        this.twigsNum = twigsNum;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }
}
