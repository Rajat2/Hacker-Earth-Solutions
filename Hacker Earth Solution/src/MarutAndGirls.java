import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;


public class MarutAndGirls {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int a[] = new int[N];
		String temp[] = br.readLine().split(" ");
		for(int i=0;i<N;i++)
			a[i] = Integer.parseInt(temp[i]);
		int M = Integer.parseInt(br.readLine());
		int count = 0;
		while(M-->0){
			boolean flag = false;
			String x[] = br.readLine().split(" ");
			HashMap<Integer, Boolean> hash = new HashMap<>(x.length);
			for(int i=0;i<x.length;i++)
				hash.put(Integer.parseInt(x[i]), true);
			for(int i=0;i<N;i++)
				if(hash.get(a[i])==null){flag=true;break;}
			if(!flag)
				count++;
		}
		System.out.println(count);
	}
}
