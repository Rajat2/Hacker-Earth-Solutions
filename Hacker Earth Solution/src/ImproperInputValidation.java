import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ImproperInputValidation {


public static String extractDigits(String src) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < src.length(); i++) {
        char c = src.charAt(i);
        if (Character.isDigit(c))
            builder.append(c);
    }
    return builder.toString();
}

	public static void main(String[] args) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String[] MPC = br.readLine().split(" ");
			long M = Long.parseLong(extractDigits(MPC[0]));
			long P = Long.parseLong(extractDigits(MPC[1]));
			long C = Long.parseLong(extractDigits(MPC[2]));
			long ans = (long)M - (long)(P*C);
			if(ans>=0)
				System.out.println("Transaction Successful "+ans);
			else
				System.out.println("Transaction Failed ");	
		}
	}
}
