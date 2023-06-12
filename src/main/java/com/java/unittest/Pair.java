package com.java.unittest;

public class Pair {
    private String from;
    private String to;
    Pair(String from,String to){
        this.from = from;
        this.to = to;
    }
    public boolean equals(Object object){
        Pair pair = (Pair)object;
        return this.from.equals(pair.from) && this.to.equals(pair.to);
    }
    @Override
    public int hashCode(){
        int hash = from.hashCode();
        hash = hash * 31 + to.hashCode();
        return hash;
    }
}

