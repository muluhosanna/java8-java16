package com.java8.addedfeatures;

public class ImageComic extends ComicBook{
    public ImageComic(String author,String character,String yearOfPublication){
        super(author,character,yearOfPublication);
    }
    protected void setInitial(String initial){
        this.initial  = initial;
    }
    protected void setIniatl(String iniatl){
        this.initial = iniatl;
    }
    public String getInitial(){
        return "Im";
    }
    @Override
    public String getSerialNumber(){
        return serialNumber;

    }
}
