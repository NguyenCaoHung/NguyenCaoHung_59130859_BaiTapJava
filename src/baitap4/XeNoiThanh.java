/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap4;

/**
 *
 * @author PC
 */
public class XeNoiThanh extends ChuyenXe{
    public int soTuyen;
    public int soKm;
    
    public XeNoiThanh(String a, String b, String c, double d, int e, int f) {
        super(a, b, c, d);
        this.soTuyen = e;
        this.soKm = f;
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("So tuyen xe: " + this.soTuyen 
                + "\nSo km di duoc: " + this.soKm + "\n");
    }
}