package exception;
import java.io.*;
import java.util.*;

public class Formatter1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Formatter f=new Formatter(System.out);
		System.out.println(f.toString());
		f.format("hello %s","World");
	}

}
