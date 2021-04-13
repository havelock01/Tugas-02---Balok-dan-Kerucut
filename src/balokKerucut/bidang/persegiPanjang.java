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
public class persegiPanjang implements menghitungBidang{
    public int panjang;
    public int lebar;

    public persegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    @Override
    public double luas(){
        return this.panjang*this.lebar;
    }
    
    @Override
    public double keliling(){
        return 2*(this.panjang+this.lebar);
    }
}


