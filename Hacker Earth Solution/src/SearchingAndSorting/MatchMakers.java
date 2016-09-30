package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class MatchMakers {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	int N = Integer.parseInt(br.readLine());
            String t1[] = br.readLine().split(" ");
            String t2[] = br.readLine().split(" ");
            Integer g[] = new Integer[N];
            Integer b[] = new Integer[N];
            for(int i=0;i<N;i++){
            	g[i] = Integer.parseInt(t1[i]);
            	b[i] = Integer.parseInt(t2[i]);
            }
            Arrays.sort(g, Collections.reverseOrder());
            Arrays.sort(b);
            int ans=0;
            for(int i=0;i<N;i++){
            	if(g[i]%b[i]==0 || b[i]%g[i]==0)
            		ans++;
            }
            System.out.println(ans);
        }
	}
}
