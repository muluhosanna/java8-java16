package com.java8.fundamentals;

public class DcComic extends ComicBook{
    public DcComic(){}
    public DcComic(String author,String character,String yearOfPublication){
        super(author,character,yearOfPublication);
    }
    protected void setInitial(String initial){
        this.initial =initial;
    }
    public String getInitial(){
        return "Dc";
    }
    @Override
    public String getSerialNumber(){
        return serialNumber;
    }
}
