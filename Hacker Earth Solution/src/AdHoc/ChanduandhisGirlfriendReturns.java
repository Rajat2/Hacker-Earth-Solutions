package AdHoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 class ChanduandhisGirlfriendReturns {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		while(x>0){
			String temp[]  = br.readLine().split(" ");
			int n = Integer.parseInt(temp[0]);
			int m = Integer.parseInt(temp[1]);
			int a[] = new int[n];
			int b[] = new int[m];
			String[] temp1 = br.readLine().split(" ");
			String[] temp2 = br.readLine().split(" ");
			for(int i=0;i<n;i++)
				a[i] = Integer.parseInt(temp1[i]);
			for(int i=0;i<m;i++)
				b[i] = Integer.parseInt(temp2[i]);
			int i = 0, j = 0, k = 0;
		    while (i < a.length && j < b.length)
		    {
		        if (a[i] < b[j])
		        {
		           System.out.print(b[j]+" ");
		            j++;
		        }
		        else if(a[i] > b[j])
		        {
		        	System.out.print(a[i]+" ");
		            i++;
		        }
		        else{
		        	System.out.print(a[i]+" ");
		        	System.out.print(b[j]+" ");
		        	i++;
		        	j++;
		        }
		        	
		    }

		    while (i < a.length)
		    {
		    	System.out.print(a[i]+" ");
		        i++;
		    }

		    while (j < b.length)
		    {
		    	System.out.print(b[j]+" ");
		        j++;
		    }
		    System.out.println();
		    --x;
		}
	}
}
