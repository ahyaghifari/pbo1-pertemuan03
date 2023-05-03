/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ahyaghifari.pbo1.pertemuan03.string;

/**
 *
 * @author Ahya Ghifari
 */
public class OperasiString {
    public static void main(String[] args){
        String kota1 = "Banjarbaru";
        String kota2 = "Banjarmasin";
        System.out.println("Kota 1 :" + kota1);
        System.out.println("Kota 2 :" + kota2);
        System.out.println(kota1 + " dan " + kota2);
        
        System.out.println();
        
        char[] uniskaChar = {'U', 'N', 'I', 'S', 'K', 'A'};
        String uniskaString = new String(uniskaChar);
        System.out.println(uniskaString);
        
        System.out.println(kota1.toUpperCase());
        System.out.println(kota1.toLowerCase());
        System.out.println(kota2.substring(7));
        System.out.println(kota1.substring(2, 5));
    
        System.out.println("");
        
        System.out.println("Jumlah karakter " + kota1 + " = " + kota1.length());
        System.out.println(kota1.replace('a', 'i'));
    }
}
