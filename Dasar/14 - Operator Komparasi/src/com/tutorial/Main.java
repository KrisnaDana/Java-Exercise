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
        //operator komparasi menghasilkan nilai dalam bentuk boolean
        
        int a = 10;
        int b = 15;
        boolean hasilKomparasi;
        
        //operator equal atau persamaan
        hasilKomparasi = (a == b);
        
        System.out.println("persamaan a dan b = " + hasilKomparasi);
        
        //operator not equal atau pertidaksamaan
        hasilKomparasi = (a != b);
        
        System.out.println("pertidaksamaan a dan b = " + hasilKomparasi);
        
        //operator less than atau kurang dari
        hasilKomparasi = (a < b);
        
        System.out.println("kurang dari a dan b = " + hasilKomparasi);
        
        //operator greater than atau lebih dari
        hasilKomparasi = (a > b);
        
        System.out.println("lebih dari a dan b = " + hasilKomparasi);
        
        //operator less than equal atau kurang dari sama dengan
        hasilKomparasi = (a <= b);
        
        System.out.println("kurang dari sama dengan a dan b = " + hasilKomparasi);
        
        //operator greater than equal atau lebih dari sama dengan
        hasilKomparasi = (a >= b);
        
        System.out.println("lebih dari sama dengan a dan b = " + hasilKomparasi);
        
        
    }
    
}
