package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AkashAndTheAssignment {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int Q = Integer.parseInt(temp[1]);
		String s = br.readLine();
		while(Q-->0){
			String q[] = br.readLine().split(" ");
			int L = Integer.parseInt(q[0])-1;
			int R = Integer.parseInt(q[1]);
			int K = Integer.parseInt(q[2]);
			int hash[] = new int[26];
			if(K>R-L+1){
				System.out.println("Out of range");
				continue;
				}
			for(int i=L;i<R;i++)
				hash[s.charAt(i)-'a']++;
			boolean flag=true;
			for(int i=0;i<26;i++){
				K = K-hash[i];
				if(K<=0){
					System.out.println((char)('a'+i));
					flag= false;
					break;
				}
			}
			if(flag)
			System.out.println("Out of range");
		}
	}
}
