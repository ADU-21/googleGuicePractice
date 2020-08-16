package google.guice.practice;

public class WinWordSpellCheckImpl extends SpellCheckerImpl {

    public WinWordSpellCheckImpl(String dbUrl, String user, Integer timeout) {
        super(dbUrl, user, timeout);
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside WinWordSpellCheckImpl.checkSpelling");
    }
}
