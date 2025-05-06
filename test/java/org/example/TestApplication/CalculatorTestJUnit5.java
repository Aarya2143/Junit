package org.example.TestApplication;

import org.example.Application.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTestJUnit5 {

        @Test
        public void addTwoNoTest(){
            int result = Calculator.addTwoNo(12,0);
            Assertions.assertEquals(12, result);
        }

        @Test
        public void addAnyNoTest(){
            int result = Calculator.addAnyNo(1,2,1,2);
            Assertions.assertEquals(6, result);
        }
}
