package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GottaCatch {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String temp[] = br.readLine().split(" ");
        int max=0;
        for(int i=0;i<T;i++){
        	int t = Integer.parseInt(temp[i]);
        	if(t>=max)
        		max =t; 
        }
        System.out.println(max+2);
	}
}
