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
public class BaiTap3Main {
   
    public static void main(String[] args) {
        
        SinhVienPoly svPoly = new SinhVienBiz("Nguyen Phuong Hong","DESIGN",7,8);
        SinhVienIT svIT = new SinhVienIT( "Ho Thanh Thai","CNTT",6,7,10);
        SinhVienBiz svBiz = new SinhVienBiz("Ly Tuan Ty","TESTER",1,6);
        
        svPoly.xuat();
        System.out.println("Diem: " + svPoly.getDiem() 
                + "\nHoc luc: " + svPoly.getHocLuc() + "\n");
        svIT.xuat();
        System.out.println("Diem: " + svIT.getDiem() 
                + "\nHoc luc: " + svIT.getHocLuc() + "\n");
        svBiz.xuat();
        System.out.println("Diem: " + svBiz.getDiem() 
                + "\nHoc luc: " + svBiz.getHocLuc() );
        
    }
    }
    
    

