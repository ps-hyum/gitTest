import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class boj2748_Fibonacci2 {
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[] fibo = new long[n+1];
		fibo[0] = 0;
		fibo[1] = 1;
		for(int i=2; i<=n; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		System.out.println(fibo[n]);
	}	

}
