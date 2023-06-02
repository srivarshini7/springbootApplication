package com.CollectionExample;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<Integer>();
//        Add Elements
        List.add(5);
        List.add(1);
        List.add(3);
        List.add(7);
        System.out.println(List);

        System.out.println(List.get(0));
// Manipulate a particular Value
        List.set(0,0);
        System.out.println(List);
// Add Elements in between
        List.add(2,2);
        System.out.println(List);
//Size of the Array
        System.out.println(List.size());
// Remove Elements
        List.remove(4);
        System.out.println(List);
        System.out.println(List.size());

//        Loops
        for(int i=0;i<List.size();i++){
            List.get(i);
            System.out.print(List.set(i,i+i));
        }
        System.out.println(List);
    }
}