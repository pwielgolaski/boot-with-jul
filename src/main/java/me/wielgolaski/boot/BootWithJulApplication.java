package me.wielgolaski.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class BootWithJulApplication {

    private static final Logger logger = Logger.getLogger(BootWithJulApplication.class.getName());

    public static void main(String[] args) {
        logger.info("Log4j JUL before SpringApplication");
        SpringApplication.run(BootWithJulApplication.class, args);
        logger.info("Log4j JUL after SpringApplication");
    }
}
