package com.hcl;
public class Ex1 {
    public static void main(String[] args) {
        int x=45;
        int y=0;
        try {
        //int x1=Integer.parseInt("welcome");
        
        int z=x/y;
        }catch(ArithmeticException | NumberFormatException e) {e.printStackTrace();}
        System.out.println("continue working");
    }
}