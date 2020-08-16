package google.guice.practice;

public class SpellCheckerImpl implements SpellChecker {
    private final String dbUrl;
    private final String user;
    private final Integer timeout;

    public SpellCheckerImpl(String dbUrl,
                            String user,
                            Integer timeout) {
        System.out.println("WinWordSpellChecker constructor called");
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeout = timeout;
    }

    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling");
        System.out.println(dbUrl);
        System.out.println(user);
        System.out.println(timeout);
    }
}
