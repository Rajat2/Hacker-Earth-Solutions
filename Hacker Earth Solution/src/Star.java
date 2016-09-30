
public class Star {
	public static void main(String[] args) {
		int n=15;
		for(int i=1; i<=n; i++)  
	    {  
	        //Prints trailing spaces  
	        for(int j=i; j<n; j++) 
	        		System.out.print(" ");
	          //Prints hollow pyramid  
	        for(int j=1; j<=(2*i-1); j++)  
	        	if(i==n || j==1 || j==(2*i-1)  )    
	                System.out.print("*");
	            else
	               System.out.print(" ");
		System.out.println();
	    }
		
		for(int i=n;i>=1;i--){
			for(int j=i;j<n;j++)
				System.out.print(" ");
			for(int j=(2*i-1);j>=1;j--){
				if(i==n || j==1 || j==2*i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
