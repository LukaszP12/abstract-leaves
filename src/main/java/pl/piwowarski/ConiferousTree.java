package pl.piwowarski;

class ConiferousTree extends Tree{
    public ConiferousTree(Trunk trunk) {
        super(trunk);
    }

    @Override
    public void displayInfo() {
        System.out.println("This is a coniferous tree.");
    }
}
