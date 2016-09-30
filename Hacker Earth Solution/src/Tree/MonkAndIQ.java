package Tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

class Course{
	Long number;
	Long students;
	Long last_student_IQ;
	Long z;
	public Course() {
		// TODO Auto-generated constructor stub
		this.number = 0L;
		this.students = 0L;
		this.last_student_IQ = 0L;
		this.z= 0L;
	}
}

public class MonkAndIQ {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line[]  = br.readLine().trim().split(" ");
		int C = Integer.parseInt(line[0]);
		int P = Integer.parseInt(line[1]);
		int N = Integer.parseInt(line[2]);
		
		PriorityQueue<Course> queue = new PriorityQueue<>(20, new Comparator<Course>() {
			@Override
			public int compare(Course o1, Course o2) {
				// TODO Auto-generated method stub
				if(o1.z.compareTo(o2.z)==0)
					return o1.number.compareTo(o2.number);
				else
					return o1.z.compareTo(o2.z);
			}
		});
		String Y[] = br.readLine().split(" ");
		for(int i=0;i<C;i++){
			Course c = new Course();
			if(i<Y.length){
				c.number =(long) i+1;
				c.students = 1L;
				c.last_student_IQ = Long.parseLong(Y[i]);
				c.z = Long.parseLong(Y[i]);
			}
			else{
				c.number =(long) i+1;
				c.students = 0L;
				c.last_student_IQ = 0L;
				c.z = 0L;
			}
			queue.add(c);
		}
		String X[] = br.readLine().split(" ");
		for(int i=0;i<P;i++){
			long num=0;
			if(i>=X.length){
				num=0;
			}
			else
				num = Integer.parseInt(X[i]);
			Course c = queue.poll();
			System.out.print(c.number+" ");
			c.students += 1;
			c.z =(long) c.students * (c.last_student_IQ + num);
			c.last_student_IQ = num;
			queue.add(c);
		}
	}
}
