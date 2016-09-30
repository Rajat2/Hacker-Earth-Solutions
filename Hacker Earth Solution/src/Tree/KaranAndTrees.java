package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KaranAndTrees {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String temp[] = br.readLine().split(" ");
        	int a = Integer.parseInt(temp[0]);
        	int b = Integer.parseInt(temp[1]);
        	while(a!=b){
        		if(a>b)
        			a = a/2;
        		else if(b>a)
        			b= b/2;
        	}
        	System.out.println(a);
        }
	}
}
