package NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheMagicalShop {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        long a = Long.parseLong(s[0]);
        long mod = Long.parseLong(s[1]);
        char str[] = br.readLine().toCharArray();
        long ans=0;
        for(int i=0;i<str.length;i++){
        	if(str[i]=='1'){
        		ans =(long) ans+a;
            	ans = (long)ans % mod;
        	}
        	a *= a;
        	a %= mod;
        }
        System.out.println(ans);
	}
}