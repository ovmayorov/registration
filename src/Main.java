import java.io.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuIndex = 0;
        RegistrationSystem dbUsers = new RegistrationSystem("usersdatabase.txt");
        System.out.println(dbUsers);
        //String usersFile = "usersdatabase.txt";

//        try(FileReader fileReader = new FileReader("usersdatabase.bin");
//            BufferedReader buffer = new BufferedReader(fileReader)){
//            if(buffer==null){
//                System.out.println("� ������� ��� �������������.");
//                //dbUsers = new RegistrationSystem();
//            }
//            else {
//                dbUsers = new RegistrationSystem();
//            }
//        }
//        catch(FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }
//        catch(IOException ex){
//            System.out.println(ex.getMessage());
//        }
        //System.out.println(dbUsers.getUsers().get(0).getNickname());

        start(dbUsers);


//        System.out.println("����������: ������� 1\n" +
//                           "��� ������: ������� 0"  );
//        menuIndex = scan.nextInt();
//        if(menuIndex == 1){
//            start(dbUsers);
//        }
//        else if(menuIndex == 0){
//            saveData(dbUsers, "usersdatabase.bin" );
//        }
        saveData(dbUsers, "usersdatabase.txt" );
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
                S.next();
                System.out.println("������� ������: ");
                S.next();
                String password1 = S.nextLine();

                if(dbUsers.register(nickname1,password1)){
                   System.out.println("����� ������������ ������� ��������. ");
                }
                start(dbUsers);
                break;
            case 3:
                saveData(dbUsers, "usersdatabase.txt" );
                System.out.println("����� �� ���������.");
                break;

        }



    }

    public static void saveData(RegistrationSystem dbUsers, String usersFile){
//        try(FileOutputStream fileOutputStream  = new FileOutputStream("usersdatabase.txt");
//            ObjectOutputStream objectOutputStream  = new ObjectOutputStream(fileOutputStream)){
        try(ObjectOutputStream objectOutputStream  = new ObjectOutputStream(
                new FileOutputStream(usersFile))){
            List<User> users = dbUsers.getUsers();
//            for(int i=0; i<users.size(); i++) {
//                objectOutputStream.writeObject(users.get(i));
//            }
            objectOutputStream.writeObject(users);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}