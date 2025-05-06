package org.example.TestApplication;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfterAllTest {

    @Test
    public void addTest(){
        int res = 12+13;
        Assertions.assertEquals(25,res);
        System.out.println("Test case 1");
    }

    @Test
    public void mulTest(){
        int res = 12*2;
        Assertions.assertEquals(24,res);
        System.out.println("Test case 2");
    }

    @AfterAll
    public static void init(){
        System.out.println("Congrats All Test Cases Successfull !!!");
    }
}
