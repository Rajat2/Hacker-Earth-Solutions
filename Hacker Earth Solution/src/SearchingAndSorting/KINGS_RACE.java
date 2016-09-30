package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KINGS_RACE {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String t[] = br.readLine().split(" ");
        	int N = Integer.parseInt(t[0]);
        	int K = Integer.parseInt(t[1]);
        	int a[] = new int[N];
        	int b[] = new int[K];
        	String t1[] = br.readLine().split(" ");
        	for(int i=0;i<N;i++)
        		a[i] = Integer.parseInt(t1[i]);
        	String t2[] = br.readLine().split(" ");
        	for(int i=0;i<K;i++)
        		b[i] = Integer.parseInt(t2[i]);
        	Arrays.sort(b);
        	int final_ans=-1,ans=0;
        	for(int i=0;i<N;i++){
        		int max=-1;
        		for(int j=0;j<K;j++){
        			if(a[i]>=b[j])
        				max++;
        			if(final_ans<max){
        				final_ans = max;
        				ans = i;
        			}
        		}
        	}
        	//System.out.println(Arrays.toString(a));
        	//System.out.println(Arrays.toString(b));
        	System.out.println(ans);
        }
	}
}
