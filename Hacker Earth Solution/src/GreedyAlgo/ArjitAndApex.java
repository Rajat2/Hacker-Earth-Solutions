package GreedyAlgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class ArjitAndApex {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        while(T-->0){
        	String MN[] = br.readLine().split(" ");
        	int M= Integer.parseInt(MN[0]);
        	int N= Integer.parseInt(MN[1]);
        	Integer a[][] = new Integer[M][2];
        	Integer b[][] = new Integer[N][2];
        	for(int i=0;i<M;i++){
        		String UV[] = br.readLine().split(" ");
        		a[i][0] = Integer.parseInt(UV[0]);
        		a[i][1] = Integer.parseInt(UV[1]);
        	}
        	for(int i=0;i<N;i++){
        		String UV[] = br.readLine().split(" ");
        		b[i][0] = Integer.parseInt(UV[0]);
        		b[i][1] = Integer.parseInt(UV[1]);
        	}
        	Arrays.sort(a, new Comparator<Integer[]>() {

				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
						if(o1[0]==o2[0])
							return o1[1].compareTo(o2[1]);
					return o1[0].compareTo(o2[0]);
				}
			});	
        	Arrays.sort(b, new Comparator<Integer[]>() {

				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					// TODO Auto-generated method stub
						if(o1[0]==o2[0])
							return o1[1].compareTo(o2[1]);
					return o1[0].compareTo(o2[0]);
				}
			});
        	/*for(int i=0;i<a.length;i++){
        	System.out.println(Arrays.toString(a[i]));
        	System.out.println(Arrays.toString(b[i]));
        	}*/
        	int c1=0,c2=0;
        	for(int i=0;i<a.length && i<b.length;i++){
        		if(a[i][0]==b[i][0] && a[i][1]==b[i][1])
        			c2++;
        		if(a[i][0]==b[i][0])
        			c1++;
        	}
        	//System.out.println(c1+"---"+c2);
        	String UV[] = br.readLine().split(" ");
    		int G = Integer.parseInt(UV[0]);
    		int H = Integer.parseInt(UV[1]);
    		if(c1==G && c2==H)
    			System.out.println("Great");
    		else if(c1==G)
    			System.out.println("Good");
    		else
    			System.out.println(":(");
        }
	}
}
