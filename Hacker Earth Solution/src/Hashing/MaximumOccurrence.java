package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaximumOccurrence {
	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int a[] = new int[256];
		for(int i=0;i<str.length();i++)
			a[str.charAt(i)]++;
		char ans1 = (char)0;
		int ans2 = a[0];
		for(int i=1;i<256;i++){
			if(a[i]>ans2){
				ans2 = a[i];
				ans1 = (char) i;
			}
		}
		System.out.println(ans1+" "+ans2);
	}
}
