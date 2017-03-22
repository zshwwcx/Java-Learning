package pac1;
import java.util.*;

public class DoublePriorityQueue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(11);
		PriorityQueue<Double> quelist=new PriorityQueue<Double>();
		for(int i=0;i<100;i++){
			quelist.add(rand.nextDouble());
			
		}
		while(quelist.peek()!=null){
			System.out.print(quelist.poll()+" ");
		}
	}

}
