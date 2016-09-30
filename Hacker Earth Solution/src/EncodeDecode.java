import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class EncodeDecode {
	
	static BigInteger fact(int num){
		BigInteger bint = BigInteger.ONE;
		for(int i=1;i<num;i++){
			bint = bint.multiply(new BigInteger(i+""));
		}
		return bint;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
			while(T-->0){
				String[] XY = br.readLine().split(" ");
				int X = Integer.parseInt(XY[0]);
				//int Y = Integer.parseInt(XY[1]);
				//System.out.println(fact(X+Y-X).divide(fact(Y)));
			}
	}
}
