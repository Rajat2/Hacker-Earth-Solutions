package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChanduAndHisInterns {
	static boolean NumberOfDivisor(int num){
		int count=0;
		for(int i=1;i*i<num;i++){
			if(num%i==0)
				count+=2;
			if(count>=4)
				return true;
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	int N = Integer.parseInt(br.readLine());
        	if(NumberOfDivisor(N))
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
	}
}
