package LendingKart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThePassword {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if(1+1+1==3)
			System.out.println("TRUE");
		else
			System.out.println("");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T= Integer.parseInt(br.readLine());
        while(T-->0){
        	String sp[] = br.readLine().split(" ");
        	String s = sp[0];
        	String p = sp[1];
        	char s1[] = s.toCharArray();
        	char p1[] = p.toCharArray();
        	int a[] = new int[257];
        	int b[] = new int[257];
        	boolean flag = false;
        	if(2*s.length()==p.length()){
        		for(int i=0;i<s1.length;i++)
        			a[s1[i]]++;
        		for(int i=0;i<p1.length;i++)
        			b[p1[i]]++;
        		for(int i=0;i<=256;i++){
        			if(a[i]>=1 || b[i]>=1){
        				if(2*a[i]!=b[i]){
        					flag = true;
        					break;
        				}
        			}
        		}
        		if(flag){
        			System.out.println("Impossible");
        		}
        		else{
        			System.out.println("Possible");
        		}
        	}
        	else
        		System.out.println("Impossible");
        }
	}

}
