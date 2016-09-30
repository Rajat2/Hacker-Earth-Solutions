import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LittleShoneAndSuperNetwork {
	static void getAnswer(String ip[]){
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<ip[0].length();i++){
			if(ip[0].charAt(i)==ip[1].charAt(i))
				sb.append(ip[0].charAt(i));
			else
				break;
		}
		for(int i=2;i<ip.length;i++){
			int count=0;
			for(int j=0;j<sb.length();j++){
				if(ip[i].charAt(j)==sb.charAt(j))
					count++;
				else
					break;
			}
			sb = sb.delete(count, sb.length());
		}
		int len = sb.length();
		for(int i=0;i<32-len;i++)
			sb.append("0");
		StringBuilder ans = new StringBuilder();
		for(int i=0;i<32;i = i+8){
			String temp = sb.substring(i, i+8);
			System.out.print(temp+" ");
			ans.append(Integer.parseInt(temp,2)+".");
		}
		System.out.print(ans.substring(0,ans.length()-3)+" "+len);
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String ip[] = new String[N];
		int j=0;
		while(N-->0){
			StringBuilder sb = new StringBuilder();
			String temp[] = br.readLine().split("\\.");
			for(int i=0;i<temp.length;i++)
				sb.append(String.format("%8s", Integer.toBinaryString(Integer.parseInt(temp[i]))).replace(' ', '0'));
			ip[j++] = sb.toString();
		}
		//System.out.println(Arrays.toString(ip));
		getAnswer(ip);
	}
}