package test;

public class Stage3 {
	public static void main(String[] args) {

		/*
		 * // Exercise 1 
		 * int A = 3; 
		 * int B = 8; 
		 * for(A = 3; A <= B; A++)
		 * System.out.println(A + "");
		 * 
		 * // Exercise 2 
		 * int A = 3; 
		 * int B = 8; 
		 * for(int z=B-1; z > A; z--)
		 * System.out.println(z + "");
		 * 
		 * // Exercise 3 
		 * int N = 4; 
		 * int K = 0; 
		 * for (int i = 1; i <= N; i = i +2) 
		 * K = K + i;
		 * for (int j = 0; j <= N; j = j + 2)
		 * K = K - j;
		 * System.out.println(K);
		 
		// Exercise 4
		double N = 6;
		int K = 1;
		for(int i = 1; i <= N; i++)
			K *= i;
		System.out.println(K);
		
		// Exercise 5
		int b = 6;
		int a = 2;
		for(int i = a; i <= b; i++){
			for(int j = 0; j <= i - a; j++){
				System.out.print(i+" ");
			}
		*/
		// Exercise 6
		int a = 41;
		int b = 9;
		int i = 0;

		while(a >= b){
			a = a - b;
			i++;
		}
		System.out.println(i);
		System.out.println(a);
		}
	}
