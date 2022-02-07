/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candidate;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class TestCandidate {
    ArrayList<Candidate> list = new ArrayList<>();
    public  ArrayList<Candidate> nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong thi sinh: ");
        int soLuongThiSinh = sc.nextInt();
        for (int i = 0; i < soLuongThiSinh; i++) {
            System.out.print("Nhap vao ma thi sinh: ");
            int id = sc.nextInt();
            System.out.print("Nhap vao ten thi sinh: ");
            String name = sc.nextLine();
            name = sc.nextLine();
            System.out.print("Nhap vao ngay thang nam sinh: ");
            String birthday = sc.nextLine();
            System.out.print("Nhap vao diem toan: ");
            double scoreMath = sc.nextDouble();
            System.out.print("Nhap vao diem van: ");
            double scoreLiterature = sc.nextDouble(); 
            System.out.print("Nhap vao diem anh: ");
            double scoreEnglish = sc.nextDouble();
            Candidate c = new Candidate(id, name, birthday, scoreMath, scoreLiterature, scoreEnglish);
            list.add(c);
        }
        return list;
    }
    public void display() {
        for (Candidate c : list) {
            System.out.println("Candidate{" + "id=" + c.getId() + ", name=" + c.getName() + ", birthday=" + c.getBirthday() + ", scoreMath=" + c.getScoreMath() + ", scoreLiterature=" + c.getScoreLiterature() + ", scoreEnglish=" + c.getScoreEnglish() + '}');
        }
    }
    public static void main(String[] args) {
        TestCandidate t = new TestCandidate();
        t.nhap();
        t.display();
        
    }
}
