
public class VarargType {
	static void f(Character... args){
		System.out.print(args.getClass());
		System.out.println("length"+args.length);
	}
	static void g(int... args){
		System.out.print(args.getClass());
		System.out.println("length"+args.length);
	}
	public static void main(String... args) {
		// TODO Auto-generated method stub
		f('a','b','c');
		f();
		g(1);
		g();
		System.out.println("int[]:"+new int[0].getClass());
		for(String tm:args){
			System.out.println(tm);
		}
	}

}
