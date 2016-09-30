package JuneCircuits;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Comparator;
import java.util.PriorityQueue;

class Points{
	Integer x;
	Integer y;
	public String toString(){
		return x+" "+y;
	}
}

public class AkatsukivsLeaf {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
      PriorityQueue<Points> q1 = new PriorityQueue<>(20, new Comparator<Points>() {

		@Override
		public int compare(Points o1, Points o2) {
			// TODO Auto-generated method stub
				if(o1.x.equals(o1.y))
					return o2.y.compareTo(o1.y);
				else
					return o2.x.compareTo(o1.x);
		}
	});
      PriorityQueue<Points> q2 = new PriorityQueue<>(20, new Comparator<Points>() {

  		@Override
  		public int compare(Points o1, Points o2) {
  			// TODO Auto-generated method stub
  				if(o1.x.equals(o1.y))
  					return o2.y.compareTo(o1.y);
  				else
  					return o2.x.compareTo(o1.x);
  		}
  	});
        for(int i=0;i<N;i++){
        	Points p = new Points();
        	String temp[] = br.readLine().split(" ");
        	p.x = Integer.parseInt(temp[0])>0?Integer.parseInt(temp[0]):-1*Integer.parseInt(temp[0]);
        	p.y = Integer.parseInt(temp[1])>0?Integer.parseInt(temp[1]):-1*Integer.parseInt(temp[1]);
        	q1.add(p);
        }
        for(int i=0;i<N;i++){
        	Points p = new Points();
        	String temp[] = br.readLine().split(" ");
        	p.x = Integer.parseInt(temp[0])>0?Integer.parseInt(temp[0]):-1*Integer.parseInt(temp[0]);
        	p.y = Integer.parseInt(temp[1])>0?Integer.parseInt(temp[1]):-1*Integer.parseInt(temp[1]);
        	q2.add(p);
        }
        //System.out.println(Arrays.toString(q1.toArray()));
        //System.out.println(Arrays.toString(q2.toArray()));
        int total_sum=0;
        for(int i=0;i<N;i++){
        	Points X = q1.poll();
        	Points Y = q2.poll();
        	total_sum+= Math.abs(X.x-Y.x) + Math.abs(X.y-Y.y);
        }
        System.out.println(total_sum);
	}
}
