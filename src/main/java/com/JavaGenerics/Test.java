package com.JavaGenerics;
import java.util.*;

public class Test {
        static <T> void genericDisplay(T element)
        {
            System.out.println(element.getClass().getName()
                    + " = " + element);
        }
        public static void main(String[] args)
        {

            genericDisplay(11);
            genericDisplay("Java Generics Sample Program");
            genericDisplay(1.0);
        }
}
