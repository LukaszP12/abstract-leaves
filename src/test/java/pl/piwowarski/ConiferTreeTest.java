package pl.piwowarski;


import org.junit.Assert;
import org.junit.Test;

public class ConiferTreeTest {

    @Test
    public void set_twigs_to_negative_setter_will_up_zero() {
        // given
        ConiferTree coniferTree = new ConiferTree(7, 1, 800);
        // when
        coniferTree.grow(YearPeriod.WINTER);
        // then
        Assert.assertEquals(0, coniferTree.getTwigsNum());
    }

}