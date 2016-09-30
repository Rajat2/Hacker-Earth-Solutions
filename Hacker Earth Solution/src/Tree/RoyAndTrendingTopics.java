package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class Topics{
	Long ID;
	//long current_score;
	Long new_score;
	Long increment;
	public Topics() {
		this.ID = 0L;
		//this.current_score = 0;
		this.new_score =0L;
		this.increment = 0L;
	}
}
public class RoyAndTrendingTopics {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Topics> queue = new PriorityQueue<>(N, new Comparator<Topics>() {
			@Override
			public int compare(Topics o1, Topics o2) {
				// TODO Auto-generated method stub
				if(o1.increment.compareTo(o2.increment)==0)
					return -o1.ID.compareTo(o2.ID);
				else
					return -o1.increment.compareTo(o2.increment);
			}
		});
		while(N-->0){
			String values[] = br.readLine().split(" ");
			Topics t = new Topics();
			t.ID = Long.parseLong(values[0]);
			long old = Long.parseLong(values[1]);
			long new_score = 50 * Long.parseLong(values[2]);
			new_score += (5 * Long.parseLong(values[3]));
			new_score += (10 * Long.parseLong(values[4]));
			new_score += (20 * Long.parseLong(values[5]));
			t.new_score = new_score;
			t.increment = t.new_score - old;
			queue.add(t);
		}
		for(int i=0;queue.size()>0 & i<5;i++){
			Topics t = queue.poll();
			System.out.println(t.ID+" "+t.new_score);
		}
	}
}
