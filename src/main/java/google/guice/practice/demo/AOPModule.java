package google.guice.practice.demo;

import com.google.inject.AbstractModule;
import com.google.inject.matcher.Matchers;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPModule extends AbstractModule implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Before say");
        Object result = methodInvocation.proceed();
        System.out.println("After say");
        return result;
    }

    @Override
    protected void configure() {
        bindInterceptor(Matchers.any(), Matchers.annotatedWith(BeforeAfterLog.class), this);
    }
}