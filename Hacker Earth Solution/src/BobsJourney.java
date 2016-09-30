import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class BobsJourney {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			HashMap<Character,String> hash= new HashMap<>();
			
			boolean flag = false;
			while(N-->0){
				String city = br.readLine();
				char c = city.charAt(0);
				if(hash.get(c)==null)
					hash.put(c,city);
				else
					flag=true;
			}
			if(flag)
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
