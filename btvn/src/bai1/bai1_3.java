package bai1;
import java.util.*;

//Script tổng các số tự nhiên từ 1 -> n, hiển thị số chẵn lẻ từ 0 ->n
// Phân tích: ví dụ nhập 3 = 1+2+3 
// Vòng lặp chạy từ 1 đến n
public class bai1_3 {
	public static void main(String[] args) {
		int n;
		int sum=0;

		Scanner input = new Scanner (System.in);
		System.out.println("Nhap gia tri n : ");
		n = input.nextInt();
		
		for(int i=0;i<=n;i++) {
			sum +=i;
		}
		System.out.println("Tong cac so tu 1 den n: " +sum);
		
		//so chan
		System.out.print("Cac so chan la: ");
		for (int i =0;i<=n;i++) {
			if(i%2==0) {
				System.out.print(" " +i);
			}
		}
		//so le
		System.out.print("\nCac so le la: ");
		for (int i =0;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(" " +i);
			}
		}
			
	}
}
