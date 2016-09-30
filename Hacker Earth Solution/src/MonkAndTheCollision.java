import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class MonkAndTheCollision {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			String temp[] = br.readLine().split(" ");
			HashMap<Integer, Integer> hash= new HashMap<>();
			for(int i=0;i<N;i++){
				int x = Integer.parseInt(temp[i]);
				x = x%10;
				int count = hash.get(x)==null?-1:hash.get(x);
				hash.put(x, count+1);
			}
			int ans=0;
			for(int x:hash.keySet()){
				ans+=hash.get(x);
			}
			System.out.println(ans);
		}
	}
}
