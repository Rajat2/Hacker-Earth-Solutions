package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LittleJhoolAndHisAddiction {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T= Integer.parseInt(br.readLine());
	    	while(T-->0){
	    		String NK[] = br.readLine().split(" ");
	    		int N = Integer.parseInt(NK[0]);
	    		int K = Integer.parseInt(NK[1]);
	    		int a[] = new int[N];
	    		String s[] = br.readLine().split(" ");
	    		for(int i=0;i<N;i++)
	    			a[i] = Integer.parseInt(s[i]);
	    		Arrays.sort(a);
	    		int max = 0, min=Integer.MAX_VALUE;
	    		for(int i=0,j=a.length-1;i<a.length/2 ;i++,j--){
	    			int temp = a[j]+a[i];
	    			if(temp>max)
	    				max = temp;
	    			if(temp<min)
	    				min = temp;
	    		}
	    		/*System.out.println(Arrays.toString(a));
	    		System.out.println(max+"---"+min);
	    		*/System.out.println(max-min);
	    		if(max-min == K)
	    			System.out.println("Lucky chap!");
	    		else if(max-min>K)
	    			System.out.println("No more girlfriends!");
	    		else
	    			System.out.println("Chick magnet Jhool!");
	    	}
		}
}
