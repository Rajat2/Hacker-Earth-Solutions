import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Tournament {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		HashMap<String, Integer> hash= new HashMap<>();
		int max=0;
		while(T-->0){
			String name[] = br.readLine().split(" ");
			String name1 = name[0];
			String name2 = name[1];
			int count = hash.get(name1)==null?0:hash.get(name1);
			count++;
			if(count>max)
				max=count;
			hash.put(name1, count);
			count = hash.get(name2)==null?0:hash.get(name2);
			count++;
			if(count>max)
				max=count;
			hash.put(name2, count);
		}
		ArrayList<String> al = new ArrayList<String>();
		for(String name:hash.keySet()){
			if(hash.get(name)==max){
				al.add(name);
			}
		}
		Collections.sort(al);
		System.out.println(al.size());
		for(String name: al)
			System.out.println(name);
	}

}

