package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Cakes{
	Integer number;
	Integer count;
}

public class MonksChoiceOfNumbers {
	static int count(int n){
		int count=0;
		while(n>0){
			n&=(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        String temp[] = br.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int K = Integer.parseInt(temp[1]);
        String s[] = br.readLine().split(" ");
        Cakes a[] = new Cakes[N];
        for(int i=0;i<N;i++){
        	a[i] = new Cakes();
        	a[i].number = Integer.parseInt(s[i]);
        	a[i].count = count(Integer.parseInt(s[i]));
        }
        Arrays.sort(a, new Comparator<Cakes>() {
			@Override
			public int compare(Cakes o1, Cakes o2) {
				// TODO Auto-generated method stub
				return o2.count.compareTo(o1.count);
			}
		});
        long ans=0;
        for(int i=0;i<K;i++){
        	ans+= a[i].count;
        }
        System.out.println(ans);
	}
	}
}
