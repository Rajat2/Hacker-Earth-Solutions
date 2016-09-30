package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Str{
	String key;
	String str;
}
public class XennyAndPartiallySortedStrings {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String temp[] = br.readLine().split(" ");
            int N = Integer.parseInt(temp[0]);
            int K = Integer.parseInt(temp[1]);
            int M = Integer.parseInt(temp[2]);
            Str a[] = new Str[N];
            for(int i=0;i<N;i++){
            	String s= br.readLine();
            	a[i] = new Str();
            	a[i].key = s.substring(0,M);
            	a[i].str = s;
            }
            Arrays.sort(a, new Comparator<Str>() {

				@Override
				public int compare(Str o1, Str o2) {
					// TODO Auto-generated method stub
					return o1.key.compareTo(o2.key);
				}
			});
            System.out.println(a[K-1].str);
        }
	}
}
