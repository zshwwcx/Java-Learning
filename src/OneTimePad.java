import java.util.Scanner;

public class OneTimePad {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;//存储StringBuffer的长度，也就是密钥key的长度
		String typeIn;//定义typeIn，用来存储用户输入的明文
		StringBuffer plaintext=new StringBuffer();//存储明文
		StringBuffer keytext=new StringBuffer();//存储密钥
		StringBuffer encryptiontext=new StringBuffer();//存储密文的可变字符串
		
		System.out.println("Welcome for using OneTimePad,if you want to exit,pirnt '#'\n");
		System.out.println("------------------------------------------------------------\n");
		
		//boolean running=true;//running是一个信号量，用于循环整个加密过程
		
		//while(running){
			System.out.println("Print your plaintext for Encryption:\n");
			Scanner input=new Scanner(System.in);
			typeIn=input.nextLine();//获取用户输入的明文
			//if(typeIn.charAt(0)=='#'){
				//System.exit(0);
			//}
			//else{
				char[] chars=typeIn.toCharArray();//将明文转化为ASCII码字符数组
				int[] num=new int[chars.length];
			
				for(int i=0;i<chars.length;i++){//将明文的ASCII码值存入num数组
					num[i]=(int)chars[i];
					plaintext.append(Integer.toBinaryString(num[i]));
				}
				len=plaintext.length();
				
				for(int i=0;i<len;i++){
					double tmp=Math.random();
					if(tmp<0.5)
						keytext.append(Integer.toBinaryString(0));
					else
						keytext.append(Integer.toBinaryString(1));
				}
				for(int i=0;i<len;i++){
					int t=plaintext.charAt(i)^keytext.charAt(i);
					encryptiontext.append(Integer.toBinaryString(t));
				}
				System.out.println("The encryption message is:\n");
				System.out.print(encryptiontext+"\n");
				System.out.println("------------------------------------------------------------\n");
			//}
		
			
		//}
	}

}
