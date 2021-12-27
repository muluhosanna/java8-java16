package com.java15_16.addedfeatures;

public final class DcComic extends ComicBooks {
    public DcComic(String author,String title,double price,String charactor){
        super(author,title,price,charactor);
    }
    @Override
    public String getAuthor(){
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public String getCharactor(){
        return charactor;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
