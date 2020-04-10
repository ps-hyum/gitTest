import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

public class boj11053 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] data = new int[n];
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<n; i++) {
			data[i] = Integer.parseInt(st.nextToken());
		}
		
		dp1[0] = 1;
		for(int i=1; i<n; i++) {
			int last = data[i];
			dp1[i] = 1;
			for(int j=0; j<i; j++) {
				if(last > data[j]) {
					dp1[i] = Math.max(dp1[i], dp1[j]+1);
				}
			}
		}
		
		dp2[n-1] = 1;
		for(int i=n-2; i>=0; i--) {
			int last = data[i];
			dp2[i] = 1;
			for(int j=n-1; j>i; j--) {
				if(last > data[j]) {
					dp2[i] = Math.max(dp2[i], dp2[j]+1);
				}
			}
		}
		
		int max = 0;
		for(int i=0; i<n; i++)
			max = Math.max(dp1[i]+dp2[i], max);
		
		System.out.println(max-1);
	}

}
