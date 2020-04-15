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
public class XeNgoaiThanh extends ChuyenXe{
    public String noiDen;
    public int soNgayDiDuoc;
    
    public XeNgoaiThanh(String a, String b, String c, double d, String e, int f) {
        super(a, b, c, d);
        this.noiDen = e;
        this.soNgayDiDuoc = f;
    }

    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Noi den: " + this.noiDen 
            + "\nSo Ngay Di Duoc: " + this.soNgayDiDuoc + "\n");
    } 
}