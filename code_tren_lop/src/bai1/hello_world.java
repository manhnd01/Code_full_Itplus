package bai1;

public class hello_world {
	// phương thức mặc định để khởi chạy 1 chương trình Java core
	// phương thức siêu main: public static void main(string[] args){}
	// duy nhất phương thức có cấu trúc như trên mới được gọi là siêu main
	// JVM sẽ tìm đến hàm siêu main đầu tiên khi chạy 1 chương tình Java
	public static void main(String[] args) {
		int number =111;
		char a = 98; // convert từ char sang int và ngược lại trong bảng mã ASCI
		int c = 'a'; 
		
		
		String b = "toi la manh"; 
		System.out.println(number);
		System.out.println(a);
		System.out.println(c);
		System.out.println(b);
	}
	// Java sẽ chạy với màn hình console
}
