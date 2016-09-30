import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class BiasedChandan {

	public static void main(String[] args) throws NumberFormatException, IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int N = Integer.parseInt(br.readLine());
			Stack<Integer> st = new Stack<Integer>();
			
			while(N>0){
				int a = Integer.parseInt(br.readLine());
				if(a==0 && !st.isEmpty()){
					st.pop();
				}
				else
					st.push(a);
				--N;
			}
			long sum=0;
			for(int a:st){
				sum+=a;
			}
			System.out.println(sum);
	}

}
