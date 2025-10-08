package pl.piwowarski;

class Leaf extends TreeElement {
    private String color;

    public Leaf(double length, double width, String color) {
        super(length, width);
        this.color = color;
    }

    @Override
    public void grow(double growth) {
        length += growth * 0.1; // Leaves grow slower
        width += growth * 0.05;
    }

    public String getColor() {
        return color;
    }
}
