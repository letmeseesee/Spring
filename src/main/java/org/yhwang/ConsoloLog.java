package org.yhwang;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class ConsoloLog {
    @Pointcut("execution( * org.yhwang.GoodByeFunction.SayGoodBye(..))")
    public void AfterFinish(){
    }


    @After("AfterFinish()")
    public void DoAfter(){
        System.out.println("After SayGoodBye!");
    }

    @Before("AfterFinish()")
    public void DoBefore(){
        System.out.println("Before SayGoodBye!");
    }

    @Around("AfterFinish()")
    public void DoAround(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Around Start!");
            joinPoint.proceed();
        }catch (Throwable throwable){
            System.out.println("Around Finish!");
        }
    }

}
