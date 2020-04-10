import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj11650_Collections2 {

	public static void main(String[] args) throws Exception{
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
		
		Collections.sort(arr, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.getX() < p2.getX()) {
                    return -1;
                } else if (p1.getX() == p2.getX()) {
                    if(p1.getY() < p2.getY())
                    	return -1;
                    else
                    	return 1;
                }
                else
                	return 1;
            }
        });

		for(int i=0; i<n; i++) {
			System.out.println(arr.get(i).getX() + " " + arr.get(i).getY());
		}

	}

}

//class Point {
//	private int x;
//	private int y;
//	
//	public Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//	
//	
//	public int getX() {
//		return this.x;
//	}
//	
//	public int getY() {
//		return this.y;
//	}
//}
