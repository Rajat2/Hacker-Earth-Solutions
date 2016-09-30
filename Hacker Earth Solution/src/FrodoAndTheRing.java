import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrodoAndTheRing {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		while(T-->0){
			String NM[] = br.readLine().split(" ");
			int N = Integer.parseInt(NM[0]);
			int M = Integer.parseInt(NM[1]);
			long a[][] = new long[N][M];
			for(int i=0;i<N;i++){
				String temp[] = br.readLine().split(" ");
				for(int j=0;j<M;j++){
					if(temp[j].equals("D"))
						a[i][j] = -100;
					else if(temp[j].equals("T"))
						a[i][j] = 150;
					else
						a[i][j] = 0;
				}
			}
			/*System.out.println("Before");
			for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}*/
			if(a[0][0]<0)
				a[0][0] = -100000;
			for(int i=1;i<N;i++){
				a[i][0] += a[i-1][0];
				if(a[i][0]<0)
					a[i][0] = -10000;
			}
			for(int i=1;i<M;i++){
				a[0][i] += a[0][i-1];
				if(a[0][i]<0)
					a[0][i] = -10000;
			}
			for(int i=1;i<N;i++){
				for(int j=1;j<M;j++){
					a[i][j] += Math.max(a[i-1][j], a[i][j-1]);
					if(a[i][j]<0)
						a[i][j] = -10000;
				}
			}
			/*for(int i=0;i<N;i++){
				for(int j=0;j<M;j++){
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}*/
			System.out.println(a[N-1][M-1]>=0?a[N-1][M-1]:-1);
		}
	}
}
