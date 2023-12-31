package pl.piwowarski;

public abstract class AbstractTree {
    private double coneDiameterLength;
    private int twigsNum;
    private int leaves;
    private int age;
    private int lifeSpan;

    public AbstractTree(int age, double coneDiameterLength, int twigsNum, int leaves, int lifeSpan) {
        this.age = age;
        this.coneDiameterLength = coneDiameterLength;
        this.twigsNum = twigsNum;
        this.leaves = leaves;
        this.lifeSpan = lifeSpan;
    }

    public abstract void grow(YearPeriod yearPeriod);

    public double getConeDiameterLength() {
        return coneDiameterLength;
    }

    public void setConeDiameterLength(double coneDiameterLength) {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
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
