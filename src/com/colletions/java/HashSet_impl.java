package com.colletions.java;
import java.util.*;
import java.util.HashSet;

public class HashSet_impl {

    public void hashSet_implemenation(){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Three");
        set.remove("Three");
        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
