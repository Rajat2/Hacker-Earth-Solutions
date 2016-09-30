package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class ModifySequence {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		String temp[] = br.readLine().split(" ");
		for(int i =0;i<N;i++)
			a[i] = Integer.parseInt(temp[i]);
		//System.out.println(Arrays.toString(a));
		int last  = a[1]-a[0];
		boolean flag= true;
		for(int i=2;i<N;i++){
			if(last<0){
				flag = false;
				break;
			}
			last = last==0?a[i]:a[i]-last;			
		}
		if(last<0)
			flag = false;
		if(flag && last == 0)
			System.out.println("YES");
		else
			System.out.println("NO");
		//System.out.println(last);
	}
}
