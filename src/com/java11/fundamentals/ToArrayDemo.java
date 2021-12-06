package com.java11.fundamentals;

import java.awt.*;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.*;
import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.*;
import java.util.List;

public class ToArrayDemo {
    public static void main(String[] args) {
        //arrayConversion();
        //  someMethod();
        // someMethod();
        intAutoBoxing();
        // methodReference();
        // steam();
    }

    public static void arrayConversion() {


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(8);
        System.out.println(list);
        Integer[] arr = list.stream().toArray(size -> new Integer[size]);//the the genrator is lambda expression,.
        System.out.println(Arrays.toString(arr));
        Integer[] arr2 = list.toArray(Integer[]::new);//the generator is lamda expression
        System.out.println(Arrays.toString(arr2));
        ArrayList<String> str = new ArrayList<>();
        str.add("Berlin");
        str.add("Tiwan");
        str.add("Olathe");
        String[] arr3 = str.toArray(String[]::new);
        System.out.println(Arrays.toString(arr3));
        String[] arr4 = str.stream().toArray(size -> new String[size]);
        System.out.println(Arrays.toString(arr4));
        HashSet<String> str1 = new HashSet<>();
        str1.add("knasas");
        str1.add("California");
        str1.add("mizuri");
        String[] set1 = str1.stream().toArray(size -> new String[size]);
        System.out.println(Arrays.toString(set1));
        //lets see local variable declaraion in java11
        var alpha = 100;
        System.out.println(alpha * 2);
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Learn");
        list2.add("Java11");
        list2.add("content");
        String[] myArray = list2.stream().toArray(size -> new String[size]);
        System.out.println(Arrays.toString(myArray));
        String[] myArray1 = list2.toArray(String[]::new);
        for (int i = 0; i < myArray1.length; i++) {
            System.out.println(myArray1[i]);

        }

    }

    public static void someMethod() {
        var myArray = new Integer[]{5, 10, 15, 20, 25};
        long value = Arrays.stream(myArray).filter(
                (@Nonnull var alpha) -> (alpha != null && alpha >= 5)).count();//this @Nonnnull is an interface function.
        // the count counts the elements in the stream element
        // System.out.println(value);


    }

    //Steam from array, sort, sort,filter, and print
    public static void steam() {
        String[] names = {"A1", "Ankit", "Brent", "Kushal", "Sarika", "amana", "hans", "shivika"};
        Arrays.stream(names).filter(x -> x.startsWith("S")).forEach(System.out::println);//same as Steram.of(names

    }

    public static void intAutoBoxing() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(31);
        for (Integer list1 : list) {
           // System.out.println(list1);
        }
        Integer[] tt1 = list.toArray(Integer[]::new);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(tt1[i]);
        }
        Integer[]tent = list.stream().toArray(size->new Integer[size]);
        System.out.println(Arrays.toString(tent));
    }

        Set<String> set = new TreeSet<String>(new Comparator<String>() {//this an anonymous class
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        Set<String> set1 = new TreeSet<String>((o1, o2) -> o1.length() - o2.length());//this lambda expression
        public static void methodReference () {
            Supplier<String> supplier = () -> new String();
            //we can write this by constructor reference as foolows
            Supplier<String> supplier1 = String::new;//()->new String();
            System.out.println("\nsupplier.appy:" + supplier1.get());
            Function<String, String> function = s -> new String(s);//we can write this using constructor
            //reference  as follows
            Function<String, String> function1 = String::new;
            System.out.println(function1.apply("java"));

            BiFunction<Integer, Float, HashMap> biFunction = (c, If) -> new HashMap(c, If);
            //we can write this as follows using constructor referenc
            BiFunction<Integer, Float, HashMap> biFunction1 = HashMap::new;
            System.out.println(biFunction.apply(100, .75f));
        }
    }


