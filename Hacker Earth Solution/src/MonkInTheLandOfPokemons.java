import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class MonkInTheLandOfPokemons {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			HashMap<Integer,Integer> item = new HashMap(N);
			int count=0;
			while(N-->0){
				String temp[] = br.readLine().split(" ");
				int A = Integer.parseInt(temp[0]);
				int B = Integer.parseInt(temp[1]);
				if(A!=B){
					int val = item.get(A)==null?0:item.get(A);
					item.put(A, val+1);
					if(item.get(B)!=null){
						int X = item.get(B);
						if(X==1)
							item.remove(B);
						else
							item.put(B, X-1);
					}
					else
						count++;
				}
			}
			System.out.println(count);
		}
	}
}
