import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj2751_collection {
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> arr = new ArrayList<Integer>(n);
		for(int i=0; i<n; i++)
			arr.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(arr);
		
		for(int i=0; i<n; i++)
			System.out.println(arr.get(i));
		
	}

}
