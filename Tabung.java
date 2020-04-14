/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pbo.v4;

/**
 *
 * @author User
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class Tabung extends Bangunruang {

    protected Double voltab, jari, t;
    Scanner input = new Scanner (System.in);
    public void Brt () {
        DecimalFormat df = new DecimalFormat();
        
        System.out.print ("Masukkan Nilai Jari-jari "+jari);
        jari = input.nextDouble();
        System.out.print ("Masukkan Nilai tinggi " +t);
        t = input.nextDouble();
       
        
        voltab = 0.5 * Math.PI * jari * jari * t;
        System.out.println("Volumr Tabung adalah " + df.format(voltab) + " cm3");

    }

}
