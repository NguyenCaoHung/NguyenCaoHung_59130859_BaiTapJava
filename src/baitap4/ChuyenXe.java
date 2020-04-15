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
public abstract class ChuyenXe {
    public String maSoChuyen;
    public String hoTenTaiXe;
    public String soXe;
    public double doanhThu;
    
    public ChuyenXe(String a, String b, String c, double d)
    {
        this.maSoChuyen = a;
        this.hoTenTaiXe = b;
        this.soXe = c;
        this.doanhThu = d;
    }
     public void xuat()
    {
         System.out.println("Ma so chuyen xe: " + this.maSoChuyen
         + "\nHo va ten tai xe: " + this.hoTenTaiXe + "\nSo xe: "
         + this.soXe + "\nDoanh thu: " + this.doanhThu);
    }
}