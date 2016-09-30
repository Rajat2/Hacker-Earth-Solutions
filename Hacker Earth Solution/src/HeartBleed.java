import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HeartBleed {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		String file = scan.nextLine();
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		scan.close();
		String temp=br.readLine().trim();
		boolean l1=false,l2=false,l3=false,l4=false,l5=false;
		while(temp.length()!=0 || temp != null){
			if(temp.contains("hbtype = *p++ ;") || temp.contains("hbtype =*p++;") || temp.contains("hbtype = *p++ ;")){
				l1 = true;
			}
			if(l1 && (temp.contains("n2s(p, payload) ;") || temp.contains("n2s(p, payload);"))){
				l2 = true;
			}
			if(l2 && (temp.contains("if(1 + 2 + payload + 16 > s->s3->rrec.length)") || temp.contains("if(1 + 2 + payload + 16 > s -> s3 -> rrec.length)"))){
				l3 = true;
			}
			if(l3 && (temp.contains("return 0 ;") || temp.contains("return 0;"))){
				l4 = true;
			}
			if(l4 && (temp.contains("pl = p;") || temp.contains("pl = p ;")))
				l5 = true;
			temp = br.readLine().trim();
		}
		System.out.println("outside");
		if(l1 && l2 && l3 && l4 && l5)
			System.out.println("Code is Fixed");
		else
			System.out.println("Code is Broken");
	}
}
