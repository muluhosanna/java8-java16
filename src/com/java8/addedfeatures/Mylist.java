package com.java8.addedfeatures;

import java.util.ArrayList;

public class Mylist<T> {
    public void testGeneric(){
        ArrayList<T>list = new ArrayList<>();
        list.add(0, (T) "mulu");
        list.add(1, (T) "kelemu");
        list.add(2,(T)"mesafint");
        list.add(3,(T)"kemer");
        System.out.println(list.remove(0));

        System.out.println(list);
    }



}
