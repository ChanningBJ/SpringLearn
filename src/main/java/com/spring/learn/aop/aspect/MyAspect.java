package com.spring.learn.aop.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Created by chengmingwang on 8/20/17.
 */
@Aspect
@Component
public class MyAspect {



//    @AfterReturning("execution(public * com.spring.learn..*.*(..))")
//    public void afterReturn(JoinPoint joinPoint) throws Throwable {
//        System.out.println("after return ...");
//    }

//    @Pointcut("@annotation(com.spring.learn.aop.aspect.CutPoint)")
//    public void cutcut() {
//    }
//
//    @After("cutcut()")

//    @AfterReturning("@annotation(com.spring.learn.aop.aspect.CutPoint)")
//    public void curcur(JoinPoint joinPoint) throws Throwable {
//        System.out.println("after curcur ...");
//    }

//    /**
//     * Gets declared method from specified type by mame and parameters types.
//     *
//     * @param type           the type
//     * @param methodName     the name of the method
//     * @param parameterTypes the parameter array
//     * @return a {@link Method} object or null if method doesn't exist
//     */
//    public static Method getDeclaredMethod(Class<?> type, String methodName, Class<?>... parameterTypes) {
//        Method method = null;
//        try {
//            method = type.getDeclaredMethod(methodName, parameterTypes);
//            if(method.isBridge()){
//                method = MethodProvider.getInstance().unbride(method, type);
//            }
//        } catch (NoSuchMethodException e) {
//            Class<?> superclass = type.getSuperclass();
//            if (superclass != null) {
//                method = getDeclaredMethod(superclass, methodName, parameterTypes);
//            }
//        } catch (ClassNotFoundException e) {
//            Throwables.propagate(e);
//        } catch (IOException e) {
//            Throwables.propagate(e);
//        }
//        return method;
//    }


//    public static Class[] getParameterTypes(JoinPoint joinPoint) {
//        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
//        Method method = signature.getMethod();
//        return method.getParameterTypes();
//    }

    @Around("@annotation(com.spring.learn.aop.aspect.CutPoint)")
    public void aroundCut(final ProceedingJoinPoint joinPoint) throws Throwable {
        Signature sig = joinPoint.getSignature();
        System.out.println(joinPoint.getTarget().getClass().getName());
        if(sig instanceof MethodSignature){
            MethodSignature methodSignature = (MethodSignature) sig;
            CutPoint annotation = methodSignature.getMethod().getAnnotation(CutPoint.class);

        }
        System.out.println("Around before is running!");
        Object result = joinPoint.proceed(); //continue on the intercepted method
        System.out.println("Around after is running!");
    }

}
