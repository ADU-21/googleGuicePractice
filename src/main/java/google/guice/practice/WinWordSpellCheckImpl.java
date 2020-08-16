package google.guice.practice;

public class WinWordSpellCheckImpl extends SpellCheckerImpl {

    @Override
    public void checkSpelling() {
        System.out.println("Inside WinWordSpellCheckImpl.checkSpelling");
    }
}
