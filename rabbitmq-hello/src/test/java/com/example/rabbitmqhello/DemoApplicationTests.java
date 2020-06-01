package com.example.rabbitmqhello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
    // @Autowired
    private final Sender sender;

    @Autowired
    /**
     * @param sender
     */
    public DemoApplicationTests(Sender sender) {
        this.sender = sender;
    }
    
    @Test
    public void hello() throws Exception {
        sender.send();
    }


}
