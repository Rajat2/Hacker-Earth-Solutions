import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class AnagramsRevisited {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Integer> hash= new HashMap<>();
		int N = Integer.parseInt(br.readLine());
		int max=0;
		//String ans="";
		while(N-->0){
			char temp[] = br.readLine().toCharArray();
			Arrays.sort(temp);
			String x = new String(temp);
			int count = hash.get(x)==null?0:hash.get(x);
			count++;
			hash.put(x, count);
			if(count>max){
				max = count;
				//ans = x;
			}
		}
		System.out.println(max);
	}
}
