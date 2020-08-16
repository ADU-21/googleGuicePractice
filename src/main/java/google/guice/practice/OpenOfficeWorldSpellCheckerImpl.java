package google.guice.practice;

public class OpenOfficeWorldSpellCheckerImpl extends SpellCheckerImpl {
    public OpenOfficeWorldSpellCheckerImpl(String dbUrl, String user, Integer timeout) {
        super(dbUrl, user, timeout);
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside OpenOfficeWordSpellCheckerImpl.checkSpelling." );
    }
}
