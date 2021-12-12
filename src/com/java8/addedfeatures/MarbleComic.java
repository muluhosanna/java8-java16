package com.java8.addedfeatures;

public class MarbleComic extends ComicBook{
    public MarbleComic(){

    }
    public MarbleComic(String author,String character,String yearOfPublication){
        super(author,character,yearOfPublication);

    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber=serialNumber;
    }
   // public void setInitial(String initial){
       // this.initial =initial;
   // }

@Override
    public void setInitialAndId(String initial, int uniqueId){
        this.uniqueId = uniqueId;
        this.initial = initial;

       // return false;
    }
    public int getUniqueId(){
        return uniqueId;
    }


    public String getInitial(){
        return "Mr";

    }
    public String getSerialNumber(){
        return serialNumber=initial+ ++uniqueId;
    }


}
