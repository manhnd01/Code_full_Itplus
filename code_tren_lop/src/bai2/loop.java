package bai2;
import java.util.*;


public class loop {
	public static void main (String[] args) {
		Scanner scan = new Scanner (System.in); // Scanner: quét dữ liệu nhập từ bàn phím
		
//		// Vòng lặp While
//		int number =0;
//		while(number != 100) {
//			System.out.println("Nhap gia tri");
//			number = scan.nextInt();
//		}
//		System.out.println(number);
//		
//		// so sánh: while và do while:
//		// vòng lặp do while sẽ không cần gán giá trị cho number1 vì: nó sẽ đọc cái giá trị
//		// nhập từ bàn phím trước rồi mới đem đi so sánh (lặp ít nhất 1 lần trước)
//		// Vòng While thì kiểm tra điều kiện trước, xem có true rồi mới lặp.
//		
//		// Vòng lặp do while
//		int number1;
//		do {
//			System.out.println("Nhap so gi do: ");
//			number1 = scan.nextInt();
//		} while(number1 != 100);
//		System.out.println(number1);
		
		
		//Vòng lặp for
		int number3;
		for (int i=0; i<10; i++) {
			System.out.println("Nhap so gi do:");
			number3 = scan.nextInt();
			if(number3==100) {
				System.out.println(number3);
				break;
			}
		}
		scan.close();
	}
}
