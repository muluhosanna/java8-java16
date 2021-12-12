package com.java8.addedfeatures;

public class ComicBook {
    protected String author;
    protected String yearOfPublication;
    protected String character;
    protected static int uniqueId = 9670078;
    public double price;
    protected String serialNumber ;
    public static String initial;

    public ComicBook() {
        System.out.println("hello world");
       // ++uniqueId;
        this.serialNumber = serialNumber;
    }

    public ComicBook(String author, String character, String yearOfPublication) {
        this.author = author;
        this.character = character;
        this.yearOfPublication = yearOfPublication;
        //setSerialNumber();
        //id++;
        //this.serialNumber =  setSerialNumber();
        //System.out.println("This is the most difficult time than ever");
    }
    //public String getInitial(){
       // return "Cm";
   // }
    public void setInitialAndId(String initial, int uniqueId){
       this.uniqueId = uniqueId;
       this.initial = initial;

       // return false;
    }

    public synchronized String getSerialNumber() {
       this.serialNumber  = initial + uniqueId++;
        return serialNumber;
    }
}
