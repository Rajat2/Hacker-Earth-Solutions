package Tree;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class LittleDeepuaAndArray {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line  = br.readLine();
		int N = Integer.parseInt(line);
		line = br.readLine();
		int a[]= new int[N];
		String temp[] = line.split(" ");
		int k=0;
		for(String i:temp)
			a[k++]=Integer.parseInt(i);
		int M=Integer.parseInt(br.readLine());
		for(int i=0;i<M;i++){
			int x= Integer.parseInt(br.readLine());
			for(int j=0;j<a.length;j++){
				if(a[j]>x)
					a[j]=a[j]-1;
			}
		}
		for(int i:a)
			System.out.print(i+" ");
	}

}
