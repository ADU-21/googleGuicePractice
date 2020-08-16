package google.guice.practice;

import google.guice.practice.annotation.WinWord;

import javax.inject.Inject;

public class TextEditor {
    private final SpellChecker spellChecker;

    @Inject
    public TextEditor(@WinWord SpellChecker spellChecker) {
        System.out.println("TextEditor Constructor called");
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}
