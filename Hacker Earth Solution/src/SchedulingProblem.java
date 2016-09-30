import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

class Process{
	Integer p;
	Integer t;
	Integer Multi;
	Process(int p,int t){
		this.p = p;
		this.t= t;
		Multi = this.p*this.t;
	}
	public String toString(){
		return this.p+"->"+this.t;
	}
}

public class SchedulingProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		List<Process> list = new ArrayList<Process>();
			while(T-->0){
				String[] XY = br.readLine().split(" ");
				Process p = new Process(Integer.parseInt(XY[0]), Integer.parseInt(XY[1]));
				list.add(p);
			}
			Collections.sort(list, new Comparator<Process>() {

				@Override
				public int compare(Process o1, Process o2) {
					// TODO Auto-generated method stub
						if(o1.t==o2.t)
							return -o1.p.compareTo(o2.p);
						else
							return o1.t.compareTo(o2.t);			
				}

			});
			//System.out.println(list.toString());
			/*for(Process p: list)
				System.out.println(p.p+" - "+p.t+"===>"+p.Multi);*/
			ListIterator<Process> iterator = list.listIterator();
			long ans=0;
			long prev=0;
 			while(iterator.hasNext()){
 				Process p = iterator.next();
 				ans+= (long)p.p*(p.t+prev);
 				prev+=p.t;
 				//System.out.println(prev+"-------------------->"+ans);
 			}
 			System.out.println(ans);
	}
}
