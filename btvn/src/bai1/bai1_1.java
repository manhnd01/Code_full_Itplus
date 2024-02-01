package bai1;
import java.util.*;

// Giải phương trình bậc 2
// Phân tích: Nhập 3 số của phương trình, sau đó tính delta = b2 - 4ac, Nếu delta > 0 thì có 2 nghiệm x1,x2
// Nếu delta = 0 nghiệm kép, Nếu delta < 0 thì vô nghiệm
public class bai1_1 {
	public static void main (String[] args)
	{
		double a,b,c;
		double x1,x2, x, delta;
		//Input
		System.out.println("Nhap 3 so cua phuong trinh");
		Scanner input = new Scanner (System.in);
		System.out.print("Nhap vao so a:");
		a = input.nextDouble();
		System.out.println(" a = " + a);
		System.out.print("Nhap vao so b:");
		b = input.nextDouble();
		System.out.println(" b = " + b);
		System.out.print("Nhap vao so c:");
		c = input.nextDouble();
		System.out.println(" c = " + c);
		System.out.println("Phuong trinh can giai:");
		System.out.println(a + "x^2 + (" + b + ")x + " + c);
		input.close();
		
		//Giải phương trình
		
		delta = b*b - 4*a*c;
		if(delta>0) {
			x1 = (-b + Math.sqrt(delta))/ (2*a);
			x2 = (-b - Math.sqrt(delta))/ (2*a);
			System.out.println("Nghiem cua phuong trinh la:");	
			System.out.println("x1  =  " +x1);
			System.out.println("x2  =  " +x2);
		}
		else if(delta==0) {
			x = - b / (2*a);
			System.out.println("Phuong trinh co nghiem kep:");
			System.out.println("x1  = x2 " +x);
		}
		else {
			System.out.println("Phuong trinh vo nghiem");
		}

	}
}
