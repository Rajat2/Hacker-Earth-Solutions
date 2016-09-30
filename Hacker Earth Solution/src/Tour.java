import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Tour {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		HashMap<String, Integer> map = new HashMap<>();
		int a[][] = new int[N][N];
		long ans=0;
		String first = "";
		for(int i=0;i<N;i++){
			String temp = br.readLine();
			if(i==0)
				first = temp;
			map.put(temp, i+1);
		}
		for(int i=0;i<N;i++){
			String temp[] = br.readLine().split(" ");
			for(int j=0;j<N;j++){
				a[i][j] = Integer.parseInt(temp[j]);
			}
		}
		int P = Integer.parseInt(br.readLine());
		for(int i=0;i<P;i++){
			String temp = br.readLine();
			int num1 = map.get(first);
			int num2 = map.get(temp);
			ans +=a[num1-1][num2-1];
			first = temp;
		}
		System.out.println(ans);
	}
}
