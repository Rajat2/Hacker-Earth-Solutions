package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class BOBAnIdiot {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		LinkedHashMap<Character, Character> hash = new LinkedHashMap<>();
		char arr[][] = new char[N][2];
		for(int i=0;i<N;i++){
			char temp[] = br.readLine().trim().toCharArray();
			char a = temp[0];
			char b = temp[2];
			hash.put(a, b);
			hash.put(b, a);
		}
		char str[] = br.readLine().trim().toCharArray();
		for(int j=0;j<N;j++){
			if(hash.get(str[j])!=null)
				str[j] = hash.get(str[j]);
		}
		for(char c:str)
			System.out.print(c);
	}
}
