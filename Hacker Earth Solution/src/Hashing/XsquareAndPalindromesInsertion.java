package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class XsquareAndPalindromesInsertion {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			char s[] = br.readLine().toCharArray();
			int a[] = new int[26];
			for(int i=0;i<s.length;i++){
				a[s[i]-'a']++;
			}
			boolean flag= true;
			int count=0;
			for(int i=0;i<a.length;i++){
				if(a[i]%2==1 && flag)
					flag=false;
				else if(a[i]%2!=0)
					count+= a[i]%2;
			}
			System.out.println(count);
		}
	}

}
