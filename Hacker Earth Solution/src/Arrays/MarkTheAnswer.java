package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MarkTheAnswer {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String NX[] = br.readLine().split(" ");
		int N = Integer.parseInt(NX[0]);
		int X = Integer.parseInt(NX[1]);
		String temp[] = br.readLine().split(" ");
		int final_count = 0,count=0;
		int skiped = 0;
		for(int i=0;i<N;i++){
			int a = Integer.parseInt(temp[i]);
			if(skiped>1){
				if(final_count<count){
					final_count = count;
				}
				break;
			}
			if(a<=X){
				count++;
			}
			else
				skiped++;
		}
		if(final_count<count){
			final_count = count;
		}
		System.out.println(final_count);
	}
}
