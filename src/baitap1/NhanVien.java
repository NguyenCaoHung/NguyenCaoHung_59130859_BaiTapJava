/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;

/**
 *
 * @author PC
 */
public class NhanVien {
    //khai bao thuoc tinh
    private String ten;
    private int tuoi;
    private String diachi;
    private double tienluong;
    private int tongsogiolam;
    
    //constructor khong co tham so
    public NhanVien()
    {
        this.ten = "";
        this.tuoi = 0;
        this.diachi = "";
        this.tienluong = 0;
        this.tongsogiolam = 0;
    }
    
    //constructor day du tham so
    public NhanVien(String a, int b, String c, double d, int e)
{
	this.ten = a;
	this.tuoi = b;
	this.diachi = c;
	this.tienluong = d;
	this.tongsogiolam = e;
}
    //cac ham set
    public void setten(String ten) 
    {
        this.ten = ten;
    }
    public void settuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public void setdiachi(String diachi)
    {
        this.diachi = diachi;
    }
    public void settienluong(double tienluong)
    {
        this.tienluong = tienluong;
    }
    public void settongsogiolam(int tongsogiolam)
    {
        this.tongsogiolam = tongsogiolam;
    }
    

    //cac ham get
    public String getten()
    {
        return this.ten;
    }
    public int gettuoi()
    {
        return this.tuoi;
    }
    public String getdiachi()
    {
        return this.diachi;
    }
    public double gettienluong()
    {
        return this.tongsogiolam;
    }
    public int gettongsogiolam()
    {
        return this.tongsogiolam;
    }
    
    //cac phuong thuc
    public String getthongtin()
    {
        return "ho va ten: " + this.ten + "\ntuoi: " + this.tuoi + "\ndia chi: " 
                + this.diachi + "\ntien luong: " + this.tienluong + "\ntong so gio lam : "
                + this.tongsogiolam + "\ntien thuong: " + this.tinhthuong();
    }
    public double tinhthuong()
    {
        if(this.tongsogiolam >= 200)
            return this.tienluong * 0.2;
        else if(this.tongsogiolam >= 100 &&  this.tongsogiolam < 200)
            return this.tienluong * 0.1;
        else
            return 0;
    } 
}

