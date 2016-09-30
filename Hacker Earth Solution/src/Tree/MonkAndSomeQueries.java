package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MonkAndSomeQueries {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> queue1 = new PriorityQueue<>(50, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return arg0.compareTo(arg1);
			}
			
		});
		PriorityQueue<Integer> queue2 = new PriorityQueue<>(50, new Comparator<Integer>() {

			@Override
			public int compare(Integer arg0, Integer arg1) {
				// TODO Auto-generated method stub
				return -arg0.compareTo(arg1);
			}
			
		});
		while(T-->0){
			String temp[] = br.readLine().split(" ");
			int Q = Integer.parseInt(temp[0]);
			switch (Q) {
			case 1:
					queue1.add(Integer.parseInt(temp[1]));
					queue2.add(Integer.parseInt(temp[1]));
				break;
			case 2:
				if(!queue1.remove(Integer.parseInt(temp[1])))
					System.out.println("-1");
				queue2.remove(Integer.parseInt(temp[1]));
				break;
			case 3:
					if(!queue2.isEmpty())
						System.out.println(queue2.peek());
					else
						System.out.println("-1");
				break;
			case 4:
					if(!queue1.isEmpty())
						System.out.println(queue1.peek());
					else
						System.out.println("-1");
				break;
			}
		}
	}
}
