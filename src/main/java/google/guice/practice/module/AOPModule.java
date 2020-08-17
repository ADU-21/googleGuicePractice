package google.guice.practice.module;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.matcher.Matchers;
import google.guice.practice.annotation.BeforeCheck;
import google.guice.practice.interceptor.CheckInterceptor;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.logging.Logger;

public class AOPModule extends AbstractModule implements MethodInterceptor {
    @Inject
    private Logger logger;

    @Override
    protected void configure() {
        bindInterceptor(
                Matchers.any(),
                Matchers.annotatedWith(BeforeCheck.class),
                this);
    }

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.info("before check...");
        System.out.println("before check...");
        System.out.println("start");
        long start = System.currentTimeMillis();
        Object value =  invocation.proceed();
        System.out.println("end took: " + (System.currentTimeMillis() - start));
        return value;
    }
}
