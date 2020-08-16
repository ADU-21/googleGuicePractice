package google.guice.practice;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Logger;

public class TextEditor {
    private final SpellChecker spellChecker;
    private final Logger logger;

    @Inject
    public TextEditor(SpellChecker spellChecker, Logger logger) {
        System.out.println("TextEditor Constructor called");
        this.spellChecker = spellChecker;
        this.logger = logger;
    }

    public void makeSpellCheck() {
        logger.info("TextEditor.makeSpellCheck called");
        spellChecker.checkSpelling();
    }
}
