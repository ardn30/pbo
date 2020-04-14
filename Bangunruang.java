/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pbo.v4;

import java.text.DecimalFormat;
import java.util.Scanner;
public class Bangunruang {
public static void main (String[] args)     {
 
    Scanner coba  = new Scanner (System.in);
   
    Bola  B  = new Bola ();
    Tabung Tb = new Tabung ();
    Kerucut Kc = new Kerucut ();
    
    System.out.println("1. Bola");
    System.out.println("2. Tabung");
    System.out.println("3. Kerucut");
    System.out.print  ("Masukkan Pilihan Anda :" );
    int pilih = coba.nextInt();
    switch(pilih){
        case 1 :
            Bola Obj.Brb = new Bola ();
            break;
        case 2 :
            Tabung Brt = new Tabung();
            break;
        case 3 :
            Kerucut Brk = new Kerucut();
            break;
        default:
            System.out.println("Mohon Maaf Salah Input :");
}
}

   
}
