package com.java8.addedfeatures;

import com.java15_16.addedfeatures.Nurse;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.function.DoubleBinaryOperator;

public class Rectangle implements Serializable {
    private int length;
    private  int width;
    private int area;
    public Rectangle(int lenght,int width){
        this.length= lenght;
        this.width = width;
        int area = lenght*width;


    }
    public void testSerial() throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStreamStream= new FileOutputStream("Rectangle.ser");//This is serialization
        ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStreamStream);
        objectOutputStream.writeObject(new Rectangle(5,6));//serialization
        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("Rectangle.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Rectangle rectangle = (Rectangle) objectInputStream.readObject();//deserial lization
        System.out.println(rectangle.area);
        System.out.println(rectangle.length);
        System.out.println(rectangle.width);


    }
    public void mapFunction(){
        Nurse nurse = new Nurse("lakew","mikir",123,45,38000);
        Nurse nurse1 = new Nurse("ayalew","megistu",250,34,30000);
        Nurse nurse2 = new Nurse("yidnekachew","awz",312,28,45000);
        Nurse nurse3 = new Nurse("kalu","gobeze",450,30,40000);


        Map<Nurse,Double>hasMap = new HashMap<Nurse, Double>();
        hasMap.put(nurse,380000.0d);
        hasMap.put(nurse1,30000.0d);
        hasMap.put(nurse2,45000.0d);
        System.out.println(hasMap);
        //System.out.println(hasMap.size());
        //System.out.println(hasMap.containsKey(380000.0d));
        System.out.println(hasMap.get(nurse));
    }
    public void treeFunction(){
        TreeSet<Integer>treeSet = new TreeSet<>();
        treeSet.add(55);
        treeSet.add(25);
        treeSet.add(35);
        treeSet.add(5);
        treeSet.add(45);
        System.out.println(treeSet.lower(25));
        System.out.println(treeSet.lower(5));

    }
}
