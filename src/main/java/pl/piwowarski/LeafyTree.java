package pl.piwowarski;

class LeafyTree extends Tree{
    public LeafyTree(Trunk trunk) {
        super(trunk);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a leafy tree.");
    }
}
