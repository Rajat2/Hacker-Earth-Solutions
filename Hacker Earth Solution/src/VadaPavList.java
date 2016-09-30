import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;


public class VadaPavList {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		SortedSet<String> set = new TreeSet<String>();
		while(N-->0){
			set.add(br.readLine());
		}
		System.out.println(set.size());
		for(String temp:set)
			System.out.println(temp);
	}
}
