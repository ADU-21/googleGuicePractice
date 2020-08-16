package google.guice.practice.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;
import google.guice.practice.OpenOfficeWorldSpellCheckerImpl;
import google.guice.practice.SpellChecker;
import google.guice.practice.WinWordSpellCheckImpl;
import google.guice.practice.annotation.WinWord;

public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        // Linked binding
//        bind(SpellChecker.class).to(SpellCheckerImpl.class);
//        bind(SpellCheckerImpl.class).to(WinWordSpellCheckImpl.class);

        // Binding annotations
//        bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordSpellCheckImpl.class);

        // @Named binding
        bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(OpenOfficeWorldSpellCheckerImpl.class);
        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhostL5326/emp");
    }
}
