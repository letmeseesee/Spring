package org.yhwang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import sun.misc.IOUtils;

import javax.annotation.Resource;

@Component
@PropertySource("classpath:app")
@ComponentScan("org.yhwang")
public class Properties {
    @Value("普通字符串")
    private String normal;

    //引入环境变量
    @Value("#{environment['os.name']}")
    private String osName;

    //调用
    @Value("#{T(java.lang.Math).random()*1000.0}")
    private double randomNumber;

    //调用其他对象的
//    @Value("#{PropertiesService.anotherValue}")
//    private String anotherValue;

    //引入Resource
    @Value("http://www.baidu.com")
    private String url;

    //从配置文件中引入
    @Value("${author}")
    private String author;

    @Autowired
    private Environment environment;

    public void outSource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
//        System.out.println(anotherValue);
        System.out.println(author);
        System.out.println(environment.getProperty("name"));
    }

}
