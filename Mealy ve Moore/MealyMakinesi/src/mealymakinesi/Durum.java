/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mealymakinesi;

/**
 *
 * @author gunay
 */
public class Durum {
    
    public String durumAdi; 
    public Durum gecisler[]; 
    public String cikislar[];

    public Durum(String durumAdi, int boyut) {
        this.durumAdi = durumAdi;
        gecisler = new Durum[boyut];
        cikislar = new String[boyut];
    }
    
}
