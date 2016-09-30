import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PowersEverywhere {
	
	static int findNearest(int N){
		int ans=0;
		for(int i=0;i<a.length;i++){
			if(a[i]>N)
				break;
			else
				ans = a[i];
		}
		return ans;
	}
	static boolean isPower(int n)
	{
	    // Base case
	    if (n <= 1) return true;
	 
	    // Try all numbers from 2 to sqrt(n) as base
	    for (int x=2; x<=Math.sqrt(n); x++)
	    {
	        int  p = x;
	 
	        // Keep multiplying p with x while is smaller
	        // than or equal to x
	        while (p <= n)
	        {
	            p *= x;
	            if (p == n)
	                return true;
	        }
	    }
	    return false;
	}
	static int a[] = new int[100000];
	static void getDone(){
		int j=0;
		for (int i =2; i<1000000000; i++)
	        if (isPower(i))
	        	a[j++] = i;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		getDone();
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int Q = Integer.parseInt(br.readLine());
			while(Q-->0){
				int N = Integer.parseInt(br.readLine());
				long ans =  findNearest(N);
				System.out.println(ans);
				sb.append(Math.abs(N-ans)+"\n");
			}
			System.out.println(sb);
		}
	}
}
