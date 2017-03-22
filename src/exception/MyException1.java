package exception;
import java.util.*;

class MyException extends Exception{
	public MyException(){
		
	}
	public MyException(String str){
		super(str);
	}
}


public class MyException1 {
	public static void f() throws MyException{
		System.out.println("Throwing MyException from f().");
		throw new MyException();
	}
	public static void g() throws MyException{
		System.out.println("Throwing new MyException from g().");
		throw new MyException("Originated in g().");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			f();
		}catch(MyException e){
			e.printStackTrace(System.out);
		}catch(Exception e){
			e.printStackTrace(System.out);
		}
		try{
			g();
		}catch(MyException e){
			e.printStackTrace();
		}
	}

}
