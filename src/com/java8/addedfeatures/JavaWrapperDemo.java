package com.java8.addedfeatures;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class JavaWrapperDemo {
    private String firstName;
    private String lastname;
    private int id;
    private int age;
    static int count;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        JavaWrapperDemo.count = count;
    }

    public JavaWrapperDemo(String firstName, String lastname, int id, int age) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.id = id;
        this.age = age;
    }

    @Override
    public String toString() {
        return "JavaWrapperDemo{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JavaWrapperDemo)) return false;
        JavaWrapperDemo that = (JavaWrapperDemo) o;
        return id == that.id && age == that.age && Objects.equals(firstName, that.firstName) && Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastname, id, age);
    }

    public void testWrapper() throws IOException {
        Integer ninec = 9;
        Integer nineD = 9;
        long number1 = 25678;
        int bigValue = 280;
        byte small = (byte) bigValue;//explicit casting
        System.out.println(small);
        int number2 = (int) number1;// explicit casting
        System.out.println(number2);
        //Integer nineA= new Integer(9);
        //Integer nineB = new Integer(9);
        // System.out.println(nineA==nineB);
        //System.out.println(nineA.equals(nineB));
        //System.out.println(nineA==nineB);
        Integer hundred = Integer.valueOf("100");//static method. it makes hudred = hudred++
        Integer seven = Integer.valueOf("111", 2);//the string value of in base 2
        System.out.println(seven);
        System.out.println(hundred);
        System.out.println(ninec == nineD);
        String str1 = "value1";
        String str2 = "value2";
        str1.concat(str2);
        System.out.println(str1);// string is immutable.
        for (int i = 1; i <= 10; i++) {
            String str = str1 + str2;
            //System.out.println(str);
        }
        StringBuffer s3 = new StringBuffer("value1");// string buffer is used synchronised
        for (int i = 0; i < 10; i++) {
            s3.append(str2);
            //System.out.println(s3);
        }
        String test = """
                what happen dear friend 
                we have to solve the problem 
                based on the fact that 
                it has emphasis otherwise it will be difficult
                         
                """;

        Scanner scanner = new Scanner(test);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        byte[] tester = test.getBytes();
        ByteArrayInputStream byteInput = new ByteArrayInputStream(tester);
        int amount = byteInput.available();
        for (int i = 0; i < amount; i++) {
            System.out.print((char) byteInput.read());

        }
        System.out.println("The above is for testing the example other it will be difficult to determine");
        System.out.println(test.length());
        System.out.println(test.substring(3, test.length() - 1));
        test.substring(test.length() - 5, test.length());
        System.out.println(test.substring(test.length() - 5, test.length()));
        System.out.println(test.toUpperCase());
        System.out.println(test.lines());

    }

    public void arraymath() {
        ArrayList<JavaWrapperDemo> firstWrapper = new ArrayList<>();
        JavaWrapperDemo javawrapper1 = new JavaWrapperDemo("kelu", "keskisew", 678, 23);
        JavaWrapperDemo javawrapper2 = new JavaWrapperDemo("tatek", "hunegnaw", 900, 65);
        JavaWrapperDemo javawrapper3 = new JavaWrapperDemo("mikir", "kassaw", 800, 46);
        JavaWrapperDemo javawrapper4 = new JavaWrapperDemo("kokeb", "haile", 600, 45);
        firstWrapper.add(javawrapper1);
        firstWrapper.add(javawrapper2);
        firstWrapper.add(javawrapper3);
        firstWrapper.add(javawrapper4);

        System.out.println("************************************");
        System.out.println(firstWrapper);
        JavaWrapperDemo[] str = firstWrapper.toArray(JavaWrapperDemo[]::new);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }


    }

    public void arrayTostring() {
        int[] sampleArray = {25, 30, 50, 10, 5};
        System.out.println(Arrays.toString(sampleArray));// this is to print the content of the array
        int[][] samplearray2 = {{1, 2, 3}, {4, 5, 6}};
        int[][] sampleArray3 = {{1, 2, 4}, {7, 8, 9}};
        System.out.println(Arrays.deepToString(samplearray2));//this is to print the content of the array
        System.out.println(Arrays.equals(sampleArray3, samplearray2));//to compare to arrays
    }

    public void testCross() {
        int[] sampleArray4 = {2,3,5,6,7};
        System.out.println(sampleArray4.length);
        if (sampleArray4[0] > sampleArray4[2] && sampleArray4[1] < sampleArray4[3]) {
            System.out.println(true);
        } else if (sampleArray4.length < 4) {
            System.out.println(false);
        } else if ((sampleArray4[0] < sampleArray4[2]) && (sampleArray4[3] < sampleArray4[1]) && (sampleArray4[2] < sampleArray4[4])) {
            System.out.println(true);

        } else if ((sampleArray4[2] <= sampleArray4[4]) && (sampleArray4[1] == sampleArray4[3])) {
            System.out.println(true);
        } else if ((sampleArray4[3] < sampleArray4[1]) && (sampleArray4[2] <= sampleArray4[4])) {
            System.out.println(true);
        } else if ((sampleArray4[2] - sampleArray4[4] == 0) && (sampleArray4[1] == sampleArray4[3])) {
            System.out.println(true);
        } else {
            System.out.println(false);



        }
    }
}
