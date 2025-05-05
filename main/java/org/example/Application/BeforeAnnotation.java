package org.example.Application;

public class BeforeAnnotation {

        public static int addTwoNo(int a, int b){
            return a+b;
        }

        public static int mulTwoNo(int a, int b){
            return a*b;
        }

        public static int subTwoNo(int a, int b){
            return a-b;
        }

        public static int addAnyNo(int ...numbers){
            int s = 0;
            for (int num : numbers){
                s += num;
            }
            return s;
        }
}

