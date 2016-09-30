import java.io.BufferedReader;
import java.io.InputStreamReader;


public class MonkAndPowerOfTime {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int call[] = new int[N];
		int ideal[] = new int[N];
		String t[] = br.readLine().split(" ");
		String u[] = br.readLine().split(" ");
		for(int i=0;i<N;i++){
			call[i] = Integer.parseInt(t[i]);
			ideal[i] = Integer.parseInt(u[i]);
		}
		int i=0,j=0,time=0;
		while(i<N){
			if(call[j]==-1){
				j=(j+1)%N;
				continue;
			}
			if(ideal[i]!=call[j])
				time++;
			else{
				call[j] = -1;
				i++;
				time++;
			}
			j = (j+1)%N;
		}
		System.out.println(time);
	}
}
