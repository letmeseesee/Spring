package org.yhwang;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 组件
 */
@Component
public class FunctionService {
    public String sayHello(String word) {
        return "你好" + word + "!";
    }
}
