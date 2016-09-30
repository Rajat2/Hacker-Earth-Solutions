import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class VasyaAndParty {
	 boolean []visited;
	 LinkedList<Integer> nodes[];
	 PriorityQueue<Integer> queue;
	VasyaAndParty(int vertex){
		nodes = new LinkedList[vertex+1];
		visited = new boolean[vertex+1];
		for(int i=1;i<=vertex;i++)
			nodes[i] = new LinkedList<>();
		queue = new PriorityQueue<Integer>(3,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		} );
	}
	public void addEdge(int src,int des){
		nodes[src].add(des);
	}
	long totalCount(int k[],int n){
		long ans=1;
		visited = new boolean[n+1];
		for(int i=1;i<=n;i++){
			if(!visited[i]){
				queue.add(i);
				dfs(k,i);
				int x=0;
				 if(queue.isEmpty())
					 x =1;
				 else{
					 int temp = queue.peek();
					 while(!queue.isEmpty() && queue.peek()==temp){
					 x++;
					 queue.poll();
					 }
				 }
				 System.out.println(queue.toString());
				ans =(long)((ans%1000000007)*(x%1000000007))%1000000007;
				queue.clear();
			}
		}
		return ans;
	}
	void dfs(int k[],int src){
		System.out.print("-"+src);
		visited[src] = true;
		Iterator<Integer> i = nodes[src].iterator();
		while(i.hasNext()){
			int n = i.next();
			queue.add(k[n]);
			if(!visited[n]){
				dfs(k,n);
			}
		}
		 
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String NM[] = br.readLine().split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		VasyaAndParty vnp = new VasyaAndParty(N);
		int k[] = new int[N+1];
		String temp[] = br.readLine().split(" ");
		for(int i=1;i<=N;i++)
			k[i] = Integer.parseInt(temp[i-1]);
		while(M-->0){
			String ab[] = br.readLine().split(" ");
			int i = Integer.parseInt(ab[0]);
			int j = Integer.parseInt(ab[1]);
			vnp.addEdge(i, j);
			vnp.addEdge(j, i);
		}
		System.out.println(vnp.totalCount(k,N));	
	}
	

}
