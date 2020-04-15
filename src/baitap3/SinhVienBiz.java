/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap3;

/**
 *
 * @author PC
 */
public class SinhVienBiz extends SinhVienPoly{
    
    public double diemMarketing;
    public double diemSales;
    
    public SinhVienBiz(String a, String b, double g, double h) {
        super(a, b);
        this.diemMarketing = g;
        this.diemSales = h;
    }

    @Override
    public double getDiem() {
        return (2*this.diemMarketing + this.diemSales)/3;
    }
}
