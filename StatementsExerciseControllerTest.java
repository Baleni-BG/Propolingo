package com.propolingo.propolinfo.controllers;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatementsExerciseControllerTest {
    private StatementsExerciseController controller;

    @BeforeEach
    public void setUp() {
        controller = new StatementsExerciseController();
        controller.ans1 = new TextField();
        controller.ans2 = new TextField();
        controller.ans3 = new TextField();
    }

    @Test
    public void testValidateCorrectAnswers() {
        controller.ans1.setText("P->Q");
        controller.ans2.setText("(P&Q)->R");
        controller.ans3.setText("(P&!R)->S");

        controller.validate();

        assertEquals(Color.LIGHTGREEN, controller.ans1.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTGREEN, controller.ans2.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTGREEN, controller.ans3.getBackground().getFills().get(0).getFill());
    }

    @Test
    public void testValidateIncorrectAnswers() {
        controller.ans1.setText("P-Q");
        controller.ans2.setText("(P|Q)->R");
        controller.ans3.setText("(P&!R)S");

        controller.validate();

        assertEquals(Color.LIGHTCORAL, controller.ans1.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTCORAL, controller.ans2.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTCORAL, controller.ans3.getBackground().getFills().get(0).getFill());
    }
}
