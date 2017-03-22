package exception;

interface fake{
	public void walk();
	public void run();
}

class Base{
	public void walk(){}
	public void run(){}
}
public class BaseInterface {
	class Son extends Base implements fake{
		public void walk(){
			System.out.println("Son walk()");
		}
		public void run(){
			System.out.print("Son run()");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseInterface ne=new BaseInterface();
		Son son=ne.new Son();
		son.walk();
		son.run();
	}

}
