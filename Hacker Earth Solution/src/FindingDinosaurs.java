import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;


public class FindingDinosaurs {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t[] = br.readLine().trim().split(" ");
		int N = Integer.parseInt(t[0]);
		int K = Integer.parseInt(t[1]);
		int L = Integer.parseInt(t[2]);
		int Q = Integer.parseInt(t[3]);
		HashMap<String,String> hash = new HashMap<>();
		while(N-->0){
			String d[] = br.readLine().trim().split(" ");
			String temp="";
			for(int i=0;i<K;i++)
				temp  += d[i+1]+" ";
			hash.put(temp.trim(),d[0]);
		}
		while(Q-->0){
			String temp = br.readLine().trim();
			if(hash.get(temp)!=null)
				System.out.println(hash.get(temp));
			else
				System.out.println("You cant fool me :P");
			}
			
		}	
}

