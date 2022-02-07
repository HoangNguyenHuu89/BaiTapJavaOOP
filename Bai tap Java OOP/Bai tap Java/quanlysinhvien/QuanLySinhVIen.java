/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QuanLySinhVIen{

    public static Scanner sc = new Scanner(System.in);
    public ArrayList<SinhVien> studentList = new ArrayList<>();

    public void nhapThongTin() {
        System.out.println("Nhap so luong sinh vien:");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.print("Nhap id: ");
            int id = sc.nextInt();
            System.out.print("Nhap ten: ");
            String name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            int age = sc.nextInt();
            System.out.print("Nhap dia chi: ");
            String address = sc.nextLine();
            address = sc.nextLine();
            System.out.print("Nhap gpa: ");
            float gpa = sc.nextFloat();
            SinhVien sv = new SinhVien(id, name, age, address, gpa);
            studentList.add(sv);
        }
    }

    public void edit(int id) {
        for (SinhVien s : studentList) {
            if (s.getId() == id) {
                System.out.print("Nhap lai ten : ");
                String name = sc.nextLine();
                name = sc.nextLine();
                s.setName(name);
                System.out.print("Nhap lai tuoi: ");
                int age = sc.nextInt();
                s.setAge(age);
                System.out.print("Nhap lai dia chi: ");
                String address = sc.nextLine();
                address = sc.nextLine();
                s.setAddress(address);
                System.out.print("Nhap lai gpa: ");
                float gpa = sc.nextFloat();
                s.setGpa(gpa);
            } else {
                System.out.println("Khong ton tai sinh vien");
            }
        }
    }

    public void delete(int id) {
        for (SinhVien s : studentList) {
            if (s.getId() == id) {
                studentList.remove(s);
            }
        }
    }

    public void sortByGPA() {
        for (int i = 0; i < studentList.size(); i++) {
            Collections.sort(studentList, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien s1, SinhVien s2) {
                    return  (int)(s1.getGpa() - s2.getGpa());
                }
            });
        }
    }
    public void sortByName() {
        for (int i = 0; i < studentList.size(); i++) {
            Collections.sort(studentList, new Comparator<SinhVien>() {
                @Override
                public int compare(SinhVien s1, SinhVien s2) {
                    return  s1.getName().compareTo(s2.getName());
                }
            });
        }
    }

    public void display() {
        for (SinhVien s : studentList) {
            System.out.println(s.toString());
        }
    }


}
