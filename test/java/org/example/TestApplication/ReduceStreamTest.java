package org.example.TestApplication;

import org.example.Application.ReduceStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReduceStreamTest {

    @Test
    public void methodTest(){
        int resul = ReduceStream.method();
        Assertions.assertEquals(55,resul);
    }
}
