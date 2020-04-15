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
public abstract class SinhVienPoly {
public String hoten;
    public String nganhHoc;
    
    public SinhVienPoly(String a, String b)
    {
        this.hoten = a;
        this.nganhHoc = b;
    }
   
    public abstract double getDiem();
    public String getHocLuc()
    {
        if(this.getDiem() < 5)
            return "yeu";
        else if(this.getDiem() < 6.5)
            return "trung binh";
        else if(this.getDiem() < 7.5)
            return "kha";
        else if(this.getDiem() < 9)
            return "gioi";
        else
            return "xuat sac";
    }
    
    public void xuat()
    {
        System.out.println("ho va ten: " + this.hoten + "\nNganh hoc: " + this.nganhHoc);
    }
}
