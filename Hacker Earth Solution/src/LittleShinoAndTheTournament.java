import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;


public class LittleShinoAndTheTournament {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String NQ[] = br.readLine().split(" ");
		int N = Integer.parseInt(NQ[0].trim());
		int Q = Integer.parseInt(NQ[1].trim());
		final int MAX_LIMIT = 2*N-1;
		HashMap<Integer, Integer> map = new HashMap<>();
		int a[] = new int[MAX_LIMIT];
		int start = 0;
		start = MAX_LIMIT - N;
		String temp[] = br.readLine().split(" ");
		int j = start;
		for(int i=0;i<temp.length;i++)
			a[j++] = Integer.parseInt(temp[i]);
		int total_fight = N/2;
		int reminder=0,next_start=0,last_start=start;
		while(start>1){
			if(N%2!=0){
				a[last_start-1] = Math.max(reminder,  a[start+(total_fight*2)]);
				reminder = a[start+(total_fight*2)];
			}
			for(int i=0;i<total_fight;i++){
				if(i==0){
					next_start = start/2;
					last_start = start;
				}
				a[start/2] = Math.max(a[start], a[start+1]);
				start = start+2;
			}
			N = N/2;
			start = next_start;
			total_fight = N/2;
			System.out.println(Arrays.toString(a));
			System.out.println("Reminder is:"+reminder+"  N is: "+N+"  total finghts: "+total_fight);
		}
		if(a[0]==0){
			a[0] = Math.max(a[1], reminder);
		}
		System.out.println("Final Array: \n"+Arrays.toString(a));
		for(int i=1;i<MAX_LIMIT;i++){
			if(map.get(a[i]) == null)
				map.put(a[i], 1);
			else
				map.put(a[i], (map.get(a[i])+1));
		}
		System.out.println(map);
		while(Q-->0){
			System.out.println(map.get(Integer.parseInt(br.readLine())));
		}
	}
}
