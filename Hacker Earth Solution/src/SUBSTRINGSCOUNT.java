import java.io.BufferedReader;
import java.io.InputStreamReader;


public class SUBSTRINGSCOUNT {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String name[] = new String[T];
		for(int i=0;i<T;i++){
			name[i] = br.readLine();
		}
		int Q = Integer.parseInt(br.readLine());
		while(Q-->0){
			int count=0;
			String temp[] = br.readLine().split(" ");
			int L  = Integer.parseInt(temp[0]);
			int R  = Integer.parseInt(temp[1]);
			for(int i=0;i<T;i++){
				if(name[i].length()>=temp[2].length()){
					R = R>name[i].length()?name[i].length():R;
					if(name[i].substring(L-1,R+1).contains(temp[2].trim())){
						//System.out.println(name[i].substring(L-1,R)+"--------->"+temp[2].substring(L-1,R));
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}
