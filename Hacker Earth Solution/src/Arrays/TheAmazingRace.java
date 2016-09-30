package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheAmazingRace {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			int a[] = new int[N];
			int b[] = new int [N];
			String temp[] = br.readLine().split(" ");
			for(int i=0;i<N;i++)
				a[i] = Integer.parseInt(temp[i]);
		}
	}
}
