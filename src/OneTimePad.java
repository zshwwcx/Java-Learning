import java.util.Scanner;

public class OneTimePad {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;//�洢StringBuffer�ĳ��ȣ�Ҳ������Կkey�ĳ���
		String typeIn;//����typeIn�������洢�û����������
		StringBuffer plaintext=new StringBuffer();//�洢����
		StringBuffer keytext=new StringBuffer();//�洢��Կ
		StringBuffer encryptiontext=new StringBuffer();//�洢���ĵĿɱ��ַ���
		
		System.out.println("Welcome for using OneTimePad,if you want to exit,pirnt '#'\n");
		System.out.println("------------------------------------------------------------\n");
		
		//boolean running=true;//running��һ���ź���������ѭ���������ܹ���
		
		//while(running){
			System.out.println("Print your plaintext for Encryption:\n");
			Scanner input=new Scanner(System.in);
			typeIn=input.nextLine();//��ȡ�û����������
			//if(typeIn.charAt(0)=='#'){
				//System.exit(0);
			//}
			//else{
				char[] chars=typeIn.toCharArray();//������ת��ΪASCII���ַ�����
				int[] num=new int[chars.length];
			
				for(int i=0;i<chars.length;i++){//�����ĵ�ASCII��ֵ����num����
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
