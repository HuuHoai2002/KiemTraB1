package B1_1;

import java.util.Scanner;

public class GiangVien {
	private String hoTen;
	private String ngaySinh;
	private String tenMonHoc;

	public String getTenMonHoc() {
		return this.tenMonHoc;
	}

	Scanner scanner = new Scanner(System.in);

	public void Nhap() {
		System.out.println("Nhập vào họ tên của giảng viên: ");
		hoTen = scanner.nextLine();
		System.out.println("Nhập vào ngày sinh của giảng viên: ");
		ngaySinh = scanner.nextLine();
		System.out.println("Nhập vào môn học giảng dạy của giảng viên: ");
		tenMonHoc = scanner.nextLine();
	}

	public void Xuat() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Môn giảng dạy: " + tenMonHoc);
	}
}
