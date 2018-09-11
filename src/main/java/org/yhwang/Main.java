package org.yhwang;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by yhwang on 16-12-12.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UseComponent bean = context.getBean(UseComponent.class);
        System.out.println(bean.sayHello("wang"));

        GoodByeFunction GoodBye = context.getBean(GoodByeFunction.class);
        GoodBye.SayGoodBye();

        Properties properties = context.getBean(Properties.class);
        properties.outSource();

        context.close();
    }
}
