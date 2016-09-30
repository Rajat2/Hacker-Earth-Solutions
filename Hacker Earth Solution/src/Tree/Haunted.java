package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;

class Ghost{
	Long age;
	Long GOD;
	//Integer CT;
	public Ghost() {
		// TODO Auto-generated constructor stub
		age = 0L;
		GOD = 0L;
		//CT = 0;
	}
}

public class Haunted {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String MN[] = br.readLine().split(" " );
		int N = Integer.parseInt(MN[0]);
		int M = Integer.parseInt(MN[1]);
		HashMap<Long, Ghost> map = new HashMap<>();
		PriorityQueue<Ghost> queue = new PriorityQueue<>(50,new Comparator<Ghost>() {	//Don't use intital capacity as M because M may be too large
			@Override
			public int compare(Ghost o1, Ghost o2) {
				// TODO Auto-generated method stub
				if(o1.GOD.compareTo(o2.GOD)==0)
					return -o1.age.compareTo(o2.age);
				else
					return -o1.GOD.compareTo(o2.GOD);
			}
		});
		String day[] = br.readLine().split(" ");
		for(int i=0;i<N;i++){
			Ghost g;
			long d = Long.parseLong((day[i]));
			if(map.get(d)==null){
				 g = new Ghost(); 
				 g.age = d;
				 g.GOD = 1L;
				 map.put(d,g);
				 queue.add(g);
			}
			else{
				g = map.get(d);
				queue.remove((Object)g);
				g.GOD += 1L;
				map.put(d, g);
				queue.add(g);
			}
			Ghost ans = queue.poll();
			System.out.println(ans.age+" "+ans.GOD);
			queue.add(ans);
			/*System.out.println("Queue is:");
			for(Ghost temp:queue)
				System.out.println(temp.age+" --> "+ temp.GOD);*/
		}
	}
}
