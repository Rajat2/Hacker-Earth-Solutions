package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheConfusedMonk {
	static long gcd(long x, long y)
	{ 
		long r;
	    if (x <= 0 || y <= 0)
	        return(0);
	    while ((r = x % y) != 0){
	        x = y;
	        y = r;
	    }
	    return(y);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        	String s[] = br.readLine().split(" ");
        	long g=Long.parseLong(s[0]);
        	long multi = g;
        	long quo = 1000000007L;
        	for(int i=1;i<T;i++){
        		g = gcd(g, Long.parseLong(s[i]));
        		multi *=Long.parseLong(s[i]);
        		multi %=quo;
        	}
        	long ans = (long) ((long)Math.pow(multi, g)%quo);
        	System.out.println(ans);
        }
	
}
