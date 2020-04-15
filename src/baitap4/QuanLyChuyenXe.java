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
import java.util.ArrayList;
public class QuanLyChuyenXe {
    public ArrayList<ChuyenXe> dsCX = new ArrayList<>();
    
    public void themCX(ChuyenXe a)
    {
        dsCX.add(a);
    }
    public void xuatCX()
    {
        for(int i=0; i < dsCX.size(); i++)
            dsCX.get(i).xuat();
    }
    
    public double tongDoanhThuNoiThanh()
    {
        double sum = 0;
        for(ChuyenXe a : dsCX)
        {
            if(a instanceof XeNoiThanh)
                sum += a.doanhThu;
        }
        return sum;
    }
    public double tongDoanhThuNgoaiThanh()
    {
        double sum = 0;
        for(ChuyenXe a : dsCX)
        {
            if(a instanceof XeNgoaiThanh)
                sum += a.doanhThu;
        }
        return sum;
    }
    public double tongDoanhThuCacChuyenXe()
    {
        double sum = 0;
        for(ChuyenXe a : dsCX)
            sum += a.doanhThu;
        return sum;
    }
}