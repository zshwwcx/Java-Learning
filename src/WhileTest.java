/**
 * ����һ��������֣������С��0.99�������ִ�У�ֱ��������ֵ����0.99Ϊֹ
 * @author haven
 *
 */
public class WhileTest {
	static boolean condition(){
		boolean result = Math.random()<0.99 ;/*Math.random()����0��1֮�䣨����0���ǲ�����1����һ��doubleֵ*/
		System.out.print(result+", ");
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(condition()){/*ͨ����������ֵ����ѭ���ṹ*/
			System.out.println("Inside 'while' ");	
		}
		System.out.println("Outside 'while' ");

	}

}//:~
