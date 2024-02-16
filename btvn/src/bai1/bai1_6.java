package bai1;
import java.util.*;

//Viết script hiển thị số Fibonaci của một số bất kì
// Phân tích: Số fibonaci: ví dụ số 8 có dãy số Fibo: 0,1,1,2,3,5,8
// f(n) = f(n-1) + f(n-2) (n>2)

public class bai1_6 {
	public static void main(String[] args) {
		int n;
		while(true) {
			Scanner input = new Scanner (System.in);
			System.out .print("\n Nhap vao so Fibonaci: ");
			n = input.nextInt();
			if(n==0||n<0) {
				System.out.println("Nhap sai.");
				break;
			}
			System.out.print("Cac so Fibo tu 0 den " + n+ " la:");
			checkFibo(n);
		}
	}
	public static void checkFibo(int n) {
		int first =0;
		int second =1;
		int next = first + second;
		System.out.print(first +" ");
		while(next<=n) {
			System.out.print(next + " ");
			first = second;
			second = next;
			next = first + second;
		
		}
	}	
}
