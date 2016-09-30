package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeChange {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	int N = Integer.parseInt(br.readLine());
        	if(N==1)
        		System.out.println(1);
        	else{
        		long ans = (long)N*N*N - (long)(N-2)*(N-2)*(N-2);
        		System.out.println(ans);
        	}
        }
	}
}
