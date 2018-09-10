package org.yhwang;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GoodByeFunction {

    public void SayGoodBye(){
        System.out.println("Good Bye");
    }
}
