package bai1;
import java.util.*;

// Script tính số ngày của tháng (ví dụ: nhập 2 có 29 ngày, nhập 3 có 31 ngày)
// Phân tích: Các tháng có 31 ngày: 1,3,5,7,8,10,12 -- tháng 2 có 28 or 29 ngày ----- tháng 2,4,6,9,11: 30 ngày
//
public class bai1_2 {
	public static void main (String[] args) {
		int number;
		Scanner input = new Scanner (System.in);
		System.out.println("Nhap vao thang can kiem tra:");
		number = input.nextInt();

		while (number >0) {
			if(number>12) {
				System.out.println("Nhap sai, Nhap lai:");
				number = input.nextInt();
			}
			else if (number <=12) {
				switch (number) {
					case 1:
						System.out.println("Thang 1 co 31 ngay");
						break;
					case 2:
						System.out.println("Thang 2 co 29 ngay");
						break;
					case 3:
						System.out.println("Thang 3 co 31 ngay");
						break;
					case 4:
						System.out.println("Thang 4 co 30 ngay");
						break;
					case 5:
						System.out.println("Thang 5 co 31 ngay");
						break;
					case 6:
						System.out.println("Thang 6 co 30 ngay");
						break;
					case 7:
						System.out.println("Thang 7 co 31 ngay");
						break;
					case 8:
						System.out.println("Thang 8 co 31 ngay");
						break;
					case 9:
						System.out.println("Thang 9 co 30 ngay");
						break;
					case 10:
						System.out.println("Thang 10 co 31 ngay");
						break;
					case 11:
						System.out.println("Thang 11 co 30 ngay");
						break;
					case 12:
						System.out.println("Thang 12 co 31 ngay");
						break;
				}
				break;
			}
		}
	}
}
