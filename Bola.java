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
    
    //extends pewarisan untuk bangun ruang
    public class Bola extends Bangunruang {
        protected Double volbola, jari;
        
        
        void Brb () {
           
            DecimalFormat df = new DecimalFormat ();
            
            System.out.print ("Masukkan Nilai Jari-jari"+jari);
            jari = this.variable ();
            
            Double pangkat = Math.pow(jari, 3);
        
            //Math.PI bawaan java, jari-jari pangkat 3 
            volbola = Math.PI * pangkat * 4 / 3;
            System.out.println ("Volume Bola adalah "+ df.format(volbola) + "cm3");
        }

    private Double variable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
