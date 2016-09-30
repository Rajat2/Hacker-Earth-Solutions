import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;


public class MonksBirthdayParty {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			int N = Integer.parseInt(br.readLine());
			SortedSet<String> set = new TreeSet<String>();
			while(N-->0)
				set.add(br.readLine());
			for(String temp:set)
				System.out.println(temp);
			}
	}

}
