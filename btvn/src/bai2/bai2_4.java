package bai2;
import java.util.*;

// Tính giai thừa, n! = n*(n-1) (n>1)
// In ra 20 số đầu tiên của dãy fibo
// Tính lãi kép cho một ngân hàng. Đầu vào có số tiền gửi, lãi suất và số tháng gửi
// In ra các số từ 1 --> 100. Nếu số đó chia hết cho 3 in ra từ "Hello", chia hết cho 5 in ra từ "World",
//						chia hết cho cả 3 và 5 in ra từ "HelloWorld". Các số khác in ra số như bình thường

//
public class bai2_4 {
	public static void main(String [] args) {
		Scanner input = new Scanner (System.in);
		int count;
		int Num = InputNumber(input);
		System.out.print(Num + "! = "  );
		GiaiThua(Num);
		Fibo(20);
	}
	
	//Nhập
	public static int InputNumber(Scanner input) {
		int n;
		System.out.print("Nhap vao so:  ");
		n = input.nextInt();
		return n;
	}
	
	//Tính giai thừa
	public static void GiaiThua(int n) {
		int tich =1;
		for(int i=1;i<=n;i++) {
			tich = tich*i;
		}
		System.out.print(tich);
	}
	
	//Hiển thị 20 số đầu của dãy fibo f(n) = f(n-1) + f(n-2) (n>2)
	public static void Fibo(int k) {
		int count =2;
		int first =0;
		int second =1;
		int next = first + second;
		System.out.println();
		System.out.print("\n20 so dau cua day Fibo: \n");
		System.out.print(first + " ");
		System.out.print(next + " ");
		while(count <k) {
			System.out.print(next + " ");
			first = second;
			second = next;
			next = first + second;
			count ++;
		}
	}
}
