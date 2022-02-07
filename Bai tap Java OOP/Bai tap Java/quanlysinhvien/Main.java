/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    public static void main(String[] args) {
        int choise;
        Scanner sc = new Scanner(System.in);
        QuanLySinhVIen q = new QuanLySinhVIen();
        do {
            showMenu();
            choise = sc.nextInt();
            if (choise == 0) {
                System.out.println("Exit!");
                break;
            }
            switch (choise) {
                case 1:

                    q.nhapThongTin();
                    break;
                case 2:
                    System.out.print("Nhap vao ma sinh vien can sua: ");
                    int id1 = sc.nextInt();
                    q.edit(id1);
                    break;
                case 3:
                    System.out.print("Nhap vao ma sinh vien can xoa: ");
                    int id2 = sc.nextInt();
                    q.delete(id2);
                    break;
                case 4:
                    q.sortByGPA();
                    break;
                case 5:
                    q.sortByName();
                    break;
                case 6:
                    q.display();
                    break;
                default:
                    System.out.println("Xin chọn lại!");
                    break;
            }
        } while (choise != 0);

    }

    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Add student.");
        System.out.println("2. Edit student by id.");
        System.out.println("3. Delete student by id.");
        System.out.println("4. Sort student by gpa.");
        System.out.println("5. Sort student by name.");
        System.out.println("6. Show student.");
        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("Please choose: ");
    }
}
