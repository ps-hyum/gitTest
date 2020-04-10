import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class boj2565_2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] dp = new int[n+1];
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();
		
		int maxn = 1;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int na = Integer.parseInt(st.nextToken());
			int nb = Integer.parseInt(st.nextToken());
			tm.put(na, nb);
		}
		
		Set<Integer> set = tm.keySet();
		for(Integer i : set) {
			
		}
	}

}
