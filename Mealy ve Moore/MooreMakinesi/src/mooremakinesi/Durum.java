/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooremakinesi;

/**
 *
 * @author gunay
 */
public class Durum {
    
    public String durumAdi; 
    public String durumCiktisi; //1 veya 0 gibi
    public Durum gecisler[]; // geçişlerin her biri durum olduğu için

    public Durum(String durumAdi, int gecislerBoyutu) {
        this.durumAdi = durumAdi;
        gecisler = new Durum[gecislerBoyutu];
    }
    
}
