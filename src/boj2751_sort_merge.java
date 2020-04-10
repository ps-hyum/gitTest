import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2751_sort_merge {
	
	private int n;
	private int[] arr;
	private int[] sorted;
	private int i;
	
	public boj2751_sort_merge(int n) {
		this.n = n;
		arr = new int[n];
		sorted = new int[n];
		this.i = 0;
	}
	
	public void add_data(int data) {
		arr[i++] = data;
	}

	
	public void merge(int left, int mid, int right) {
		int i = left;
		int j = mid + 1;
		int k = left;
		
		while((i<=mid) && (j<=right)) {
			if(arr[i] > arr[j]) {
				sorted[k++] = arr[j++];
			} else {
				sorted[k++] = arr[i++];
			}
		}
		
		if (i > mid) {
			for (int l = j; l <= right; l++) {
				sorted[k++] = arr[l];
			}
		} else {
			for (int l = i; l <= mid; l++) {
				sorted[k++] = arr[l];
			}
		}
		
		for(i = left; i<=right; i++) {
			arr[i] = sorted[i];
		}
	}
	
	public void merge_sort(int left, int right) {
		int mid = (left+right)/2;
		
		if (left < right) {
			merge_sort(left, mid);
			merge_sort(mid + 1, right);
			merge(left, mid, right);
		}
	}
	
	public void print() {
		for(int i=0; i<n; i++)
			System.out.println(arr[i]);
	}

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int	n = Integer.parseInt(br.readLine());
		boj2751_sort_merge sm = new boj2751_sort_merge(n);
		for(int i=0; i<n; i++) {
			int m = Integer.parseInt(br.readLine());
			sm.add_data(m);
		}
		sm.merge_sort(0, n-1);
		sm.print();
	}

}
