package pl.piwowarski;

import java.util.ArrayList;
import java.util.List;

class Branch extends TreeElement{
    private List<Branch> subBranches;
    private List<Leaf> leaves;

    public Branch(double length, double width) {
        super(length, width);
        this.subBranches =  new ArrayList<>();
        this.leaves = new ArrayList<>();
    }

    public void addSubBranch(Branch branch){
        subBranches.add(branch);
    }

    public void addLeaf(Leaf leaf){
        leaves.add(leaf);
    }

    @Override
    public void grow(double growth) {
        length += growth * 0.5;
        width += width * 0.2;

        for (Branch branch : subBranches){
            branch.grow(growth * 0.8);
        }
        for (Leaf leaf : leaves){
            leaf.grow(growth);
        }
    }
}
