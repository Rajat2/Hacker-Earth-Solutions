import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RoysLifeCycle {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int X=0,Y=0,temp_x=0,temp_y1=0,temp_y2=0,temp_y=0;
		while(T-->0){
			char s[] = br.readLine().toCharArray();
			temp_y2=0;
			temp_x=0;
			temp_y=0;
			for(int i=0;i<s.length;i++){
				if(s[i]=='C'){
					temp_x++;
					if(temp_y2>=0)
						temp_y2++;
					//System.out.println("---------------"+temp_y2);
				}
				else{
					temp_x=0;
					temp_y2=-1;
				}
				if(temp_x > X)
					X = temp_x;
				if(temp_y2>0)
					temp_y=temp_y1+temp_y2;
			}
			if(temp_y>Y)
				Y = temp_y;
			temp_y1 = temp_x;
			//System.out.println("temp_x--:"+temp_x);
			//System.out.println("\ntemp_y1:"+temp_y1+"---- \ntemp_y2:"+temp_y2+"-----temp:"+temp_y);
		}
		System.out.println(X+" "+Y);
	}
}
