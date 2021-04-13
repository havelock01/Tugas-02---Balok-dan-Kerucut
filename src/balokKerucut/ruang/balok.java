/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balokKerucut.ruang;

import balokKerucut.bidang.persegiPanjang;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class balok extends persegiPanjang implements menghitungRuang{
    int tinggi;
    
    public balok(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double volume(){
        return this.luas()*this.tinggi;
    }
    
    @Override
    public double luasPermukaan(){
        return 2*((this.panjang*this.lebar)+(this.panjang*this.tinggi)+(this.lebar*this.tinggi));
    }
}
