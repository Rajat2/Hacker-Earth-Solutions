import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HeadChefMonica {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] workers = br.readLine().toCharArray();
		HashMap<Character, Long> hash = new HashMap<>(6);
		int mod = 1000000007;
		for(int i=0;i<N;i++){
			char x = workers[i];
			long count = hash.get(x)==null?0:hash.get(x);
			count++;
			hash.put(x, count);
		}
		int M = Integer.parseInt(br.readLine());
		while(M-->0){
			char[] order = br.readLine().toCharArray();
			long ans=1;
			long count = hash.get(order[0])==null?0:hash.get(order[0]);
			long count1 = hash.get(order[1])==null?0:hash.get(order[1]);
			long count2 = hash.get(order[2])==null?0:hash.get(order[2]);
				if(count==0 || count1==0 || count2==0)
					ans=0;
				else{
					ans  = ((count%mod)*(count1%mod)*(count2%mod))%mod;
				count--;count1--;count2--;
				hash.put(order[0], count);
				hash.put(order[1], count1);
				hash.put(order[2], count2);
				}
			System.out.println(ans);
		}
	}
}
