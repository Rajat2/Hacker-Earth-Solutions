package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Minimum{
	BigInteger num;
	int index;
	Minimum(BigInteger x,int y){
		num = x;
		index = y;
	}
}
public class TwoArraysAndMinimum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		BigInteger a = new BigInteger(temp[0]);
		BigInteger b = new BigInteger(temp[1]);
		BigInteger c = new BigInteger(temp[2]);
		int N = Integer.parseInt(br.readLine());
		BigInteger temp_A = a.multiply(c);
		BigInteger temp_B = b.multiply(c);
		Minimum mA1 = new Minimum(temp_A, 0);
		Minimum mB1 = new Minimum(temp_B, 0);
		Minimum mA2 = new Minimum(temp_A,0),mB2=new Minimum(temp_B, 0);
		BigInteger M = new BigInteger("1000000007");
		BigInteger t1 = (a).multiply(b).multiply(c).mod(M);
		BigInteger t2 = (a).multiply(b).mod(M);
		BigInteger t3 = (a).multiply(c).mod(M);
		BigInteger t4 = (b).multiply(c);
		t3 = t1.add(t2).add(t3).mod(M);
		t4 = t1.add(t2).add(t4).mod(M);
		for(int i=1;i<N;i++){
			temp_A = temp_A.multiply(t3).mod(M);
			temp_B = temp_B.multiply(t4).mod(M);
			if(i==1){
				mA2 = new Minimum(temp_A,i);
				mB2 = new Minimum(temp_B, i);
			}
			if(mA1.num.compareTo(temp_A)>0){
				mA1.num = temp_A;
				mA1.index = i;
			}
			else if(mA2.num.compareTo(temp_A)>0){
				mA2.index = i;
				mA2.num = temp_A;
			}
			
			if(mB1.num.compareTo(temp_B)>0){
				mB1.num = temp_B;
				mB1.index = i;
			}
			else if(mB2.num.compareTo(temp_B)>0){
				mB2.index = i;
				mB2.num = temp_B;
			}
		}
		if(mA1.index!=mB1.index){
			System.out.println(mA1.num.add(mB1.num).mod(M));
		}
		else{
			System.out.println(Math.min(Long.parseLong(mA1.num.add(mB2.num).mod(M)+""), Long.parseLong(mA2.num.add(mB1.num).mod(M)+"")));
		}
	}
}
