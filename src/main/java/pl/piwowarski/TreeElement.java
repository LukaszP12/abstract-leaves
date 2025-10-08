package pl.piwowarski;

abstract class TreeElement {
    protected double length;
    protected double width;

    public TreeElement(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public abstract void grow(double growth);

}
