package Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class LittleAshishAndHisWife {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Hello Rajat!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer Test = Integer.parseInt(br.readLine());
        for(int i=0;i<Test;i++){
        	String line = br.readLine();
        	String value[] = line.split(" ");
        	int n = Integer.parseInt(value[0]);
        	int x = Integer.parseInt(value[1]);
        	Set set = new HashSet();
        	line = br.readLine();
        	String []temp = line.split(" ");
        	
        	for(String s : temp)
        		set.add(Integer.parseInt(s));
        
        	if (set.size()<x) {
    			System.out.print("Bad husband\n");
    		}
    		if (set.size()==x) {
    			System.out.print("Perfect husband\n");
    		}
    		if (set.size()>x) {
    			System.out.print("Lame husband\n");
    		}
        }
	}

}
