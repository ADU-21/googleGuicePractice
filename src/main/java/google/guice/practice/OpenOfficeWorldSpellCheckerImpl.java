package google.guice.practice;

public class OpenOfficeWorldSpellCheckerImpl extends SpellCheckerImpl {
    @Override
    public void checkSpelling() {
        System.out.println("Inside OpenOfficeWordSpellCheckerImpl.checkSpelling." );
    }
}
