import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj1920 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n, m;
		
		n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		m = Integer.parseInt(br.readLine());
		int compare;
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			compare = Integer.parseInt(st.nextToken());
			
//			if(Arrays.binarySearch(arr, compare[i]) >= 0)
//				System.out.println(1);
//			else
//				System.out.println(0);
			int right = n-1;
			int left = 0;
			int mid;
			int flag = 0;
			
			while(left<=right) {
				mid = (left+right)/2;
				
				if(arr[mid] == compare) {
					flag = 1;
					break;
				}
				else if(arr[mid] > compare)
					right = mid -1;
				else
					left = mid + 1;
			}
			System.out.println(flag);
		}
	}

}
