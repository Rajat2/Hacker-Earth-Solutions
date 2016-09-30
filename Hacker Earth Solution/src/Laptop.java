import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;


public class Laptop {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		HashMap<String, Integer> hash= new HashMap<>();
		int max=0;
		while(T-->0){
			String name = br.readLine();
			int count = hash.get(name)==null?0:hash.get(name);
			hash.put(name, count+1);
			if(count>max)
				max=count;
		}
		ArrayList<String> al = new ArrayList<String>();
		for(String name:hash.keySet()){
			if(hash.get(name)==max){
				al.add(name);
			}
		}
		Collections.sort(al);
		System.out.println(al.get(0));
	}

}
