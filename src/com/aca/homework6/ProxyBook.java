package com.aca.homework6;

import java.util.NoSuchElementException;

public class ProxyBook extends Book{
    private boolean FLAG = false;
    public boolean isLoaded(){
        return FLAG;
    }

    public boolean isFLAG() {
        return FLAG;
    }
    void load(){
        if(FLAG){
            throw new IllegalStateException("The book is already loaded");
        }
        FLAG = true;
    }

    @Override
    public String getAuthor() throws IllegalLoadException {
        if(!FLAG){
            throw new IllegalLoadException();
        }
        return super.getAuthor();
    }

    @Override
    public String getTitle() throws IllegalLoadException {
        if(!FLAG){
            throw new IllegalLoadException();
        }
        return super.getTitle();
    }
}
