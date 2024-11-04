package edu.fra.uas.beanbeispiel;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import edu.fra.uas.controller.BeanController; // Importiere die Controller-Klasse

@SpringBootTest
public class ControllerTest {

    @Autowired
    private BeanController beanController; // Korrigiere den Klassennamen hier

    @Test
    void testController() {
        // Stelle sicher, dass der Controller die erwartete Nachricht zurückgibt
        String result = beanController.putMessage("Das ist ein Test");
        assertThat(result).isEqualTo("put Message:Das ist ein Test"); // Korrigiere den erwarteten Wert
    }
}
