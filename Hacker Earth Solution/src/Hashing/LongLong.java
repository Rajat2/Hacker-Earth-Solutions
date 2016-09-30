package Hashing;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LongLong {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			int failure[] = new int[s.length()];
	        int n = s.length();
	        failure[0] = -1;
	        for (int j = 1; j < n; j++)
	        {
	            int i = failure[j - 1];
	            while ((s.charAt(j) != s.charAt(i + 1)) && i >= 0)
	                i = failure[i];
	            if (s.charAt(j) == s.charAt(i + 1))
	                failure[j] = i + 1;
	            else
	                failure[j] = -1;
	        }
	        System.out.println(Arrays.toString(failure));
	}
}
