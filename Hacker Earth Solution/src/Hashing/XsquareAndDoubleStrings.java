package Hashing;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class XsquareAndDoubleStrings {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			char s[]=br.readLine().toLowerCase().trim().toCharArray();
			int a[] = new int[26];
			for(int i=0;i<s.length;i++)
				a[s[i]-97]++;
			boolean flag=true;
			for(int i=0;i<a.length;i++)
				if(a[i]>1){
					System.out.println("Yes");
					flag = false;
					break;
				}
			if(flag)
				System.out.println("No");
		}
	}
}