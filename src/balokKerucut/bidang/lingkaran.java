/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balokKerucut.bidang;

/**
 *
 * @author Muhammad Rizqi - 123190083
 */
public class lingkaran implements menghitungBidang{
    public double jariJari;

    public lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double luas(){
        return Math.PI*this.jariJari*this.jariJari;
    }
    
    @Override
    public double keliling(){
        return 2*Math.PI*this.jariJari;
    }
}
