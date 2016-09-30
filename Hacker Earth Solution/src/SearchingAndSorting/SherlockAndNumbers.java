package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SherlockAndNumbers {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String temp[] = br.readLine().split(" ");
        	int N = Integer.parseInt(temp[0]);
        	int K = Integer.parseInt(temp[1]);
        	int P = Integer.parseInt(temp[2]);
        	ArrayList<Integer> a = new ArrayList<>(100);
        	ArrayList<Integer> b = new ArrayList<>(100);
        	for(int i=1;i<=N;i++)
        		a.add(i);
        	String b1[] = br.readLine().split(" ");
        	for(int i=0;i<K;i++)
        		b.add(Integer.parseInt(b1[i]));
        	a.removeAll(b);
        	if(P-1>=a.size())
        		System.out.println(-1);
        	else
        		System.out.println(a.get(P-1));
        }
	}
}
