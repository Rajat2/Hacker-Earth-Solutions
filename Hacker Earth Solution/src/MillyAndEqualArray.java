import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MillyAndEqualArray {
	private static long gcd(long a, long b)
	{
	    while (b > 0)
	    {
	        long temp = b;
	        b = a % b; // % is remainder
	        a = temp;
	    }
	    return a;
	}
	private static long lcm(long a, long b){	
	    return a * (b / gcd(a, b));}

	private static long lcm(int[] input){
	    long result = input[0];
	    for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
	    return result;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer T = Integer.parseInt(br.readLine());
		while(T-->0){
			String temp[] = br.readLine().split(" ");
			int N = Integer.parseInt(temp[0]);
			int a = Integer.parseInt(temp[1]);
			int b = Integer.parseInt(temp[2]);
			int c = Integer.parseInt(temp[3]);
			String str[] = br.readLine().split(" ");
			int input[] = new int[N];
			for(int i=0;i<N;i++)
				input[i] = Integer.parseInt(str[i]);
			long gcd = lcm(input);
			System.out.println(gcd);
			boolean flag= true;
			for(int i=0;i<N;i++){
				if(gcd%(input[i]*a)==0 || gcd%(input[i]*b)==0 || gcd%(input[i]*c)==0 || gcd == input[i]){
					flag = true;
				}
				else{
					flag= false;
					break;
				}		
			}
			if(flag)
				System.out.println("She can");
			else
				System.out.println("She can\'t");
		}
	}
}
