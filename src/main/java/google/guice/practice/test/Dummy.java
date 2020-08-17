package google.guice.practice.test;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Dummy {

    @Inject
    @Named("nonsense")
    private int nonsense;


    public int getNonsense() {
        return nonsense;
    }


    public void setNonsense(int nonsense) {
        this.nonsense = nonsense;
    }

    @Calibrated
    public void doSomething() {
        System.out.println("I have been intercepted!");
    }
}