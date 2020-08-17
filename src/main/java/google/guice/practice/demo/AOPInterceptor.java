package google.guice.practice.demo;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AOPInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("Before say");
        Object result = methodInvocation.proceed();
        System.out.println("After say");
        return result;
    }
}
