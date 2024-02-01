package bai1;

public class Oberator {
	public static void main(String[] args) {
		int number = 10;
		String str = "455";
		System.out.println(number + str);
		// check xem kết quả có phải dạng chuỗi
		System.out.println((number + str) instanceof String);
		//Cộng chuỗi: Xảy ra khi 1 trong 2 toán hạng của biểu thức là chuỗi
		//khi đó tất cả quy về thành chuỗi hết: "45" +"100"
		
		boolean boo = true;
		System.out.println(boo + str);
		
		// Logic
		// Gán
		// b += a ; b + a  rồi gán giá trị cho b
		// b -= a; b - a rồi gán giá trị cho a
	}
}
