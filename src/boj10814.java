import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class boj10814 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Profile> dic = new ArrayList<Profile>(n);
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			dic.add(new Profile(i, age, name));
		}
		Collections.sort(dic, new Comparator<Profile>(){
			@Override
			public int compare(Profile p1, Profile p2) {
				if(p1.getAge() < p2.getAge())
					return -1;
				else if(p1.getAge() == p2.getAge()) {
					return p1.getIdx() < p2.getIdx() ? -1 : 1;
				}
				else
					return 1;
			}
			
		});
		
		for(int i=0; i<n; i++)
			System.out.println(dic.get(i).getAge() + " " + dic.get(i).getName());
		
	}

}

class Profile{
	private int idx;
	private int age;
	private String name;
	
	public Profile(int idx, int age, String name) {
		this.idx = idx;
		this.age = age;
		this.name = name;
	}
	
	public int getIdx() {
		return this.idx;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String getName() {
		return this.name;
	}
}