/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package tugas.pbo.v4;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Kerucut extends Bangunruang {
Scanner input = new Scanner (System.in);
   
    DecimalFormat df = new DecimalFormat();
    protected Double volcut, jari, volcut2,t;
   

    public void Brk(Double jari, Double t) {
        
        System.out.print ("Masukkan Nilai Jari-jari "+jari);
        jari = input.nextDouble();
        System.out.print ("Masukkan Nilai tinggi " +t);
        t = input.nextDouble();
        volcut = 0.33 * Math.PI * jari * jari * t;
        
        volcut2 = this.t;
        System.out.println("Volume kerucut adalah " + df.format(volcut) + "cm3");
        System.out.println("Volume kerucut adalah " + volcut2 + " cm3");
    }
}
