package pac1;
import java.util.*;

public class SetOfInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random(44);
		Set<Integer> set1=new HashSet<Integer>();
		for(int i=0;i<100;i++){
			set1.add(rand.nextInt(100));
		}
		
		for(int j=0;j<100;j++){
			int t=rand.nextInt(100);
			System.out.println(t);
			if(set1.contains(t)){
				System.out.println("find:"+t);
			}
		}
		Iterator mm=set1.iterator();
		while(mm.hasNext()){
			System.out.print(mm.next());
		}
	}

}
