import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class MonksLoveforFood {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> st = new Stack<Integer>();
		while(N>0){
			String temp[] = br.readLine().split(" ");
			int a = Integer.parseInt(temp[0]);
			int b=0,x=0;
			if(a==2){
				b = Integer.parseInt(temp[1]);
				st.push(b);
			}
			else{
				if(st.isEmpty())
					System.out.println("No Food");
				else{
					x=(int) st.pop();
					System.out.println(x);
				}
			}
			--N;
		}
	}
}
