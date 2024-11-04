package edu.fra.uas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.fra.uas.controller.BeanController;
import edu.fra.uas.service.MessageService;

@SpringBootApplication
public class BeanBeispielApplication {
    
    private static final Logger log = LoggerFactory.getLogger(BeanBeispielApplication.class);
    
    @Autowired
    private MessageService messageService;
    
    @Autowired
    private BeanController beanController; // Hinzufügen des BeanControllers

    public static void main(String[] args) {
        SpringApplication.run(BeanBeispielApplication.class, args);
    }

    @Bean
    CommandLineRunner init() {
        return args -> { // Lambda-Syntax für CommandLineRunner
            log.debug(beanController.putMessage("Hallo Welt"));
            log.debug(beanController.putMessage("---->0000h00<----"));
        };
    }
}
