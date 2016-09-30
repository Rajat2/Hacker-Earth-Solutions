package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MonkAndHisFriends {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			HashMap<Long, Integer> map = new HashMap<>();
			String t[] = br.readLine().split(" ");
			int N = Integer.parseInt(t[0]);
			int M = Integer.parseInt(t[1]);
			String t1[] = br.readLine().split(" ");
			for(int i=0;i<N;i++){
				map.put(Long.parseLong(t1[i]), 1);
			}
			System.out.println("N=="+N+"-----M=="+M);
			for(int i=N;i<N+M;i++){
				long key = Long.parseLong(t1[i]);
				System.out.println(key);
				if(map.get(key)==null){
					System.out.println("NO");
					map.put(key, 1);
				}
				else
					System.out.println("YES");
			}
		}
	}

}
