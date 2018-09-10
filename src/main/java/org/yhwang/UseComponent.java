package org.yhwang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UseComponent {
    public FunctionService functionService;

    @Autowired
    public UseComponent(FunctionService functionService){
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return this.functionService.sayHello(word);
    }
}
