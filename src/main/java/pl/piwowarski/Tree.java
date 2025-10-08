package pl.piwowarski;

abstract class Tree {
    protected Trunk trunk;

    public Tree(Trunk trunk) {
        this.trunk = trunk;
    }

    public void grow(double growth){
        trunk.grow(growth);
    }

    public abstract void displayInfo();
}
