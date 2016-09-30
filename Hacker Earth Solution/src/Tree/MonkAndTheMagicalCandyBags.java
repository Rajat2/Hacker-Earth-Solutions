package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MonkAndTheMagicalCandyBags {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String t1[] = br.readLine().split(" ");
        	int N = Integer.parseInt(t1[0]);
        	int K = Integer.parseInt(t1[1]);
        	PriorityQueue<Long> queue = new PriorityQueue<>(30, new Comparator<Long>() {
				@Override
				public int compare(Long o1, Long o2) {
					// TODO Auto-generated method stub
					return o2.compareTo(o1);
				}
			});
        	String s[] = br.readLine().split(" ");
        	for(int i=0;i<N;i++)
        		queue.add(Long.parseLong(s[i]));
        	int ans=0;
        	while(K-->0 && !queue.isEmpty()){
        		long temp = queue.poll();
        		ans+=temp;
        		queue.add(temp/2);
        	}
        	System.out.println(ans);
        }
	}

}
