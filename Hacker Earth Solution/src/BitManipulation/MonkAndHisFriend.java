package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MonkAndHisFriend {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T= Integer.parseInt(br.readLine());
	    	while(T-->0){
	    		String NK[] = br.readLine().split(" ");
	    		long N = Long.parseLong(NK[0]);
	    		long K = Long.parseLong(NK[1]);
	    		char a[] = String.format("%64s", Long.toBinaryString(N)).replace(' ', '0').toCharArray();
	    		char b[] = String.format("%64s", Long.toBinaryString(K)).replace(' ', '0').toCharArray();
	    		//System.out.println(Arrays.toString(a));
	    		//System.out.println(Arrays.toString(b));
	    		long count=0;
	    		for(int i=0;i<a.length;i++)
	    			if(a[i]!=b[i])
	    				count++;
	    		System.out.println(count);
	    	}
	}
}
