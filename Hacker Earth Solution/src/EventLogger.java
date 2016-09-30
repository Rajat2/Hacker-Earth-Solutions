    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;
    class Details{
    	String eventType;
    	Integer srcId,eventId,timeStamp;
    	public String toString(){
    		return srcId+"---->"+timeStamp;
    	}
    }
    public class EventLogger {
    	public static void main(String[] args) throws Exception {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    		String temp[] = br.readLine().split(" ");
    		int N = Integer.parseInt(temp[1].trim());
    		int Q = Integer.parseInt(temp[2].trim());
    		List<Details> list = new ArrayList<Details>();
    		for(int i=0;i<N;i++){
    			String d[] = br.readLine().split(" ");
    			Details detail = new Details();
    			detail.srcId = Integer.parseInt(d[0]);
    			detail.eventId = Integer.parseInt(d[1]);
    			detail.eventType = d[2].toLowerCase();
    			detail.timeStamp = Integer.parseInt(d[3]);
    			list.add(detail);
    		}
    		Collections.sort(list, new Comparator<Details>() {
    			@Override
    			public int compare(Details o1, Details o2) {
    				// TODO Auto-generated method stub
    				return o1.timeStamp.compareTo(o2.timeStamp);
    			}
    		});
    		//System.out.println(list);
    		while(Q-->0){
    			String q[] = br.readLine().split(" ");
    			if(Integer.parseInt(q[0])==1){
    				int L = Integer.parseInt(q[1]);
    				int R = Integer.parseInt(q[2]);
    				int src1=0,src2=0;
    				for(int i=0;i<list.size();i++){
    					Details detail = list.get(i);
    					if(detail.timeStamp>=L && detail.timeStamp<=R){
    						if(detail.srcId==1)
    							src1++;
    						else
    							src2++;
    					}
    				}
    				System.out.println("Source 1: "+src1+" Source 2: "+src2);
    			}
    			else if(Integer.parseInt(q[0])==2){
    				int L = Integer.parseInt(q[1]);
    				int R = Integer.parseInt(q[2]);
    				int t1=0,t2=0,t3=0,t4=0;
    				for(int i=0;i<list.size();i++){
    					Details detail = list.get(i);
    					if(detail.timeStamp>=L && detail.timeStamp<=R){
    						if(detail.eventType.equals("informational"))
    							t1++;
    						else if(detail.eventType.equals("alert"))
    							t2++;
    						else if(detail.eventType.equals("critical"))
    							t3++;
    						else if(detail.eventType.equals("warning"))
    							t4++;
    					}
    				}
    				System.out.println("Informational: "+t1);
    				System.out.println("Alter: "+t2);
    				System.out.println("Critical: "+t3);
    				System.out.println("Warning: "+t4);
    			}
    			else if(Integer.parseInt(q[0])==3){
    				int x = Integer.parseInt(q[1]);
    				for(int i=0;i<list.size();i++){
    					if(list.get(i).timeStamp == x){
    						System.out.println(i+1);
    						break;
    					}
    				}
    			}
    			
    		}
    	}
    }