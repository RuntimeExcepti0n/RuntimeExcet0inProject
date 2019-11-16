package com.dragon.demo;

import java.util.Random;

public class Test2 {
    public static void main(String args[]){
        System.out.println(FinalTest2.x);
    }
}

class FinalTest2{

    public static final int x =new Random().nextInt(100);
    static {
        System.out.println("FinalTest2 static block");
    }
}