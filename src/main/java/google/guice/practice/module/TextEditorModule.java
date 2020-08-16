package google.guice.practice.module;

import com.google.inject.AbstractModule;
import google.guice.practice.SpellChecker;
import google.guice.practice.WinWordSpellChecker;

public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).to(WinWordSpellChecker.class);
    }
}
