package org.example.Application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceStream
{
    public static int method()
    {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Integer result = numbers.stream()
                .collect(Collectors.reducing(0,(a,b) -> a+b));
        System.out.println(result);
        return result;
    }
}
