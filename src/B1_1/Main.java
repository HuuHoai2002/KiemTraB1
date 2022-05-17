package B1_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số giảng viên: ");
		int n = scanner.nextInt();
		GiangVien gv[] = new GiangVien[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập vào thông tin của giảng viên thứ " + (i + 1));
			gv[i] = new GiangVien();
			gv[i].Nhap();
		}
		int soGvDayMonJava = 0;
		System.out.println("Thông tin các giảng viên vừa nhập là: ");
		for (GiangVien giangVien : gv) {
			if (giangVien.getTenMonHoc().equalsIgnoreCase("java")) {
				soGvDayMonJava++;
			}
			giangVien.Xuat();
			System.out.println();
		}
		System.out.println("Số giảng viên dạy môn lập trình java là: " + soGvDayMonJava);
		for (GiangVien giangVien : gv) {
			if (giangVien.getTenMonHoc().equalsIgnoreCase("java")) {
				giangVien.Xuat();
			}
		}
		scanner.close();
	}

}
