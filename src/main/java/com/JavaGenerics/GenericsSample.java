package com.JavaGenerics;
import java.util.HashMap;
import java.util.*;

public class GenericsSample {
    public static void main(String args[]){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Hello");
        map.put(4,"Java Programming!");
        map.put(2,"World");
        map.put(5,"Coding is fun!");


        Set<Map.Entry<Integer,String>> set=map.entrySet();

        Iterator<Map.Entry<Integer,String>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry e=itr.next();
            System.out.println(" "+e.getValue());
        }

    }
}
