package org.example.Application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AndThen {
    public static String StreamMethod()
    {
        List<String> sr = Arrays.asList("Aarya","Sanjay","Jadhav");
        String result = sr.stream()
                .collect(Collectors.collectingAndThen(Collectors.joining(","), String::toUpperCase));

        System.out.println(result);

        return result;
    }
}