package google.guice.practice.module;

import com.google.inject.AbstractModule;
import google.guice.practice.SpellChecker;
import google.guice.practice.SpellCheckerImpl;

public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
    }
}
