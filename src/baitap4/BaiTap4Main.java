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
public class BaiTap4Main {
    public static void main(String[] args) {
        QuanLyChuyenXe qlCX = new QuanLyChuyenXe();
        ChuyenXe cxnt1 = new XeNoiThanh("A001","Ly Truc Thi","NT001",500000,60,70);
        ChuyenXe cxnt2 = new XeNoiThanh("A002","Cao Minh Tuan","NT002",500000,60,10);
        ChuyenXe cxnt3 = new XeNoiThanh("A003","Pham Nhac Lam","NT003",500000,10,70);
        ChuyenXe cxngt1 = new XeNgoaiThanh("B001","Tran Tai","NG001",600000,"DT-HCM",1);
        ChuyenXe cxngt2 = new XeNgoaiThanh("B002","Tran Duc","NG002",600000,"PY-NT",2);
        ChuyenXe cxngt3 = new XeNgoaiThanh("B003","Tran Huy","NG003",600000,"LC-HN",3);
        qlCX.themCX(cxnt1);qlCX.themCX(cxnt2);qlCX.themCX(cxnt3);qlCX.themCX(cxngt1);qlCX.themCX(cxngt2);qlCX.themCX(cxngt3);qlCX.xuatCX();
        System.out.println("\nTong doanh thu noi thanh: " + qlCX.tongDoanhThuNoiThanh()+ "\nTong doanh thu ngoai thanh: " + qlCX.tongDoanhThuNgoaiThanh()+ "\nTong doanh thu chuyen xe: " + qlCX.tongDoanhThuCacChuyenXe());
    }
    
}