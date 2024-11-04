package edu.fra.uas.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MessageService {
    private static final Logger logger = LoggerFactory.getLogger(MessageService.class); // Logger initialisieren
    private String message;

    public String getMessage() {
        logger.debug("getMessage() called, returning: {}", message); // Loggen beim Abrufen der Nachricht
        return message;
    }

    public void setMessage(String message) {
        logger.debug("setMessage() called with: {}", message); // Loggen beim Setzen der Nachricht
        this.message = message;
    }
}
