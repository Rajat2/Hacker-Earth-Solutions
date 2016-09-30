package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MonkAndChampionsLeague {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String MN[] = br.readLine().split(" " );
		int M = Integer.parseInt(MN[0]);
		int N = Integer.parseInt(MN[1]);
		PriorityQueue<Integer> queue = new PriorityQueue<>(M,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		String val[] = br.readLine().split(" ");
		for(int i=0;i<val.length;i++)
			queue.add(Integer.parseInt(val[i]));
		long ans=0;
		while(N-->0){
			int x = queue.poll();
			ans += x;
			--x;
			queue.add(x);
		}
		System.out.println(ans);
	}
}
