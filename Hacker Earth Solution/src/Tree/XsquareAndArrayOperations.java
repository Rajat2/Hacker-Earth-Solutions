package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class XsquareAndArrayOperations {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt( br.readLine());
        while (t>0){
        	int n = Integer.parseInt( br.readLine());
        	int a[] = new int[n];
        	String temp[]=br.readLine().split(" ");
        	for(int i=0;i<n;i++)
        		a[i]=Integer.parseInt((temp[i]));
        	int count=0;
        	for(int i=1;i<n;i++){
        		count+= Math.max(a[i], a[i-1]);
        	}
        	System.out.println(count);
        	--t;
        }

	}

}
