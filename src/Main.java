import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();


    }


    public static void start() {
        //�	������ ���� 3 ������ ����. �����������, �����������, ����� �� ���������.
        System.out.println("��������������� ��� �����������������:");
        System.out.println("�������:");
        System.out.println("1  - ��� �����������");
        System.out.println("2  - ��� �����������");
        System.out.println("3  - ��� ������ �� ���������");
        Scanner S = new Scanner(System.in);
        int choice;
        choice = S.nextInt();
        switch (choice) {
            case 1:
                System.out.println("���� � �������");
                System.out.println("������� �����: ");
                System.out.println("������� ������: ");
                break;
            case 2:
                System.out.println("����������� ������ ������������");
                System.out.println("������� �����: ");
                System.out.println("������� ������: ");
                break;
            case 3:
                System.out.println("����� �� ���������.");
        }
    }

}