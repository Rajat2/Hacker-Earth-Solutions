import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;


public class NiceArches {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int count=0;
		while(T>0){
			Stack<Character> st = new Stack<Character>();
			char a[] = br.readLine().toCharArray();
			for(int i=0;i<a.length;i++){
				char c = a[i];
				if(!st.isEmpty()){
				if(st.peek()==c){
					st.pop();
				}
				else
					st.push(c);
				}
				else
					st.push(c);
			}
			if(st.empty())
				++count;
		--T;
		}
		System.out.println(count);
	}
}
