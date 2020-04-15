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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NhanVien nv01 = new NhanVien();
        NhanVien nv02 = new NhanVien();
        nv02.setten("Mai Kim Trong");
        nv02.settuoi(22);
        nv02.setdiachi("10 Nguyen Tat Thanh");
        nv02.settienluong(200000);
        nv02.settongsogiolam(48);
        System.out.println(nv01.getthongtin());
        System.out.println(nv02.getthongtin());
    }
   }
    

