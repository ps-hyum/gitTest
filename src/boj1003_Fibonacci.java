import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1003_Fibonacci {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		Fibo[] fibo = new Fibo[41];
		Fibo f0 = new Fibo();
		Fibo f1 = new Fibo();
		fibo[0] = f0;
		fibo[1] = f1;
		fibo[0].set0(0, 1);
		fibo[0].set1(0, 0);
		fibo[1].set0(0, 0);
		fibo[1].set1(0, 1);	
		
		for(int i=2; i<41; i++) {
			Fibo f = new Fibo();
			fibo[i] = f;
			fibo[i].set0(fibo[i-1].get0(), fibo[i-2].get0());
			fibo[i].set1(fibo[i-1].get1(), fibo[i-2].get1());
		}
		
		for(int i=0; i<T; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(fibo[n].get0() + " " + fibo[n].get1());
		}	
	}
}

class Fibo{
	
	private long num0;
	private long num1;
	
	public Fibo() {
	}
	
	public void set0(long a, long b) {
		this.num0 = a + b;
	}
	
	public void set1(long a, long b) {
		this.num1 = a + b;
	}
	
	public long get0() {
		return this.num0;
	}
	
	public long get1() {
		return this.num1;
	}
}
