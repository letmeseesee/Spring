package org.yhwang;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GoodByeFunction {

    public void SayGoodBye(String user){
        System.out.println("Good Bye" + user);
    }
}
