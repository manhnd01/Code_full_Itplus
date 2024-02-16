package bai2;
import java.util.*;

// viết script nhập vào điểm: kết quả trả về xếp loại: 
// Lớn hơn 8: giỏi; lớn hơn 6,5: khá; lớn hơn 5 trung bình; còn lại yếu

public class bai2_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		InputPoint(input);
		input.close();
	}
	
	public static void InputPoint(Scanner input) {
		int n;
		while(true) {
			System.out.print("\nNhap vao diem hoc vien: ");	
			n = input.nextInt();
			if(n<0||n>10) {
				break;
			}
		if(n>8&&n<=10) {
			System.out.print("Hoc vien Gioi.\n");
		}
		else if(n>6.5) {
			System.out.print("Hoc vien Kha.\n");
		}
		else if(n>5) {
			System.out.print("Hoc vien Trung binh.\n");
		}
		else {
			System.out.print("Hoc vien Yeu.\n");
		}
		}
	}
}
	


