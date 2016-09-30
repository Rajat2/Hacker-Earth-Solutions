import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MixingStrings {
	static boolean isPrefix(String a,String b){
		int i=0;
		for(i=0;i<a.length() && i<b.length();i++){
			if(a.indexOf(i)!=b.indexOf(i))
				return false;
		}
		if(i==a.length())
			return true;
		else
			return false;
	}
	public static void main(String[] args) throws Exception {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		String sb = br.readLine();
		while(T-->1){
			String last = sb;
			String next = br.readLine();
			int index = last.lastIndexOf(next.charAt(0));
			if(index>0){
				if(isPrefix(last.substring(index), next)){
				sb = last.substring(0,index).concat(next);
				}
				else{
					sb = last.concat(next);
				}
			}
			else if(last.length()>1){
				sb = last.concat(next);
			}
		}
		System.out.println(sb+": "+sb.length());
	}
}
