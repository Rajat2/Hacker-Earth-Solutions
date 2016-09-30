package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArjitAndPrintingPress {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        while(T-->0){
	        char a[] = br.readLine().toCharArray();
	        char b[] = br.readLine().toCharArray();
	        Arrays.sort(b);
	        for(int i=0,j=0;i<a.length;i++){
	        	if(j>=b.length){
	        		break;
	        	}
	        	if(a[i]>b[j]){
	        		a[i] = b[j];
	        		j++;
	        	}
	        }
	        System.out.println(a);
        }
	}
}
