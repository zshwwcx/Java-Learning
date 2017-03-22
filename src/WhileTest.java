/**
 * 产生一个随机数字，如果是小于0.99，则继续执行，直到产生的值大于0.99为止
 * @author haven
 *
 */
public class WhileTest {
	static boolean condition(){
		boolean result = Math.random()<0.99 ;/*Math.random()产生0到1之间（包括0但是不包括1）的一个double值*/
		System.out.print(result+", ");
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(condition()){/*通过函数返回值控制循环结构*/
			System.out.println("Inside 'while' ");	
		}
		System.out.println("Outside 'while' ");

	}

}//:~
