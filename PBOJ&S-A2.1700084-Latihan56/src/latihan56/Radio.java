/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan56;

/**
 *
 * @author acer
 * Nama     : Opan Dilaga
 * NIM      : A2.1700084
 * Kelas    : TI IV E J&S
 */
public class Radio extends BarangAntik {
     private String name; 
     public Radio(int umur ){
         this.umur = umur;

     }
     
      public String getName(){
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }

}
