package com.propolingo.propolinfo.controllers;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EquivalenceExerciseControllerTest {
    private EquivalenceExerciseController controller;

    @BeforeEach
    public void setUp() {
        controller = new EquivalenceExerciseController();
        controller.ans1 = new TextField();
        controller.ans2 = new TextField();
        controller.ans3 = new TextField();
        controller.ans4 = new TextField();
        controller.ans5 = new TextField();
        controller.ans6 = new TextField();
        controller.ans7 = new TextField();
    }

    @Test
    public void testValidateCorrectAnswers() {
        controller.ans1.setText("t");
        controller.ans2.setText("t");
        controller.ans3.setText("f");
        controller.ans4.setText("t");
        controller.ans5.setText("t");
        controller.ans6.setText("t");
        controller.ans7.setText("f");

        controller.validate();

        assertEquals(Color.LIGHTGREEN, controller.ans1.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTGREEN, controller.ans2.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTCORAL, controller.ans3.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTGREEN, controller.ans4.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTGREEN, controller.ans5.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTGREEN, controller.ans6.getBackground().getFills().get(0).getFill());
        assertEquals(Color.LIGHTCORAL, controller.ans7.getBackground().getFills().get(0).getFill());
    }
}
