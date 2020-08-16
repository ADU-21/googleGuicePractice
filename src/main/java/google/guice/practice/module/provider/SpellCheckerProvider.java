package google.guice.practice.module.provider;

import com.google.inject.Provider;
import google.guice.practice.SpellChecker;
import google.guice.practice.SpellCheckerImpl;

public class SpellCheckerProvider implements Provider<SpellChecker> {
    @Override
    public SpellChecker get() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        return new SpellCheckerImpl(dbUrl, user, timeout);
    }
}
