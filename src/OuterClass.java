
public class OuterClass {
	public OuterClass(){
		InnerClass in=new InnerClass();
		in.ss="new string";
		System.out.println(in.ss);
	}
	public class InnerClass{
		private String ss;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass two=new OuterClass();
	}

}
