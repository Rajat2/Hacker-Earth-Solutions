package SearchingAndSorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PuchiAndLuggage {
	static int freq[] = new int[1000005];
	void merge(int a[],int low,int mid,int high)
	{
		int temp[] = new int[100004];
		int i=low;
		int j=mid+1;
		int cnt=0;
		int k=0;
		while(i<=mid && j<=high)
		{
			if(a[i]<=a[j])
			{
				freq[a[i]]+=cnt;
				temp[k++]=a[i];
				i++;
			}
			else
			{
				cnt++;
				temp[k++]=a[j++];
			}
		}
		while(i<=mid)
		{
			freq[a[i]]+=cnt;
			temp[k++]=a[i];
			i++;
		}
		while(j<=high)
		{
			temp[k++]=a[j];
			j++;
		}
		int l=0;
		for(i=low;i<=high;i++)
		{
			a[i]=temp[l++];
		}
	}
	void partition(int a[],int low,int high)
	{
		if(low<high)
		{
			int mid=(low+high)/2;
			partition(a,low,mid);
			partition(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-->0){
        	int N = Integer.parseInt(br.readLine());
        	int a[] = new int[100005];
        	int temp[] = new int[100005];
        	for(int i=0;i<N;i++){
        		int t = Integer.parseInt(br.readLine());
        		a[i] = t;
        		temp[i] = t;
          	}
        	new PuchiAndLuggage().partition(a, 0, N-1);
        	for(int i=0;i<N;i++)
        		System.out.print(freq[temp[i]]+" ");
        	System.out.println();
        }
	}

}
