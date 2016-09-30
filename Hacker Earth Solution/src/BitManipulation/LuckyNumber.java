package BitManipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LuckyNumber {
	public static void main(String args[])throws Exception
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		StringBuffer out = new StringBuffer();
		long t = Integer.parseInt(br.readLine());
		while(t-->0){
			long n = Long.parseLong(br.readLine());
			
			long sum=0;
			long i=2;
			final int mod = 1000000007;
			while(i<=n){
				long k=1;
				while(k<i){
					if(i+k<=n)
						sum = ((sum%mod)+(i+k)%mod)%mod;
					else
						break;			
					k*=2;
				}
				i*=2;
			}
			out.append("\n"+sum);
			t--;
		}
			System.out.print(out);
	}
}