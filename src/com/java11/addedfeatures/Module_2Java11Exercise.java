package com.java11.addedfeatures;

import java.util.*;
import java.util.function.Function;

public class Module_2Java11Exercise {
    /*
     *Under this section we create two local variable syntax for Lambda. and utilize it the :: operators for each
     * Create hashSet,TreeSet, and stack and apply toArray metheod to the collection.
     *
     */
    public static void main(String[] args) {
      // surfaceAndVolume();
      // hasSetToArray();
       //treeSetToArray();
       stackMethod();

    }

    public interface CalculateVolume {
        Double area(double height, double length, double width);
    }

    //Tak2
    public static void surfaceAndVolume() {
        CalculateVolume arae1 = (var height, var lnegnth, var area) -> area = height * lnegnth;
        CalculateVolume volume1 = (var height, var area, var Volume) -> Volume = area * height;
        System.out.println(arae1.area(10, 20, 2));
        System.out.println(volume1.area(3, 4, 8));
        Function<Double, Double> logarithm = x -> Math.log(x);
        System.out.println(logarithm.apply(20.0));
        List<String> status = Arrays.asList("Close", "Open", "Halt");
        // String[]str = status.toArray(String[]);
        //String result = status
        //.stream()
        //.map( @Nonnull var x) -> ("Market Status".concat(x)))
        //ut.println(result);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(8);
        //System.out.println(list);
        Integer[] arr = list.stream().toArray(size -> new Integer[size]);//the the genrator is lambda expression,.
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3]);

    }


    //Task3
    public static void hasSetToArray() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Nirobi");
        set1.add("Gambela");
        set1.add("Awasa");
        set1.add("Gondar");
        for (String name:set1){
            System.out.println(name);

        }
        System.out.println("before11");

       // System.out.println(set1);
        String[] hass = set1.stream().toArray(size -> new String[size]);
       //System.out.println(Arrays.toString(hass));
        Object hasSet[] = set1.toArray();
        set1.forEach(e->System.out.println(e));//Applying lambda expression
        System.out.println("after11");
        //or
        for (Object obj:hasSet){//Applying foreach loop
           System.out.println(obj);
        }//or
        for (int i=0;i<set1.size();i++){
            System.out.println(hasSet[i]);
        }
        System.out.println("After the object");
        String[]strings = new String[set1.size()];
        set1.toArray(strings);
        for (String string2:strings){
            System.out.println(string2);
        }


    }

    public static void treeSetToArray() {

        Set<Double> d1 = new TreeSet<>();
        d1.add(2.0);
        d1.add(8.0);
        d1.add(10.0);
        d1.add(12.0);
        Object tree[] = d1.toArray();
        for (Object d2:tree){
            System.out.println(d2);



        }//alternatively we can use the following way
        Double[]treeSet1 = new Double[d1.size()];
        d1.toArray(treeSet1);
        for (int i=0;i<d1.size();i++){
            System.out.println(treeSet1[i]);
        } //or let us apply foreach loop.
        for (Double d3:treeSet1){
            System.out.println(d3);
            //or we can use lambda expression
        }
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);//both are equivalent

      //  Here are some more examples of how strings can be used:

        System.out.println("At the end of the war");
        System.out.println(str);

        System.out.println("abc");
        String cde = "cde";
        System.out.println("abc" + cde);
        String c = "abc".substring(2,3);
        String d = cde.substring(1, 2);
        System.out.println(c);
        System.out.println(d);
        cde.lines();
        System.out.println(cde.repeat(2));
        System.out.println(cde.strip());
        System.out.println(str.stripTrailing());
        String str1 ="hello guys welcome to java";
        String str2 = str1.substring(2,str1.length()-2);
        System.out.println(str1.toUpperCase());
        System.out.println(str1.repeat(2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.strip());
        System.out.println(str1.indexOf(str2));
        System.out.println(str2);


    }
    public static void stackMethod(){
        Stack<Integer>stack = new Stack<>();
        stack.push(9);
        stack.push(10);
        stack.push(4);
        stack.push(8);
        System.out.println(stack);
        Object stack1[] = stack.toArray();
        stack.forEach(e->System.out.println(e));//or
        for (Object obj1:stack1){
            System.out.println(obj1);
        }//or
        Integer[]mac = stack.toArray(Integer[]::new);
        for (int i= 0;i<stack.size();i++){
            System.out.println(mac[i]);
        }

    }

}











