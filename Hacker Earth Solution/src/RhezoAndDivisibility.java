import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RhezoAndDivisibility {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Integer Q = Integer.parseInt(br.readLine());
		while(Q-->0){
			String temp[] = br.readLine().split(" ");
			int L = Integer.parseInt(temp[0])-1;
			int R = Integer.parseInt(temp[1]);
			int ans = 3*Integer.parseInt(str.charAt(L)+"");
			for(int i=L+1;i<R;i++){
				ans+=Integer.parseInt(str.charAt(i)+"");
				ans = (ans+ans/7)&7;
				ans*=3;
			}
			if(ans==0 || ans%7==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
