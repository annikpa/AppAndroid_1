package com.example.andrey.appgit_1;

public class A1 {

    public long getX() {
        x=System.currentTimeMillis();
        return x;
    }

    private long x;
    public A1(){

        // x=System.currentTimeMillis();
        // System.out.println("TimeMillis= "+x);
        System.out.println("Конструктор А1");
    }
}