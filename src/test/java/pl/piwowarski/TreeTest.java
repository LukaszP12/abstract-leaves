package pl.piwowarski;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TreeTest {

    @Test
    public void testTreeGrowth() {
        Leaf leaf1 = new Leaf(2.0, 1.0, "green");
        Leaf leaf2 = new Leaf(1.5, 0.8, "yellow");

        Branch subBranch = new Branch(5.0, 2.0);
        subBranch.addLeaf(leaf1);

        Branch branch = new Branch(10.0, 3.0);
        branch.addSubBranch(subBranch);
        branch.addLeaf(leaf2);

        Trunk trunk = new Trunk(20.0, 5.0);
        trunk.addBranch(branch);

        LeafyTree tree = new LeafyTree(trunk);

        // Record initial lengths
        double initialTrunkLength = trunk.length;
        double initialBranchLength = branch.length;
        double initialSubBranchLength = subBranch.length;
        double initialLeaf1Length = leaf1.length;
        double initialLeaf2Length = leaf2.length;

        // Grow tree by 2 "years"
        tree.grow(2.0);

        // Trunk should grow fastest
        assertTrue( trunk.length > initialTrunkLength,"Trunk should have grown");

        // Branches should grow proportionally
        assertTrue(branch.length > initialBranchLength,"Branch should have grown");
        assertTrue(subBranch.length > initialSubBranchLength, "Sub-branch should have grown");

        // Leaves should grow
        assertTrue( leaf1.length > initialLeaf1Length,"Leaf1 should have grown");
        assertTrue( leaf2.length > initialLeaf2Length,"Leaf2 should have grown");
    }

    @Test
    public void testTreeStructure() {
        // Simple trunk and branches
        Trunk trunk = new Trunk(15.0, 4.0);
        Branch branch = new Branch(7.0, 2.0);
        Leaf leaf = new Leaf(1.0, 0.5, "green");

        branch.addLeaf(leaf);
        trunk.addBranch(branch);

        LeafyTree tree = new LeafyTree(trunk);

        // Check composition
        assertEquals(1, trunk.getBranches().size(),"Trunk should have 1 branch");
        assertEquals(1, branch.getLeaves().size(),"Branch should have 1 leaf");
        assertSame(leaf, branch.getLeaves().get(0),"Leaf should be correctly added to branch");
    }


    @Test
    public void testLeafColor() {
        Leaf leaf = new Leaf(1.0, 0.5, "red");
        assertEquals("red", leaf.getColor(), "Leaf color should be red");
    }
}
