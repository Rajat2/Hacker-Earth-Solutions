package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MonkAndMultiplication {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int a[] = new int[T];
		String s[] = br.readLine().split(" ");
		for(int i=0;i<T;i++)
			a[i] = Integer.parseInt(s[i]);
		PriorityQueue<Integer> p = new PriorityQueue<>(T,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		for(int i=0;i<T;i++){
			p.add(a[i]);
			if(p.size()>2){
				int x = p.poll();
				int y = p.poll();
				int z = p.poll();
				//System.out.println(x+" - "+y+" - "+z);
				//System.out.println(p);
				System.out.println((long)x*y*z);
				p.add(x);
				p.add(y);
				p.add(z);
			}
			else
				System.out.println("-1");
			
		}
	}
}
