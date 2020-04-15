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
public class SinhVienIT extends SinhVienPoly {
    public double diemJava;
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(String a, String b, double c, double d, double e) {
        super(a, b);
        this.diemJava = c;
        this.diemCss = d;
        this.diemHtml = e;
    }
    
    @Override
    public double getDiem() {
        
        return (2*this.diemJava + this.diemCss + this.diemHtml)/4;
    }
}
