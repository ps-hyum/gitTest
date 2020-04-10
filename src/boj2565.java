import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj2565 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n];
		ArrayList<eLine> pole = new ArrayList<eLine>(n);
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int na = Integer.parseInt(st.nextToken());
			int nb = Integer.parseInt(st.nextToken());
			pole.add(new eLine(na, nb));
		}
		Collections.sort(pole);
		
		int max = 0;
	for(int i=0; i<n; i++) {
		dp[i] = 1;
		for(int j=0; j<i; j++) {
			if(pole.get(i).getB() > pole.get(j).getB())
				dp[i] = Math.max(dp[i], dp[j]+1);
		}
		max = Math.max(max, dp[i]);
	}
	System.out.println(n-max);
		
	}

}

class eLine implements Comparable<eLine>{
	private int na;
	private int nb;
	
	public eLine(int na, int nb) {
		this.na = na;
		this.nb = nb;
	}
	
	@Override
	public int compareTo(eLine e) {
		return this.na < e.na ? -1 : 1;
	}
	
	public int getA() {
		return this.na;
	}
	public int getB() {
		return this.nb;
	}
}
