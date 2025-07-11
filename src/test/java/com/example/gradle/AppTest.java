/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.example.gradle;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test class for the App class.
 * 
 * Demonstrates unit testing with JUnit 5, AssertJ, and Mockito.
 */
class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    @DisplayName("App has a greeting")
    void appHasAGreeting() {
        assertNotNull(app.getGreeting(), "app.getGreeting() should return a greeting");
        assertThat(app.getGreeting()).isEqualTo("Hello World!");
    }

    @Test
    @DisplayName("Greeting is not empty")
    void greetingIsNotEmpty() {
        String greeting = app.getGreeting();
        assertThat(greeting).isNotEmpty();
        assertThat(greeting).isNotBlank();
    }

    @Test
    @DisplayName("Main method executes without exception")
    void mainMethodExecutes() {
        // Test that main method doesn't throw exceptions
        // This test just verifies the method runs without exceptions
        org.assertj.core.api.Assertions.assertThatCode(() -> App.main(new String[] {}))
                .doesNotThrowAnyException();
    }
}
