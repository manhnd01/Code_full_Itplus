package bai1;
import java.util.*;

//script bảng cửu chương cho một số bất kì
// phân tích: n*i = result
public class bai1_4 {
	public static void main(String[] args) {
		int n,i;
		int result=0;
		Scanner input = new Scanner (System.in);
		System.out.print("Bang cuu chuong: ");
		n = input.nextInt();
		
		for(i =1;i<=10;i++) {
			result = n*i;
			System.out.println(n+ " x " +i +" = " +result);
		}
		
	}

}
