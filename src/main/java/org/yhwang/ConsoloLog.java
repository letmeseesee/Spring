package org.yhwang;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class ConsoloLog {
    @Pointcut("execution( * org.yhwang.GoodByeFunction.SayGoodBye(String)) && args(user)")
    public void AfterFinish(String user){
    }


    @After("AfterFinish(user)")
    public void DoAfter(String user){
        System.out.println(user + " After SayGoodBye!");
    }

    @Before("AfterFinish(user)")
    public void DoBefore(String user){
        System.out.println(user + " Before SayGoodBye!");
    }

    @Around("execution( * org.yhwang.GoodByeFunction.SayGoodBye(..))")
    public void DoAround(ProceedingJoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        try {
            System.out.println(args[0] + " Around Start!");
            joinPoint.proceed();
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            System.out.println(args[0] + " Around Finish!");
        }
    }

}
