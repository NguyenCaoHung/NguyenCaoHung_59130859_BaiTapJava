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
import java.util.ArrayList;
public class QuanLyNhanVien implements IQuanLy {
ArrayList<NhanVien> dsNV = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
    dsNV.add(nv);
    }

    @Override
    public void inDS() {
        for(int i=0; i< dsNV.size(); i++)
            System.out.println("nhan vien thu " + (i+1) + ": \n" 
                    + dsNV.get(i).getthongtin() + "\n");
    }
}
