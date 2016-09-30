package AdHoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class PrateekAndHisFriends {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	String t1[] = br.readLine().split(" ");
        	int N = Integer.parseInt(t1[0]);
        	int X = Integer.parseInt(t1[1]);
        	Queue<Integer> queue = new LinkedList<Integer>();
        	boolean flag=false;
        	int ans=0;
        	while(N-->0){
        		int temp = Integer.parseInt(br.readLine());
        		ans +=temp;
        		queue.add(temp);
        		if(ans==X)
        			flag=true;
        		else if(ans>X){
        			while(!queue.isEmpty()){
        				ans -= (Integer)queue.poll();
        				if(ans==X)
        					flag = true;
        				if(ans<X)
        					break;
        			}
        		}
        	}
        	if(flag)
        		System.out.println("YES");
        	else
        		System.out.println("NO");
        }
	}
}
