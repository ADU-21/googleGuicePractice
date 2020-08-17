package google.guice.practice;

import google.guice.practice.annotation.BeforeCheck;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.logging.Logger;

public class TextEditor {
    @Inject
    @Named("default")
    private SpellChecker spellChecker;
    @Inject
    private Logger logger;

    public void makeSpellCheck() {
        logger.info("TextEditor.makeSpellCheck called");
        spellChecker.checkSpelling();
    }
}
