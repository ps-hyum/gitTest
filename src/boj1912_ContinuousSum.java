import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class boj1912_ContinuousSum {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = arr[0];
		int max = dp[0];
		for(int i=1; i<n; i++) {
			dp[i] = Math.max(arr[i] + dp[i-1], arr[i]);
			max = Math.max(max, dp[i]);
		}
		
		
		System.out.println(max);

	}

}

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.StringTokenizer;
//
//public class boj1912_ContinuousSum {
//
//	public static void main(String[] args) throws IOException {
//		// TODO Auto-generated method stub
//		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int n = Integer.parseInt(br.readLine());
//		int[] arr = new int[n];
//		int[] sum = new int[n];
//		int[] dp = new int[n];
//		
//		//br.readLine();
//		StringTokenizer st = new StringTokenizer(br.readLine());
//		for(int i=0; i<n; i++) {
//			arr[i] = Integer.parseInt(st.nextToken());
//			if(i>0)
//				sum[i] = arr[i] + sum[i-1];
//			else
//				sum[i] = arr[i];
//		}
//		
//		int min = arr[0];
//		int max = arr[0];
//		dp[0] = arr[0];
//		for(int i=1; i<n; i++) {
//			if(arr[i] >= 0 ) {
//				dp[i] = Math.max(sum[i], arr[i]);
//				dp[i] = Math.max(dp[i], sum[i]-min);
//				dp[i] = Math.max(dp[i], max);
//				max = dp[i];
//			}
//			else {
//				dp[i] = Math.max(max, arr[i]);
//			}
//			min = Math.min(sum[i], min);
//		}
//		
//		
//		System.out.println(dp[n-1]);
//
//	}
//
//}

