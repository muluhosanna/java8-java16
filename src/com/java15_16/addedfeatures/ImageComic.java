package com.java15_16.addedfeatures;

public final class ImageComic extends ComicBooks {
    public ImageComic(String author,String title,double price,String charactor){
        super(author,title,price,charactor);
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getAuthor(){
        return author;
    }

    @Override
    public String getTitle() {
        return null;
    }

    public String getCharactor(){
        return charactor;
    }
}
