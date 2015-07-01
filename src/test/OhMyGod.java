package test;

public class OhMyGod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 1;
		int B = 2;
		int C = 3;
		
		A = C - A - B;
		B = C - A - B;
		C = C - A - B;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		
		A = 0;
		B = 9;
		C = 8;
		
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
	}

}
