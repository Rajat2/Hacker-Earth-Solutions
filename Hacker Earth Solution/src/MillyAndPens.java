import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class MillyAndPens {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String NPM[] = br.readLine().split(" " );
			int N = Integer.parseInt(NPM[0]);
			int P = Integer.parseInt(NPM[1]);
			int M = Integer.parseInt(NPM[2]);
			Set<Integer> set = new HashSet<Integer>();
			String p[] = br.readLine().split(" ");
			for(int i=0;i<P;i++){
				set.add(Integer.parseInt(p[i]));
			}
			String m[] = br.readLine().split(" ");
			for(int i=0;i<M;i++){
				set.add(Integer.parseInt(m[i]));
			}
			if(set.size()>=N)
				System.out.println("They can");
			else
				System.out.println("They can\'t");
		}
	}
}
