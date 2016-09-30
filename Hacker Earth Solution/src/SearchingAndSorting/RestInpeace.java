package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RestInpeace {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(N-->0){
        	String s = br.readLine();
        	if(s.contains("21") || Integer.parseInt(s)%21==0)
        		System.out.println("The streak is broken!");
        	else
        		System.out.println("The streak lives still in our heart!");
        }
	}

}
