package bai2;
import java.util.*;

//Nhập vào 1 số, kiểm tra: > 0 in ra Positive; < 0 in ra Negative; = 0 in ra 0
//phân tích: 

public class bai2_3 {
	public static void main(String [] args) {

		Scanner input = new Scanner (System.in);
		while(true) {
		int number = InputNumber(input);
		CheckNumber(number);
		}	
	}
	
	public static int InputNumber(Scanner input) {
		int n;
		do{
		System.out.print("Nhap vao so can kiem tra: ");
			n = input.nextInt();
			return n;
		}while(true);
	}
	public static void CheckNumber (int n) {
		if(n>0) {
			System.out.println("Positive");
		}
		else if(n<0) {
			System.out.println("Negative");
		}
		else {
			System.out.println("0");
		}
		
	}
}
