package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BreakupApp {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count1=0,count2=0;
        int a[] = new int[30];
        int b[]  = new int[31];
        for(int i=0;i<30;i++)
        	a[i] = i+1;
        while(N-->0){
        	String s = br.readLine();
        	if(s.contains("G:"))
        		for(int i=0;i<30;i++){
        			if(s.contains(" "+a[i]+" ") || s.contains(" "+a[i]+"\n")){
        				System.out.println("G");
        				b[(int)a[i]] = (int)b[(int)a[i]]+2;
        				System.out.println(a[i]+"---"+b[(int)a[i]]);
        			}
            	}
        	else
        		for(int i=0;i<30;i++){
        			if(s.contains(" "+a[i]+"") ){
        				System.out.println("M");
        				b[(int)a[i]] = b[(int)a[i]]+1;
        				System.out.println(a[i]+"---"+b[(int)a[i]]);
        			}
            	}
        	
        }
        count1 = b[19];
        count2 = b[20];
        Arrays.sort(b);
        System.out.println(count1+"--"+count2);
        System.out.println(b[30]+"--"+b[29]);
        if(b[30]==count1 || b[30]==count2 )
        	System.out.println("Date");
        else
        	System.out.println("No Date");
	}
}
