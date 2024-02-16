package bai2;
import java.util.*;

// Tìm số lớn nhất trong 3 số: x, y, z
// Phân tích: gán t = x, so sánh t với y, nếu t lớn hơn y gán t = y; z cũng tương tự
public class bai2_1 {
	public static void main(String[] args) {
		int x,y,z;
		Scanner input = new Scanner (System.in);
		System.out.print("Nhap vao so thu nhat: ");
		x = input.nextInt();	
		System.out.print("\nNhap vao so thu hai: ");
		y = input.nextInt();
		System.out.print("\nNhap vao so thu ba: ");
		z = input.nextInt();
		
		System.out.print("So lon nhat: ");
		sosanh(x,y,z);
	}
	public static void sosanh(int x, int y, int z) {
		int max = x;
			if(max<y) {
				max=y;
			}	
			if(max<z) {
				max=z;
			}
		System.out.print(max);
	}
	
}
