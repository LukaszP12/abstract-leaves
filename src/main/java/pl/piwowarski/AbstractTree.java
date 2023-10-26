package pl.piwowarski;

public abstract class AbstractTree {
    private int coneDiameterLength;
    private int twigsNum;
    private int leaves;

    public AbstractTree(int coneDiameterLength, int twigsNum, int leaves) {
        this.coneDiameterLength = coneDiameterLength;
        this.twigsNum = twigsNum;
        this.leaves = leaves;
    }

    abstract void grow(YearPeriod yearPeriod);

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
        if (twigsNum < 0) {
            this.twigsNum = 0;
            return;
        }
        this.twigsNum = twigsNum;
    }

    public int getLeaves() {
        return leaves;
    }

    public void setLeaves(int leaves) {
        if (leaves < 0) {
            this.leaves = 0;
            return;
        }
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "after some time growing, the tree looks like: " +
                "coneDiameterLength=" + coneDiameterLength +
                ", twigsNum=" + twigsNum +
                ", leaves='" + leaves + '\'' +
                '}';
    }
}
