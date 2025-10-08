package pl.piwowarski;

import java.util.ArrayList;
import java.util.List;

class Trunk extends TreeElement{
    private List<Branch> branches;

    public Trunk(double length, double width) {
        super(length, width);
        branches = new ArrayList<>();
    }

    public void addBranch(Branch branch) {
        branches.add(branch);
    }

    @Override
    public void grow(double growth) {
        length += growth;  // Trunk grows fastest
        width += growth * 0.3;

        for (Branch b : branches) {
            b.grow(growth * 0.7);
        }
    }
}
