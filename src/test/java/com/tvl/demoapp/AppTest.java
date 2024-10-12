package com.tvl.demoapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
    	App app=new App();
    	int actuals = app.getwordcount("welcome to java");
    	assertEquals(actuals, 3);
    }
}
