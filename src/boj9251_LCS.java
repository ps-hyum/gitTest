import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj9251_LCS {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int row = str1.length();
		int col = str2.length();
		
		int[][] dp = new int[row+1][col+1];
		for(int i=0; i<=row; i++)
			dp[i][0] = 0;
		for(int i=0; i<=col; i++)
			dp[0][i] = 0;
		
		
		for(int i=0; i<row; i++) {
			
			for(int j=0; j<col; j++) {
				
				if(str1.charAt(i) == str2.charAt(j)) {
					dp[i+1][j+1] = dp[i][j] + 1;
				}
				else {
					dp[i+1][j+1] = Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		
		System.out.println(dp[row][col]);

	}

}
