package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThelegendOfTanmay {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        while(T-->0){
        	int N = Integer.parseInt(br.readLine());
        	int a[] = new int[N];
        	String s[] = br.readLine().split(" ");
        	for(int i=0;i<N;i++)
        		a[i] = Integer.parseInt(s[i]);
        	
        		int n = a.length;
                int max_ending_here = 1;
                int min_ending_here = 1;
                int max_so_far = 1;
                int minPro = a[0];
                boolean flag= false;
                for (int i = 0; i < n; i++)
                {
                    /* If this element is positive, update max_ending_here.
                        Update min_ending_here only if min_ending_here is
                        negative */
                    if (a[i] > 0)
                    {
                        max_ending_here = max_ending_here*a[i];
                        min_ending_here = Math.min (min_ending_here * a[i], 1);
                    }
         
                    /* If this element is 0, then the maximum product cannot
                       end here, make both max_ending_here and min_ending
                      _here 0
                       Assumption: Output is alway greater than or equal to 1. */
                    else if (a[i] == 0)
                    {
                        max_ending_here = 1;
                        min_ending_here = 1;
                    }
         
                    /* If element is negative. This is tricky
                       max_ending_here can either be 1 or positive.
                       min_ending_here can either be 1 or negative.
                       next min_ending_here will always be prev.
                       max_ending_here * arr[i]
                       next max_ending_here will be 1 if prev
                       min_ending_here is 1, otherwise
                       next max_ending_here will be 
                                   prev min_ending_here * arr[i] */
                    else
                    {
                        int temp = max_ending_here;
                        max_ending_here = Math.max (min_ending_here * a[i], 1);
                        min_ending_here = temp * a[i];
                    }
         
                    // update max_so_far, if needed
                    if (max_so_far <  max_ending_here)
                        max_so_far  =  max_ending_here;
                    if(minPro>minPro*a[i] && a[i]!=0)
            			minPro = minPro*a[i];
            		if(a[i]==0)
            			flag=true;
                }
                if(flag==true && minPro>0)
            		minPro = 0;
        	System.out.println(max_so_far+" "+minPro);
        }
	}
}
