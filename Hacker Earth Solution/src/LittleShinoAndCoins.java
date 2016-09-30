import java.io.BufferedReader;
import java.io.InputStreamReader;


public class LittleShinoAndCoins {
	final int MAX_CHARS = 26;
	static int final_count=0;
	boolean isAnswer(int count[], int k){
	    int val = 0;
	    for (int i=0; i<MAX_CHARS; i++)
	        if (count[i] > 0)
	            val++;
	    return (val == k);
	}
	void countUnique(String s, int k){
		System.out.print(s+"--->");
	    int u = 0; // number of unique characters
	    int n = s.length(); 
	    int count[] = new int[MAX_CHARS];
	    //StringBuilder string = new StringBuilder();
	    for (int i=0; i<n; i++)
	    {
	        if (count[s.charAt(i)-'a']==0)
	            u++;
	        count[s.charAt(i)-'a']++;
	    }
	    if (u < k)
	        return;
	    for(int i=0;i<MAX_CHARS;i++)
	    	count[i] = 0;
	    
	    count[s.charAt(0)-'a']++;
	    //string.append(s.charAt(0));
	    if(isAnswer(count, k) ){
        	final_count++;
        }
	    for (int i=1; i<n; i++){
	        count[s.charAt(i)-'a']++;
	      if(isAnswer(count, k) ){
	        	final_count++;
	        }
	    }
	    System.out.println(final_count);
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine());
		String s = br.readLine();
		LittleShinoAndCoins obj = new LittleShinoAndCoins();
		for(int i=0;i<=s.length()-k;i++)
			obj.countUnique(s.substring(i), k);
		System.out.println(final_count);
	}
}
