import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double P=0,i=0;
		int N=0;
		double F = 0;
		
		System.out.println("��������㷽ʽ��1.�������� 2.�������� 3.���㱾��"); 
		int choose = scanner.nextInt();
		
		if(choose==1||choose==2){ 
			System.out.println("���뱾��");
			P = scanner.nextDouble();
			System.out.println("�������ʣ�");
			i = scanner.nextDouble();
			System.out.println("�������ޣ�");
			N = scanner.nextInt();
		}else if(choose==3){ 
			System.out.println("���뱾Ϣ��ֵ��");
			F = scanner.nextDouble();
			System.out.println("�������ʣ�");
			i = scanner.nextDouble();
			System.out.println("�������ޣ�");
			N = scanner.nextInt();
		}

		if(choose==1){
			F=P+P*i*N;
			System.out.println("��Ϣ��ֵΪ��" + Math.round(F*100)/100.0);
		}else if(choose==2){ 
			F=P*Math.pow((1 + i), N);
			System.out.println("��Ϣ��ֵΪ��" + Math.round(F*100)/100.0);
		}else if(choose==3){ 
			P = F/(1+i*N);
			System.out.println("ӦͶ�뱾��"+P);
		}

	}

}
