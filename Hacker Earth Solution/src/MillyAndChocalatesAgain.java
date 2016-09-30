import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;



public class MillyAndChocalatesAgain {
	 static public int binarySearch(int[] inputArr, int key) {
	        int start = 0;
	        int end = inputArr.length - 1;
	        while (start <= end) {
	            int mid = (start + end) / 2;
	            if (inputArr[mid] >= key) {
	            	if(mid==0)
	            		return mid+1;
	            	else if(inputArr[mid - 1] < key)
	            		return mid+1;
	            }
	            if (key < inputArr[mid]) {
	                end = mid - 1;
	            } else {
	                start = mid + 1;
	            }
	        }
	        return -1;
	    }
		public static void main(String[] args) throws Exception {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int T = Integer.parseInt(br.readLine());
			int indexArray[] = new int[T];
			String temp[] = br.readLine().split(" ");
			indexArray[0] = Integer.parseInt(temp[0]);
			for(int i=1;i<T;i++){
				int C = Integer.parseInt(temp[i]);
				indexArray[i] = indexArray[i-1]+C; 
			}
			//System.out.println(Arrays.toString(indexArray));
			int Q = Integer.parseInt(br.readLine());
			while(Q-->0){
				int I = Integer.parseInt(br.readLine());
					System.out.println(binarySearch(indexArray, I));
			}
		}
}
