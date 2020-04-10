import java.util.Scanner;

public class boj2798 {
	

	public static void main(String[] args) {
		int n, m;
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		int[] card = new int[m];
		for(int i=0; i<n; i++)
			card[i] = scan.nextInt();
		
		int max = 0;
		for(int i=0; i<n-2; i++)
			for(int k=i+1; k<n-1; k++)
				for(int j=k+1; j<n; j++) {
					int sum = card[i] + card[k] + card[j];
					if(sum <= m)
						max = Math.max(sum, max);
				}
		System.out.println(max);
	}

}
