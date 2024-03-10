package com.colletions.java;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class HashMap_impl
{
   public void HashMap_implementation(){
       Map<Integer,String> map=new HashMap<Integer,String>();
       map.put(100,"Amit");
       map.put(101,"Vijay");
       map.put(102,"Rahul");
       //Elements can traverse in any order
    for(Map.Entry m: map.entrySet()){
        System.out.println("Key:"+m.getKey()+" Value:"+m.getValue());
    }
   }
}
