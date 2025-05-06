/*
package org.example.TestApplication;

import org.example.Application.BeforeAnnotation;
import org.example.Application.Calculator;
import org.junit.*;

import java.util.Date;

public class BeforeAnnotationTest {
    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases: ");
        System.out.println("Started Test At: " + new Date());
    }

    @Test(timeout = 4000)
    public void addTwoNo() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test For addTwoNo");
        int result = BeforeAnnotation.addTwoNo(3,2);
        Assert.assertEquals(5, result);
    }

    @Test
    public void mulTwoNo(){
        System.out.println("Test For mulTwoNo");
        int result = Calculator.mulTwoNo(12,1);
        Assert.assertEquals(12,result);
    }

    @AfterClass
    public static void afterMethod(){
        System.out.println("After all test cases: ");
        System.out.println("End Test : " + new Date());
    }
}
*/
