package google.guice.practice.demo;

import com.google.inject.Guice;

public class Start {
    public static void main(String[] args) {
        Guice.createInjector().getInstance(UserService.class).say();
    }
}
