import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MaxInQueue {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue = new PriorityQueue<>(20, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			queue.add(Integer.parseInt(temp[i]));
		int q = Integer.parseInt(br.readLine());
		while(q-->0){
			String ab[] = br.readLine().split(" ");
			if(Integer.parseInt(ab[0])==1){
				queue.add(Integer.parseInt(ab[1]));
			}
			else{
				int ans = queue.poll();
				System.out.println(ans);
				queue.add(ans);
			}
		}
	}
}
