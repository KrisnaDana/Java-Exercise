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
        
        //unary = operasi yang dilakukan pada satu variabel saja
        
        //unary + dan - (konsep mirip perkalian simbol)
        int angka = 1;
        int angka2 = -1;
        System.out.printf("unary '-', %d menjadi %d\n", angka, -angka);
        System.out.printf("unary '+', %d menjadi %d\n", angka2, +angka2); // minus di unary plus jadi minus, mius dikali plus jadi minus
        
        //Unary decrement dan increment
        
        //Increment
        int i = 10;
        i++;
        System.out.println("Nilai dengan '++' menjadi = " + i);
        
        //Decrement
        int j = 10;
        j--;
        System.out.println("Nilai dengan '--' Menjadi = " + j);
        
        int a = 5;
        System.out.println("Postfix = " + a++); //dieksekusi increment setelah ditampilkan
        int b = 5;
        System.out.println("Prefix = " + ++b); //dieksekusi increment sebelum ditampilkan
        
        
        // unary boolean dengan ! untuk negasi
        
        boolean ucup = true;
        System.out.println("Nilai ucup = " + ucup);
        System.out.println("Nilai bang ucup = " + !ucup);
        
        
    }
    
}
