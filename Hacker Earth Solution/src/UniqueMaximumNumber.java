import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class UniqueMaximumNumber {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> hash= new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		int max=-1;
		String num[] = br.readLine().split(" ");
		for(int i=0;i<N;i++){
			int x = Integer.parseInt(num[i]);
			int count = hash.get(x)==null?0:hash.get(x);
			count++;
			hash.put(x, count);
		}
		for(int x: hash.keySet()){
			if(hash.get(x)==1 && x>max)
				max = x;
		}
		System.out.println(max);
	}
}
