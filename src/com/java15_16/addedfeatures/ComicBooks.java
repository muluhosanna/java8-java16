package com.java15_16.addedfeatures;

public abstract sealed class ComicBooks implements ComicInterface permits MarbleComic,DcComic,ImageComic {
    String author;
    String title;
    double price;
    String charactor;
    public ComicBooks(String author,String title,double price,String charactor){
        this.author = author;
        this.title= title;
        this.charactor=charactor;
    }
    public abstract String getCharactor();
    public abstract String getAuthor();

}
