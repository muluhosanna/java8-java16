package com.java15_16.addedfeatures;

public non-sealed class MarbleComic extends ComicBooks {
    public MarbleComic(String author,String title,double price,String charactor){
        super(author,title,price,charactor);
    }

    @Override
    public String getCharactor() {
        return charactor;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getTitle() {
        return title;
    }
}
