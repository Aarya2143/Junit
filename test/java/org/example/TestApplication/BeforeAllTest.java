package org.example.TestApplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BeforeAllTest {

    @BeforeAll
    public static void init(){
        System.out.println("BeforeAll Print before all Test cases");
    }

    @Test
    public void add(){
        int result = 12 + 12;
        Assertions.assertEquals(24,result);
        System.out.println("Test case 1");
    }

    @Test
    public void sub(){
        int result = 12 * 2;
        Assertions.assertEquals(24,result);
        System.out.println("Test case 2");
    }
}
