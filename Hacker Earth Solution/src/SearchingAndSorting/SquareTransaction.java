package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SquareTransaction {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String t1[] = br.readLine().split(" ");
        int a[] = new int[T];
        int sum[] = new int[T];
        a[0] = sum[0] = Integer.parseInt(t1[0]);
        for(int i=1;i<T;i++){
        	a[i] = Integer.parseInt(t1[i]);
        	sum[i] = sum[i-1]+a[i];
        }
        //System.out.println(Arrays.toString(sum));
        int Q = Integer.parseInt(br.readLine());
        while(Q-->0){
        	int q = Integer.parseInt(br.readLine());
        	boolean flag=true;
        	for(int i=0;i<T;i++){
        		if(sum[i]>=q){
        			System.out.println(i+1);
        			flag=false;
        			break;
        		}
        	}
        	if(flag)
        		System.out.println(-1);
        	//search(sum, q, 0, sum.length);
        }
	}
}
