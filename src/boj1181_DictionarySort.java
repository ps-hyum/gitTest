import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class boj1181_DictionarySort {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		ArrayList<Word> arr = new ArrayList<Word>(n);
		for(int i=0; i<n; i++) {
			arr.add(new Word(br.readLine()));
		}
		Collections.sort(arr);
		for(int i=0; i<n; i++) {
			if(i>0) {
				if(arr.get(i).getWord().equals(arr.get(i-1).getWord()))
					continue;
				
			}
			System.out.println(arr.get(i).getWord());
				
		}
	}

}

class Word implements Comparable<Word>{
	
	private String word;
	private int wlen;
	
	public Word(String w) {
		this.word = w;
		this.wlen = word.length();
	}
	
	@Override
	public int compareTo(Word d) {
		if(this.wlen < d.wlen)
			return -1;
		else if(this.wlen > d.wlen)
			return 1;
		else
			return this.getWord().compareTo(d.getWord());
	}
	
	public String getWord() {
		return this.word;
	}
}