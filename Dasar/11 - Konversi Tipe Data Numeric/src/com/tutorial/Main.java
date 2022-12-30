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
        //Program konversi data
        
        int nilaiInt = 450; //32 bit
        System.out.println("Nilai int = " + nilaiInt);
        
        long nilaiLong = nilaiInt;
        System.out.println("Nilai long = " + nilaiLong);
        
        //satuan rendah dilakukan konversi ke satuan tinggi itu tidak masalah
        //satuan tinggi dilakukan konversi ke satuan rendah maka terjadi masalah dan menhilangkan nilai aslinya
        
        //casting pembagian
        //diantara pembagian salah satu harus float
        int a=10;
        float b=4;
        
        float c=a/b;
        System.out.println("c = " + c);
        
        //jika tidak ingin merubah tipe data sebelumnya, lakukan konversi pada operasional
        int x = 10;
        int y = 4;
        
        float z=(float)x/y;
        System.out.println("z = " + z);
    }
    
}
