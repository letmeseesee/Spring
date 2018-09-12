package org.yhwang;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ConsoloLog {
    @Pointcut("execution( * org.yhwang.GoodByeFunction.SayGoodBye(..))")
    public void BeforeFinish(){
    }


    @After("BeforeFinish()")
    public void DoAfter(){
        System.out.println("After SayGoodBye!");
    }
}
