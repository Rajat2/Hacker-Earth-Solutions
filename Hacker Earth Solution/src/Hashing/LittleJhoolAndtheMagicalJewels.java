package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LittleJhoolAndtheMagicalJewels {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			char s[]=br.readLine().toLowerCase().toCharArray();
			int R=0,U=0,B=0,Y=0;
			for(int i=0;i<s.length;i++){
				if(s[i]=='r')R++;
				else if(s[i]=='u')U++;
				else if(s[i]=='b')B++;
				else if(s[i]=='y')Y++;
			}
			System.out.println(Math.min(Math.min(R, U),Math.min(B, Y)));
		}
	}
}
