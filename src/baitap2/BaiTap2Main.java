/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap2;

/**
 *
 * @author PC
 */
import baitap1.NhanVien;
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    IQuanLy qlNV = new QuanLyNhanVien();
       
       NhanVien nv01 = new NhanVien();
       nv01.setten("Hồ Trúc An");
       nv01.settuoi(22);
       nv01.setdiachi("10 nguyen tat thanh");
       nv01.settienluong(1000000);
       nv01.settongsogiolam(24);
       
       NhanVien nv02 = new NhanVien();
       nv02.setten("Nguyen Tan Long");
       nv02.settuoi(22);
       nv02.setdiachi("10 cao ba quat");
       nv02.settienluong(200000);
       nv02.settongsogiolam(48);
       
       NhanVien nv03 = new NhanVien();
       nv03.setten("Nguyen Tan Long");
       nv03.settuoi(25);
       nv03.setdiachi("10 nguyen dinh chieu");
       nv03.settienluong(200000);
       nv03.settongsogiolam(48);
       
       NhanVien nv04 = new NhanVien();
       nv04.setten("Le Anh Tu");
       nv04.settuoi(35);
       nv04.setdiachi("10 tran phu");
       nv04.settienluong(1000000);
       nv04.settongsogiolam(24);
       
       NhanVien nv05 = new NhanVien();
       nv05.setten("Le Anh Tuan");
       nv05.settuoi(33);
       nv05.setdiachi("10 binh tan");
       nv05.settienluong(200000);
       nv05.settongsogiolam(48);
       //Them nhan vien vao danh sach va in ra man hinh
       qlNV.them(nv01);
       qlNV.them(nv02);
       qlNV.them(nv03);
       qlNV.them(nv04);
       qlNV.them(nv05);
       qlNV.inDS();
    
    }
    
}
