import java.io.*;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuIndex = 0;
        RegistrationSystem dbUsers = new RegistrationSystem();
        File usersFile = new File("usersdatabase.txt");
        try(FileReader fileReader = new FileReader(usersFile);
            BufferedReader buffer = new BufferedReader(fileReader)){
            if(!usersFile.exists()){
                System.out.println("� ������� ��� �������������.");
                //dbUsers = new RegistrationSystem();
            }
            else {
                dbUsers = new RegistrationSystem("usersdatabase.txt");
            }
//                String line = "";
//                int flag = 1;
//                while((line=buffer.readLine())!=null){
//                    switch(flag){
//                        case 1:
//                            String user = line;
//                            flag = 2;
//                            break;
//                        case 2:
//                            String pass = line;
//                            flag = 3;
//                            break;
//                        case 3:
//                            Date day = ;
//                    }
//
//                }



        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }


        start(dbUsers);
        System.out.println("����������: ������� 1\n" +
                           "��� ������: ������� 0"  );
        menuIndex = scan.nextInt();
        if(menuIndex == 1){
            start(dbUsers);
        }
        else if(menuIndex == 0){
            dbUsers.saveData();
        }

        System.out.println("������ ��������� ���������.");



    }


    public static void start(RegistrationSystem dbUsers) {
        //�	������ ���� 3 ������ ����. �����������, �����������, ����� �� ���������.
        Scanner S = new Scanner(System.in);
        int choice;

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
                System.out.println("������� ������: ");
                break;
            case 2:
                System.out.println("����������� ������ ������������");
                System.out.println("������� �����: ");
                String nickname1 = S.nextLine();
                S.nextInt();
                System.out.println("������� ������: ");
                S.nextInt();
                String password1 = S.nextLine();

                if(dbUsers.register(nickname1,password1)){
                   System.out.println("����� ������������ ������� ��������. ");
                }

                break;
            case 3:
                System.out.println("����� �� ���������.");
                dbUsers.saveData();

        }



    }

}