package google.guice.practice;

public class SpellCheckerImpl implements SpellChecker {
    public SpellCheckerImpl() {
        System.out.println("WinWordSpellChecker constructor called");
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling");
    }
}
