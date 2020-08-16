package google.guice.practice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import google.guice.practice.module.TextEditorModule;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        TextEditor editor = injector.getInstance(TextEditor.class);

        editor.makeSpellCheck();
    }
}
