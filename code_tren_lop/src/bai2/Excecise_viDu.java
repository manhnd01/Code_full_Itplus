package bai2;


//tính tổng các số nguyên tố nhỏ hơn 500
//phân tích: số nguyên tố là số chỉ chia hết cho 1 và chính nó, số đặc biệt là số 2

public class Excecise_viDu {
	public static void main (String [] args) {
		int sum=0;
		int N = 1;
		while(N<500) {
			if(N<2) {
				N++;
				continue;	
			}
			else {
				boolean flag = true;
				for (int i =2; i<N ; i++) {
					if(N%i == 0) {
						flag = false;
						break;
					}
	
					}
				if(flag) {
						sum +=N;
				}
			N++;
		}
		
		}
		System.out.println(sum);
	}	
}
