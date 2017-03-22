package pac1;
import java.util.*;

public class Queuetest1 {
	class Command{
		public String str1;
		Command(String str){
			str1=str;
		}
		public void operation(){
			System.out.println(str1);
		}
	}
	class AddQueue{
		public Command addqueue(Command temp,Queue que){
			que.offer(temp);
			return temp;
		}
	}
	class ShowQueue{
		public void showqueue(Queue que){
			while(que.peek()!=null){
				que.remove();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queuetest1 tt=new Queuetest1();
		Command t1=tt.new Command("hello");
		AddQueue t2=tt.new AddQueue();
		ShowQueue t3=tt.new ShowQueue();
		Queue<String> que1=new LinkedList<String>();
		t1.operation();
		t2.addqueue(t1, que1);
		t3.showqueue(que1);
		
	}

}
