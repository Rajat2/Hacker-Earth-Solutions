import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class RoyAndCodeStreak {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			int max=0,size;
			HashMap<Integer, Integer> hash = new HashMap<>();
			HashMap<Integer, Integer> hash_all = new HashMap<>(N);
			while(N-->0){
				String temp[] = br.readLine().split(" ");
				int a = Integer.parseInt(temp[0]);
				int b = Integer.parseInt(temp[1]);
				if(b==0){
					size = hash.size();
					hash.clear();
				}
				else{
					if(hash_all.get(a)==null)
						hash.put(a, b);
					size = hash.size();
					hash_all.put(a, b);
				}
				if(size>max)
					max = size;
			}
			System.out.println(max);
		}
	}
}
