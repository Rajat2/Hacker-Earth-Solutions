package Arrays;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class TutorialOn1D {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer a[] = new Integer[N];
		int i=0;
		while(N-->0){
			a[i++]= Integer.parseInt(br.readLine());
		}
		/*System.out.println(Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());*/
		for(int j=a.length-1;j>=0;j--)
			System.out.println(a[j]);
	}
}
