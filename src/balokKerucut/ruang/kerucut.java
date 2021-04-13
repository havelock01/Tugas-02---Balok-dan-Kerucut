/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balokKerucut.ruang;

import balokKerucut.bidang.lingkaran;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class kerucut extends lingkaran implements menghitungRuang {
    int tinggi;
    
    public kerucut(double jari, int tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public double volume() {
        return ((double) 1/3)*this.luas()*this.tinggi;
    }

    @Override
    public double luasPermukaan() {
        double garisPelukis = Math.sqrt((this.jariJari*this.jariJari)+(this.tinggi*this.tinggi));
        return ((Math.PI)*this.jariJari*this.jariJari)+((Math.PI)*this.jariJari*garisPelukis);
    }
}
