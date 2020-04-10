import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj2751_sort_heap {
	
	private int n;
	private int[] arr;
	private int size;
	
	public boj2751_sort_heap(int n) {
		this.n = n;
		arr = new int[n+1];
		this.size = 0;
	}
	

	public void insert_min_heap(int data) {
		int now = ++size;
		
		while((now!=1) && data < arr[now/2]) {
			arr[now] = arr[now/2];
			now /= 2;
		}
		arr[now] = data;
	}
	
	public void swap(int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
	public void delete() {
		System.out.println(arr[1]);
		arr[1] = arr[size--];
		
		int now = 1;
		int child = now*2;
		
		while(now*2 <= size) {
			
			if(child+1 <= size)
				if(arr[child+1] < arr[child])
					child++;
			
			if(arr[now] > arr[child]) {
				swap(now, child);
				now = child;
				child = now*2;
			}
			else
				break;
		}
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boj2751_sort_heap bh = new boj2751_sort_heap(n);
		for(int i=0; i<n; i++) {
			int data = Integer.parseInt(br.readLine());
			bh.insert_min_heap(data);
		}
		for(int i=0; i<n; i++) {
			bh.delete();
		}
	}
	
	
	

}
