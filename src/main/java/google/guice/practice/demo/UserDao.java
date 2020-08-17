package google.guice.practice.demo;

import com.google.inject.Singleton;

@Singleton
public class UserDao {
    @BeforeAfterLog
    public void say() {
        System.out.println("dao is saying");
    }
}
