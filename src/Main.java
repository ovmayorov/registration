import java.io.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        RegistrationSystem dbUsers = new RegistrationSystem("usersdatabase.txt");
        System.out.println(dbUsers.getUsers());

        start(dbUsers);

        dbUsers.saveData();
        System.out.println("������ ��������� ���������.");



    }


    public static void start(RegistrationSystem dbUsers) {
        //�	������ ���� 3 ������ ����. �����������, �����������, ����� �� ���������.
        Scanner S = new Scanner(System.in);
        int choice;
        String nickname1 = "";
        String password1 = "";
        System.out.println("��������������� ��� �����������������:");
        System.out.println("�������:");
        System.out.println("1  - ��� �����������");
        System.out.println("2  - ��� �����������");
        System.out.println("3  - ��� ������ �� ���������");

        choice = S.nextInt();

        switch (choice) {
            case 1:
                System.out.println("���� � �������");
                System.out.println("������� �����: ");
                nickname1 = S.next();
                System.out.println("������� ������: ");
                password1 = S.next();
                System.out.println("������������ "+dbUsers.login(nickname1,password1)+" ������������� �������.");
                start(dbUsers);
                break;
            case 2:
                System.out.println("����������� ������ ������������");
                System.out.println("������� �����: ");
                nickname1 = S.next();
                System.out.println("������� ������: ");
                password1 = S.next();
                System.out.println("�� �����: "+nickname1 +" "+password1);
                if(dbUsers.register(nickname1,password1)){
                   System.out.println("����� ������������ ������� ��������. ");
                }
                start(dbUsers);
                break;
            case 3:
                //saveData(dbUsers.getUsers(), "usersdatabase.txt" );
                dbUsers.saveData();
                System.out.println("����� �� ���������.");
                break;
        }
    }


}