package com.lkp.ruiji;

import com.sun.jndi.url.rmi.rmiURLContext;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class RuiJiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RuiJiApplication.class, args);
        log.info("项目启动成功~~~~~~~~~~~~");
    }
}
