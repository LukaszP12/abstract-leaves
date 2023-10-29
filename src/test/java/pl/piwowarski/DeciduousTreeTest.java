package pl.piwowarski;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class DeciduousTreeTest {

    @Test
    public void set_twigs_to_negative_setter_will_up_zero() {
        // given
        DeciduousTree deciduousTree = new DeciduousTree(7, 1, 800, 100);
        // when
        deciduousTree.grow(YearPeriod.AUTUMN);
        // then
        Assert.assertEquals(0, deciduousTree.getTwigsNum());
    }

    @Test
    public void after_two_turns_of_season_tree_grows_by_2_years() {
        // given
        int startAge = 20;
        DeciduousTree deciduousTree = new DeciduousTree(startAge, 7, 1, 800, 100);
        // when
        Arrays.stream(YearPeriod.values()).forEach(yearPeriod -> {
            deciduousTree.grow(yearPeriod);
        });

        for (YearPeriod yearPeriod : YearPeriod.values()) {
            deciduousTree.grow(yearPeriod);
        }
        // then
        Assert.assertEquals(startAge + 2, deciduousTree.getAge());
    }

    @Test
    public void when_tree_reaches_life_span_it_should_stop_growing() {
        // given
        DeciduousTree deciduousTree = new DeciduousTree(100, 7, 1, 800, 100);
        // when
        Arrays.stream(YearPeriod.values()).forEach(yearPeriod -> {
            deciduousTree.grow(yearPeriod);
        });

        for (YearPeriod yearPeriod : YearPeriod.values()) {
            deciduousTree.grow(yearPeriod);
        }
        // then
        Assert.assertEquals(100, deciduousTree.getAge());
    }

}
