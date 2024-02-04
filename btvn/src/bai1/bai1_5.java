package bai1;
import java.util.*;

//Script sử dụng kí tự '*' tạo hình tam giác, hình vuông,...
//Phân tích: hiển thị '*' tăng dần or giảm dần qua các hàng
//

public class bai1_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Nhap vao chieu cao: ");
		int n = input.nextInt();
		
		// Tam giác vuông trái dưới
		//Khi i = 0 thì j = i + 1 = 1 
		// Mà giá trị ban đầu của j là 0, 0<1 do vậy hiển thị '*' 1 lần
		// i =1, j =2. Tăng j lên 1 thì có  j =0 và j =1 <2. do đó hiển thị 2 lần '*'
		
		//tam giác vuông trái
		for(int i=0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		
		//Tam giác vuông phải dưới
		//
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print("  ");
			}
			for(int k =0;k<i+1;k++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		
		
		//tam giác cân
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int k =0;k<i+1;k++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		System.out.print("---------------\n");
		
		//tam giác vuông trên bên trái
		for (int i =0;i<n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" *");
			}
			System.out.print("\n");
		}
		
		//tam giác vuông trên bên phải
		for (int i =0;i<n;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("  ");
			}
			for(int k =0;k<n-i;k++) {
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		
	}
}
