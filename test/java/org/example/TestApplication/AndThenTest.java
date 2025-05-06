package org.example.TestApplication;

import org.example.Application.AndThen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AndThenTest {
    @Test
    public void StreamMethod() {
        String res = AndThen.StreamMethod();
        Assertions.assertEquals("AARYA,SANJAY,JADHAV",res);
    }
}
