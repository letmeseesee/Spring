package org.yhwang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 扫描所有的组件
 * Configuration的方式可以自动载入第三方的工具等项目，因为不能去改第三方加上注解
 */
@Configuration
@ComponentScan("org.yhwang")
public class MyConfig {
}