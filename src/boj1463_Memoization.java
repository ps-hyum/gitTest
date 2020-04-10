import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj1463_Memoization {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] memory = new int[n+1];
		memory[1] = 0;
		if(n>=2)
			memory[2] = 1;
		if(n>=3)
			memory[3] = 1;
		
		for(int i=4; i<=n; i++) {
			int val;
			if(i%3 == 0) {
				val = memory[i/3];
				if(i%2 == 0) {
					val = Math.min(val, memory[i/2]);
					val = Math.min(val, memory[i-1]);
				}
				else {
					val = Math.min(val, memory[i-1]);
				}
			}
			else {
				val = memory[i-1];
				if(i%2 == 0) {
					val = Math.min(val, memory[i/2]);
				}
			}
			memory[i] = val+1;
		}
		
		System.out.println(memory[n]);
	}

}
