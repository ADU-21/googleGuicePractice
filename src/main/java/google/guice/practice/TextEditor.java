package google.guice.practice;

import javax.inject.Inject;
import javax.inject.Named;

public class TextEditor {
    private final SpellChecker spellChecker;
    private final String dbUrl;

    @Inject
    public TextEditor(@Named("OpenOffice") SpellChecker spellChecker,
                      @Named("JDBC") String dbUrl) {
        System.out.println("TextEditor Constructor called");
        this.spellChecker = spellChecker;
        this.dbUrl = dbUrl;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }

    public void makeConnection() {
        System.out.println(dbUrl);
    }
}
