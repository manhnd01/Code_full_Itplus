package bai1;

public class toan_tu {
	public static void main(String [] args) {
		int a = 5;
		int b = ++a; // a = a +1 sau đó gán cho b = 6
		int c = b++; // lúc này b = 6 gán cho c = 6 sau đó tăng b lên 1 b = b +1 = 7
		int d = ++b; // tăng b lên 1 b = b +1 = 8, sau đó gán b =8 cho d
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("---------------");
		
		int num1 = 3;
		int num2 = 4;
		
		int num3 = 3;
		int num4 = 4;
		
		System.out.println((num1 < num2) && (num1++ > num2));
		System.out.println((num3 > num4) && (num3++ > num4));
		System.out.println(num1);
		System.out.println(num3);
		// so sánh num 1 với num 2 nếu đúng thì tiếp tục so sánh vế sau
		// nếu so sánh vế trước sai thì không cần so sánh vế sau
		
		// trong trường hớp ||, so sánh vế trước đúng không cần so sánh vế sau,
		// còn vế trước sai thì tiếp tục so sánh vế trước.
		
	}
}
