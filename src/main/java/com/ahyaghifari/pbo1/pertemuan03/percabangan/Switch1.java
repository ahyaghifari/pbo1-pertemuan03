package com.ahyaghifari.pbo1.pertemuan03.percabangan;

public class Switch1 {
    public static void main(String[] args) {
        int jalanJalan=3;
        switch(jalanJalan){
            case 1:
                System.out.println("urang lapas");
                break;
            case 2:
                System.out.println("urang acayan");
                break;
            case 3:
                System.out.println("ubat nyamuk");
                break;
            case 4:
                System.out.println("dubil dit");
                break;
            default:
                System.out.println("makhluk halus");
                break;
        }
    }
}