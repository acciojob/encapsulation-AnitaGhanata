package com.driver;

public class Main {
    public static void main(String[] arg){
        RWOnly obj=new RWOnly();

        obj.setName("Anita");
        String ans= obj.getName();

        System.out.println(ans);
    }
  
}