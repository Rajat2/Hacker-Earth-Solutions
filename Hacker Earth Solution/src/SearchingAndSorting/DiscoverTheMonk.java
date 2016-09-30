package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DiscoverTheMonk {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String t1[] = br.readLine().split(" ");
    	int N = Integer.parseInt(t1[0]);
    	int Q = Integer.parseInt(t1[1]);
    	String s[] = br.readLine().split(" ");
    	int a[] = new int[N];
    	HashMap<Integer, Boolean> map = new HashMap<>();
    	for(int i=0;i<N;i++)
    		map.put(Integer.parseInt(s[i]),true);
    	while(Q-->0){
    		int temp = Integer.parseInt(br.readLine());
    		System.out.println(map.get(temp)==null?"NO":"YES");
    	}
	}
}
