package google.guice.practice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.matcher.Matchers;
import com.google.inject.name.Names;
import google.guice.practice.SpellChecker;
import google.guice.practice.annotation.BeforeCheck;
import google.guice.practice.interceptor.CheckInterceptor;
import google.guice.practice.module.provider.SpellCheckerProvider;

public class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        // Linked binding
//        bind(SpellChecker.class).to(SpellCheckerImpl.class);
//        bind(SpellCheckerImpl.class).to(WinWordSpellCheckImpl.class);

        // Binding annotations
//        bind(SpellChecker.class).annotatedWith(WinWord.class).to(WinWordSpellCheckImpl.class);

        // @Named binding
//        bind(SpellChecker.class).annotatedWith(Names.named("OpenOffice")).to(OpenOfficeWorldSpellCheckerImpl.class);
//        bind(String.class).annotatedWith(Names.named("JDBC")).toInstance("jdbc:mysql://localhostL5326/emp");

        // Provider bind
        bind(SpellChecker.class)
                .annotatedWith(Names.named("default"))
                .toProvider(SpellCheckerProvider.class)
                .asEagerSingleton();
    }
    // @Provides binding
//    @Provides
//    public SpellChecker provideSpellChecker() {
//        String dbUrl = "jdbc:mysql://localhost:5326/emp";
//        String user = "user";
//        int timeout = 100;
//
//        return new SpellCheckerImpl(dbUrl, user, timeout);
//    }
}
