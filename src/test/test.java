package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n = 3;
		int b = 2;
		
		n = Math.min(n, b);
		
		System.out.println(Math.min(n, b));
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
		else 
			return 1;
	}
	
	public String getWord() {
		return this.word;
	}
}
