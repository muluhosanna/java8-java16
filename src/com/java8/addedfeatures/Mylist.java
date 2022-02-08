package com.java8.addedfeatures;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.IntStream;

public class Mylist<T> {
    public void testGeneric() {
        ArrayList<T> list = new ArrayList<>();
        list.add(0, (T) "mulu");
        list.add(1, (T) "kelemu");
        list.add(2, (T) "mesafint");
        list.add(3, (T) "kemer");
        System.out.println(list.remove(0));

        System.out.println(list);
    }

    public int listOdd() {
        int sum = 0;


        List<Integer> numbers = Arrays.asList(1, 3, 4, 6, 2, 7);
        for (int number : numbers) {
            if (number % 2 != 0) {
                sum = sum + number;

            }
        }
       /* Integer[] integer = numbers.toArray(Integer[]::new);



        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                sum = sum + integer[i];


            }


        }*/

        return sum;
    }

    public void testUnicode() {
        System.out.println("\u0030");//unicode representing 0f 0
        System.out.println("\u0039");//unicode representation of 9
        System.out.println("\u0041");//unicode representation of A
        System.out.println("\u005A");// unicode representation of Z
        System.out.println("\u0061");//unicode representation of a
        System.out.println("\u007A");// unicode representation of z
        char ch = (char) 0XAB0041;
        System.out.println(ch);
        System.out.println((int) '2');
    }

    public void threeArray() {
        int[][][] array = new int[2][2][2];
        int num = 1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    array[i][j][k] = num;
                    num++;
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public void array2() {
        double[] myArray = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        int index = Arrays.binarySearch(myArray, 7.0);
        System.out.println("Postion of 7.0: " + index);

    }

    public void arraywrapping() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(20);
        arrayList.add(3);
        arrayList.add(10);
        arrayList.add(90);
        arrayList.add(123);
        arrayList.set(3, 30);
        arrayList.add(2, 10);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer it = iterator.next();
            System.out.println(it);


        }


        //System.out.println(arrayList.remove(3));

        //System.out.println(arrayList.toString());
        // int one = arrayList.get(1);
        // System.out.println(one);

    }

    public void testArray() {

        int[] array2 = new int[2];
        int target = 9;
        int[] num = new int[]{1, 2, 4, 5, 9, 90};

        for (int i = 0; i < num.length; i++) {


            if (i > 0 && num[i] + num[i + 1] == target) {
                array2[0] = i;
                array2[1] = i + 1;
                System.out.print(Arrays.toString(array2));


            }
            System.out.println();


        }

    }

    public void stringTest() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("java");
        stringBuilder.append("programmers are knowledgeable");
        stringBuilder.append("and also smart");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);
        System.out.println(stringBuilder.toString());
        System.out.println(stringBuilder.length());
        // System.out.println(stringBuilder.reverse());
        System.out.println(stringBuilder.charAt(9));
        String s = "wha is that";
        String str = "Lets go" + s;

        char[] chars = new char[str.length()];
        // str.getChars(0,str.length(),chars,0);
        //System.out.println(Arrays.toString(chars));
        //System.out.println(chars.length);
        // System.out.println(chars[3]);
        for (int i = 0; i < str.length(); i++) {// how to change string to character array
            chars[i] = str.charAt(i);
            // System.out.println(chars[i]);
        }
        for (char c : chars) {
            //System.out.println(c);
        }
        // let us see how to change string to byte array
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        //the following is the out put
        //[76, 101, 116, 115, 32, 103, 111, 119, 104, 97, 32, 105, 115, 32, 116, 104, 97, 116]


    }

    public String removeDup(String str) {
        if (str == null)
            return str;
        else if (str.length() == 1)
            return str;
        else if (str.isEmpty())
            return str;


        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                char d = result.charAt(j);
                if (c == d) {

                    isDuplicate = true;
                    break;
                }


            }
            if (!isDuplicate)
                result += "" + c;

        }
        return result;
    }
}

