package google.guice.practice.interceptor;

import com.google.inject.Provider;
import google.guice.practice.module.provider.SpellCheckerProvider;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.inject.Inject;
import java.util.logging.Logger;

public class CheckInterceptor implements MethodInterceptor {

    @Inject
    private Logger logger;

    @Inject
    private Provider<SpellCheckerProvider> provider;

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        logger.info("before check...");
        System.out.println("before check...");
        provider.get();
        System.out.println("start");
        long start = System.currentTimeMillis();
        Object value =  invocation.proceed();
        System.out.println("end took: " + (System.currentTimeMillis() - start));
        return value;
    }
}
