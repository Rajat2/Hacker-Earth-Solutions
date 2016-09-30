package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AllVowels {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		char s[]=br.readLine().toLowerCase().toCharArray();
		boolean a=false,e=false,i=false,o=false,u=false;
		for(int j=0;j<T;j++){
			if(s[j]=='a')a=true;
			else if(s[j]=='e')e=true;
			else if(s[j]=='i')i=true;
			else if(s[j]=='o')o=true;
			else if(s[j]=='u')u=true;
		}
		if(a & e & i & o & u)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
