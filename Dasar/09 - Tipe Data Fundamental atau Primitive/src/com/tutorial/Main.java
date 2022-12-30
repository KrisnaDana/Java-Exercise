/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorial;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args){
        //Tipe data: integer, byte, short, long, double, float, char, boolean
        //Tidak ada unsigned
        
        //Integer
        int i = 0;
        System.out.println("=======INTEGER======");
        System.out.println("Nilai i = " + i);
        System.out.println("Nilai Maksimal Integer = " + Integer.MAX_VALUE);
        System.out.println("Nilai Minimal Integer = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + "byte");
        System.out.println("Besar Integer = " + Integer.SIZE + "bit");
        
        //Byte
        byte b = 0;
        System.out.println("\n=======Byte======");
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai Maksimal Byte = " + Byte.MAX_VALUE);
        System.out.println("Nilai Minimal Byte = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + "byte");
        System.out.println("Besar Byte = " + Byte.SIZE + "bit");
        
        //Short
        short s = 0;
        System.out.println("\n=======Short======");
        System.out.println("Nilai s = " + s);
        System.out.println("Nilai Maksimal Short = " + Short.MAX_VALUE);
        System.out.println("Nilai Minimal Short = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + "byte");
        System.out.println("Besar Short = " + Short.SIZE + "bit");
        
        //Long
        long l = 0L; //huruf belakang angka untuk membedakan long dengan integer
        System.out.println("\n=======Long======");
        System.out.println("Nilai l = " + l);
        System.out.println("Nilai Maksimal long = " + Long.MAX_VALUE);
        System.out.println("Nilai Minimal long = " + Long.MIN_VALUE);
        System.out.println("Besar long = " + Long.BYTES + "byte");
        System.out.println("Besar long = " + Long.SIZE + "bit");
        
        //Double
        double d = 0.54d;
        System.out.println("\n=======Double======");
        System.out.println("Nilai d = " + l);
        System.out.println("Nilai Maksimal double = " + Double.MAX_VALUE);
        System.out.println("Nilai Minimal double = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + "byte");
        System.out.println("Besar Double = " + Double.SIZE + "bit");
        
        //Float
        float f = 0.17f;
        
        //Char
        char c = 'A';
        
        //Bolean
        boolean val = true;
        
        
    }
}
