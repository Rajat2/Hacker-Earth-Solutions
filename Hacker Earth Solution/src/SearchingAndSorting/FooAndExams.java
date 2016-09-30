package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FooAndExams {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String t[] = br.readLine().split(" " );
        	long a = Long.parseLong(t[0]);
        	long b = Long.parseLong(t[1]);
        	long c = Long.parseLong(t[2]);
        	long d = Long.parseLong(t[3]);
        	long k = Long.parseLong(t[4]);
        	long ans=0;
        	for(long i=1;i<=10000000000000L;i++){
        		long temp =(long)( (long)a*(long)(i*i*i)+(long)b*(long)(i*i)+(long)c*(i)+d);
        		if(temp>=k){
        			ans = i;
        			break;
        		}
        	}
        	System.out.println(ans-1);
        }
	}

}
