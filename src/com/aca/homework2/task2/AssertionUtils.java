package com.aca.homework2.task2;

public class AssertionUtils {
    public static void assertEquals(int val1, int val2){
        if(val1 != val2)
        {
            throw new RuntimeException("values are NOT equal");
        }
    }
    public static void assertEquals(double val1, double val2){
        if(val1 != val2)
        {
            throw new RuntimeException("values are NOT equal");
        }

    }
    public static void assertEquals(String val1, String val2){
        if(!(val1.equals(val2)))
        {
            throw new RuntimeException("values are NOT equal");
        }

    }
    public static void assertEquals(boolean val1, boolean val2){
        if(val1 != val2)
        {
            throw new RuntimeException("values are NOT equal");
        }

    }
    public static void notNull(Object obj){
        if(obj.equals(null))
        {
            throw new RuntimeException("NULL");
        }

    }
}
