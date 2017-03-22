
public class OverloadingVararg {
	static void f(float i,Character... args){
		System.out.println("first");
		
	}
	static void f(char c,Character... args){
		System.out.println("second");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		f(1,'a');
		f('a','c');
		
	}

}
