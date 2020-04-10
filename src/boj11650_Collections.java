import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class boj11650_Collections {
	
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		ArrayList<Point> arr = new ArrayList<Point>(n);
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			Point p = new Point(x, y);
			arr.add(p);
		}
		Collections.sort(arr);
		for(int i=0; i<n; i++) {
			System.out.println(arr.get(i).getX() + " " + arr.get(i).getY());
		}
	}

}

class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point p) {
		if(this.x < p.x)
			return -1;
		else if(this.x == p.x)
			if(this.y < p.y)
				return -1;
			else
				return 1;
		else
			return 1;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
