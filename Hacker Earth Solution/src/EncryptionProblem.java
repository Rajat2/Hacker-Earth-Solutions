import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashSet;


public class EncryptionProblem {

	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		HashMap<Character, Integer> map = new HashMap<>();
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(!set.contains(c))
					set.add(c);
			if(map.containsKey(c)){
				int temp =map.get(c)+1; 
				map.put(c,temp);
			}
			else
				map.put(c, 1);
			
			/*System.out.println(map.toString());*/
		}
		for(Character c: set){
			System.out.print((char)c);
			System.out.print(map.get(c));
		}
		
	}
}
