package pl.decoratorPatternExample;

import pl.piwowarski.YearPeriod;

public class BeeHive implements Growable {

    private Growable sectionOfTheForrest;

    public BeeHive(Growable sectionOfTheForrest) {
        this.sectionOfTheForrest = sectionOfTheForrest;
    }

    @Override
    public void grow(YearPeriod yearPeriod) {
        sectionOfTheForrest.grow(yearPeriod);
        System.out.println("Bees are being breed in our forrest..");
    }
}
