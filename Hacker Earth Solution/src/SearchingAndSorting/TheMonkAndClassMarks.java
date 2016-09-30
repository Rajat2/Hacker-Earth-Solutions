package SearchingAndSorting;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Data{
	String name;
	Integer num;
	Data(String a,Integer b){
		name = a;
		num = b;
	}
}
public class TheMonkAndClassMarks {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Data> list = new ArrayList<Data>();
        while(T-->0){
        	String t1[] = br.readLine().split(" ");
        	Data d= new Data(t1[0],Integer.parseInt(t1[1]));
        	list.add(d);
        }
        Collections.sort(list, new Comparator<Data>() {

			@Override
			public int compare(Data a, Data b) {
				// TODO Auto-generated method stub
				if(a.num == b.num)
					return a.name.compareTo(b.name);
				else
					return b.num.compareTo(a.num);
			}
		});
        for(Data d:list)
        	System.out.println(d.name+" "+d.num);
	}
}
