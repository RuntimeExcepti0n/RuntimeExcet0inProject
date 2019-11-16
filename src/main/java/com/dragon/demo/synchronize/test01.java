package com.dragon.demo.synchronize;

public class test01 {

    public static void main(String[] args) {

    }

    public void method1(String billNo){

        synchronized (billNo){
            System.out.println(billNo+"拿到锁");
        }

    }
}
