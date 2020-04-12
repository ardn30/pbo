/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class akun {
    int m,nm,diskon,th;
    int selimut,ts;
    int karpet,tk;
    int bg,tbg;
    int pk,tpk;
    int kg;
    Double a,b,d,c;
    String nama,alamat,hp;
    
    Scanner input = new Scanner (System.in);
   
   public void pembayaran ( int bg,int pk,int selimut,int karpet)
    {
        selimut = 25000;
        karpet  = 30000;
        bg      = 20000;
        pk      = (1 * kg);
        
        System.out.println  ("--------SELAMAT DATANG---------");
        System.out.println  ("====LAUNDRY PAKAIAN BARAKAH====");
        System.out.print    ("Masukkan Nama Anda    : ");
        nama = input.next();
        System.out.print    ("Masukkan Alamat Anda  : ");
        alamat = input.next();
        System.out.print    ("Masukkan No Handphone : ");
        hp = input.next();
        
        
    }
    void member () 
    {
        
        System.out.println   ("------------------WELCOME-----------------");
        System.out.println   ("Harga Masker              : Rp. 15.000,00" );
        System.out.print     ("Jumlah yang dibeli        : ");
        a = input.nextDouble();
       
        b= a * 15000;
        System.out.println   (" Jumlah Harga Awal        : "+b);
        
        c=(0.1)*b;
        System.out.println   (" Anda Mendapatkan diskon  : "+c);
        
        d=b-c;
        System.out.println   (" Total Belanjaan Anda     : "+d);
        
        
    }
    void nonmember ()
    { 
       
        System.out.println   ("------------------WELCOME-----------------");
        System.out.println   ("Harga Masker              : Rp. 15.000,00" );
        System.out.print     ("Jumlah yang dibeli        : ");
        a = input.nextDouble();
       
        b= a * 15000;
        System.out.println   (" Jumlah Harga Awal        : "+b);
        
     
        System.out.println   (" Anda Tidak Mendapatkan diskon !");
        
        d= b;
        System.out.println   (" Total Belanjaan Anda     : "+d);
        
        
        }
           
      
}
      
 

        
