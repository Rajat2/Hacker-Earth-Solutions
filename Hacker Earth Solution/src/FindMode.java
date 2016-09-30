import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class FindMode {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			HashMap<Integer, Integer> hash= new HashMap<>();
			int max=0;
			int N = Integer.parseInt(br.readLine());
			String num[] = br.readLine().split(" ");
			for(int i=0;i<N;i++){
				int x = Integer.parseInt(num[i]);
				int count = hash.get(x)==null?0:hash.get(x);
				count++;
				hash.put(x, count);
				if(count>max)
					max=count;
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			for(Integer x:hash.keySet()){
				if(hash.get(x)==max){
					al.add(x);
				}
			}
			Collections.sort(al, Collections.reverseOrder());
			for(int x:al)
				System.out.print(x+" ");
		}
	}
}
