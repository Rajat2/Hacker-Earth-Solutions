import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UseFulFunction {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
		}
		/////////////////////////////////////////////////////////////////////////
		String line[]  = br.readLine().trim().split(" ");
		int C = Integer.parseInt(line[0]);
		int P = Integer.parseInt(line[1]);
		int N = Integer.parseInt(line[2]);
		////////////////////////////////////////////////////////////////////////
		int a[] = new int[10];
		String[] temp1 = br.readLine().split(" ");
		for(int i=0;i<10;i++)
			a[i] = Integer.parseInt(temp1[i]);
		/////////////////////////////////////////////////////////////////////
		for(int i=0;i<10;i++){
			String temp[] = br.readLine().split(" ");
			for(int j=0;j<temp.length;j++){
				a[j] = Integer.parseInt(temp[j]);
			}
		}
		
		
		
	}
}
