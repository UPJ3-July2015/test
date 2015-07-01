package test;

public class Stage2 {
	public static void main(String[] args) {
		// Exer. 1
		int L = 1456;
		int a = L / 100;
		System.out.println(a);
		
		// Exer. 2
		int a2 = 34;
		System.out.println((a2%10)+""+a2/10);
		
		// Exer. 3
		int a3 = 943;
		System.out.println((a3%100)%10+""+((a3/10)%10)+""+(a3/100));
		
		// Exer. 4
		int A = 5;
		int B = 7;
		int C = 2;
		int Square = (A/C) * (B/C);
		int Balance = (A*B - C*C*Square);
		System.out.println(Square);
		System.out.println(Balance);
	}
}