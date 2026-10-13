package com.example.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DemoApplicationTests {

    @Test
    void testIndexEndpoint() {
        DemoApplication app = new DemoApplication();
        String result = app.index();
        assertEquals("Spring Boot App tested on Multi-version Java Matrix!", result);
    }

    @Test
    void testJavaVersionCompatibility() {
        String javaVersion = System.getProperty("java.version");
        boolean isCompatible = javaVersion.startsWith("17") || javaVersion.startsWith("21");
        assertTrue(isCompatible, "Compatible with Java LTS 17 and 21");
    }
}
