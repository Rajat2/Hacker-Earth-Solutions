package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BobAndString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			char s[]=br.readLine().toLowerCase().toCharArray();
			char t[] = br.readLine().toLowerCase().toCharArray();
			int a[] = new int[26];
			int b[] = new int[26];
			for(int i=0;i<s.length;i++)
				a[s[i]-97]++;
			for(int i=0;i<t.length;i++)
				b[t[i]-97]++;
			int ans=0;
			for(int i=0;i<a.length;i++){
				if(a[i]!=b[i])
					ans+= Math.abs(a[i]-b[i]);
			}
			System.out.println(ans);
		}
	}
}
