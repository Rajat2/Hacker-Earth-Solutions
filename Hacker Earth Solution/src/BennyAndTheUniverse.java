import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BennyAndTheUniverse {
	static boolean isSubsetSum(int set[], int n, int sum){
	    int subset[][] = new int[sum+1][n];
	    // If sum is 0, then answer is true
	    for (int i = 0; i <n; i++)
	      subset[0][i] = 1;

	    for (int i = 1; i < sum+1; i++){
	        for (int j = 0; j < n; j++){
	            // Count of solutions including S[j]
	            int x = (i-set[j] >= 0)? subset[i - set[j]][j]: 0;
	 
	            // Count of solutions excluding S[j]
	            int y = (j >= 1)? subset[i][j-1]: 0;
	 
	            // total count
	            subset[i][j] = x + y>0?1:0;
	        }
	    }
	    return subset[sum][n-1]>0;
	}
	
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0].trim());
		int q = Integer.parseInt(temp[1].trim());
		int set[] = new int[n];
		String d[] = br.readLine().split(" ");
		int k=0;
	
		for(int i=0;i<d.length;i++){
			if(d[i]!=" " && !d[i].equals(" ") && d[i]!="" && !d[i].equals(""))
				set[k++] = Integer.parseInt(d[i].trim());
		}
		//System.out.println(Arrays.toString(set));
		while(q-->0){
			int d1 =Integer.parseInt(br.readLine()); 
			if(isSubsetSum(set,set.length,d1))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}		
}
