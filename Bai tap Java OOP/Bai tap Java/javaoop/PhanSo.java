/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class PhanSo {
    static Scanner sc = new Scanner(System.in);
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public void congPhanSo(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTong = new PhanSo(tuSo, mauSo);
        System.out.print("Tong 2 phan so: ");
        display(phanSoTong);
        
    }

    public void truPhanSo(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoHieu = new PhanSo(tuSo, mauSo);
        System.out.print("Hieu 2 phan so: ");
        display(phanSoHieu);
    }

    public void nhanPhanSo(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getTuSo();
        int mauSo = this.getMauSo() * ps.getMauSo();
        PhanSo phanSoTich = new PhanSo(tuSo, mauSo);
        System.out.print("Tich 2 phan so: ");
        display(phanSoTich);
    }

    public void chiaPhanSo(PhanSo ps) {
        int tuSo = this.getTuSo() * ps.getMauSo();
        int mauSo = this.getMauSo() * ps.getTuSo();
        PhanSo phanSoThuong = new PhanSo(tuSo, mauSo);
        System.out.print("Thuong 2 phan so: ");
        display(phanSoThuong);
    }

    public void display(PhanSo p) {
        System.out.println(p.getTuSo() + "/" + p.getMauSo());
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao tu so phan so thu nhat");
        int tuSo1 = sc.nextInt();
        System.out.println("Nhap vao mau so phan so thu nhat");
        int mauSo1 = sc.nextInt();
        PhanSo p1 = new PhanSo(tuSo1, mauSo1);
        System.out.print("Phan so thu 1: ");
        p1.display(p1);
        System.out.println("Nhap vao tu so phan so thu hai");
        int tuSo2 = sc.nextInt();
        System.out.println("Nhap vao mau so phan so thu hai");
        int mauSo2 = sc.nextInt();
        PhanSo p2 = new PhanSo(tuSo2, mauSo2);
        System.out.print("Phan so thu 2: ");
        p2.display(p2);
        p1.congPhanSo(p2);
        p1.truPhanSo(p2);
        p1.nhanPhanSo(p2);
        p1.chiaPhanSo(p2);
         
    }

}
