package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Speed {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			int a[] = new int[N];
			String t[] = br.readLine().split(" ");
			for(int i=0;i<N;i++)
				a[i] = Integer.parseInt(t[i]);
			int last = a[0],count=1;
			for(int i=1;i<N;i++){
				if(last>=a[i])
					count++;
				last = Math.min(last, a[i]);
			}
			System.out.println(count);
		}
	}
}
