import java.util.Scanner;

public class Money {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("��������㷽ʽ��1.�������� 2.�������� 3.������� 4.��Ʊ���޼��� 5.���ʼ��� 6.�ʲ���ֵ����"); 
        int choose = scanner.nextInt();

        if (choose == 1) { 
            danLiJiSuan(scanner);
        } else if (choose == 2) { 
            fuLiJiSuan(scanner);
        } else if (choose == 3) { 
            benJinJiSuan(scanner);
        } else if (choose == 4) { 
            guPiaoQiXian(scanner);
        } else if (choose == 5) { 
            liLvJiSuan(scanner);
        } else if (choose == 6) {
            ziChanZongZhi(scanner);
        }

        scanner.close();

    }

    
    private static void ziChanZongZhi(Scanner scanner) {
        double P;
        double i;
        double N;
        double F;
        System.out.println("�����뱾��");
        P = scanner.nextDouble();
        System.out.println("������ÿ���Ͷ�ʽ�");
        double T = scanner.nextDouble();
        System.out.println("������Ͷ�����ޣ�");
        N = scanner.nextInt();
        System.out.println("���������ʣ�");
        i = scanner.nextDouble();
        
        for (int j = 0; j < N; j++) {
            P = P * (1 + i);
            P = P + T;
        }
        F = P - T;
        System.out.println("�ʲ���ֵ�ǣ�" + F);
    }

    
    private static void liLvJiSuan(Scanner scanner) {
        double P;
        double i;
        double N;
        double F;
        System.out.println("���뱾��");
        P = scanner.nextDouble();
        System.out.println("�������ޣ�");
        N = scanner.nextDouble();
        System.out.println("���뱾Ϣ��ֵ��");
        F = scanner.nextDouble();
        
        i = F / (P * N);
        System.out.println("����Ϊ��" + i);
    }

    
    private static void guPiaoQiXian(Scanner scanner) {
        double P;
        double i;
        double N;
        double F;
        System.out.println("���뱾��");
        P = scanner.nextDouble();
        System.out.println("�������ʣ�");
        i = scanner.nextDouble();
        System.out.println("���뱾Ϣ��ֵ��");
        // ����
        F = scanner.nextDouble();
        N = (F - P) / (i * P);
        System.out.println("����Ϊ��" + N);
    }

    
    private static void benJinJiSuan(Scanner scanner) {
        double P;
        double i;
        double N;
        double F;
        System.out.println("���뱾Ϣ��ֵ��");
        F = scanner.nextDouble();
        System.out.println("�������ʣ�");
        i = scanner.nextDouble();
        System.out.println("�������ޣ�");
        N = scanner.nextDouble();
        P = F / (1 + i * N);
        System.out.println("ӦͶ�뱾��" + P);
    }

    
    private static void fuLiJiSuan(Scanner scanner) {
        double P;
        double i;
        double N;
        double F;
        System.out.println("���뱾��");
        P = scanner.nextDouble();
        System.out.println("�������ʣ�");
        i = scanner.nextDouble();
        System.out.println("�������ޣ�");
        N = scanner.nextDouble();
        F = P * Math.pow((1 + i), N);
        System.out.println("��Ϣ��ֵΪ��" + Math.round(F * 100) / 100.0);
    }

    
    private static void danLiJiSuan(Scanner scanner) {
        double P;
        double i;
        double N;
        double F;
        System.out.println("���뱾��");
        P = scanner.nextDouble();
        System.out.println("�������ʣ�");
        i = scanner.nextDouble();
        System.out.println("�������ޣ�");
        N = scanner.nextDouble();
        F = P + P * i * N;
        System.out.println("��Ϣ��ֵΪ��" + Math.round(F * 100) / 100.0);
    }