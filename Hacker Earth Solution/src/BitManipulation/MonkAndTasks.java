package BitManipulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Data{
	Long number;
	Long count;
	Integer index;
}

public class MonkAndTasks {
	static long count(long n){
		long count=0;
		while(n>0){
			n&=(n-1);
			count++;
		}
		return count;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	 ArrayList<Data> list = new ArrayList<>();
        	int N = Integer.parseInt(br.readLine());
        	String s[] = br.readLine().split(" ");
        	for(int i=0;i<N;i++){
        		Data d = new Data();
        		d.number = Long.parseLong(s[i]);
        		d.count = count(d.number);
        		d.index = i;
        		list.add(d);
        	}
        	Collections.sort(list,new Comparator<Data>() {

				@Override
				public int compare(Data o1, Data o2) {
					// TODO Auto-generated method stub
					if(o1.count == o2.count)
						return o1.index.compareTo(o2.index);
					else
						return o1.count.compareTo(o2.count);
				}
			});
        	for(Data d:list)
        		System.out.print(d.number+" ");
        	System.out.println();
        }
	}
}
