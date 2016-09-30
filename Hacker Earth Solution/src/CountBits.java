import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountBits {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
			while(T-->0){
				Long l = Long.parseLong(br.readLine());
				long count=0;
				for(long i=3;i<=l;i++){
					System.out.println(i+"--"+Long.bitCount(i));
					if(Long.bitCount(i)%2==0){
						count++;
					}
				}
				System.out.println(count);
			}
	}
}
