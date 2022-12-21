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
        System.out.println("Работа программы завершена.");



    }


    public static void start(RegistrationSystem dbUsers) {
        //•	Должно быть 3 пункта меню. Авторизация, регистрация, выход из программы.
        Scanner S = new Scanner(System.in);
        int choice;
        String nickname1 = "";
        String password1 = "";
        System.out.println("Авторизируйтесь или зарегистрируйтесь:");
        System.out.println("Введите:");
        System.out.println("1  - Для Авторизации");
        System.out.println("2  - Для Регистрации");
        System.out.println("3  - Для Выхода из программы");

        choice = S.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Вход в систему");
                System.out.println("Введите логин: ");
                nickname1 = S.next();
                System.out.println("Введите пароль: ");
                password1 = S.next();
                System.out.println("Пользователь "+dbUsers.login(nickname1,password1)+" авторизовался успешно.");
                start(dbUsers);
                break;
            case 2:
                System.out.println("Регистрация нового пользователя");
                System.out.println("Введите логин: ");
                nickname1 = S.next();
                System.out.println("Введите пароль: ");
                password1 = S.next();
                System.out.println("Вы ввели: "+nickname1 +" "+password1);
                if(dbUsers.register(nickname1,password1)){
                   System.out.println("Новый пользователь успешно добавлен. ");
                }
                start(dbUsers);
                break;
            case 3:
                //saveData(dbUsers.getUsers(), "usersdatabase.txt" );
                dbUsers.saveData();
                System.out.println("Выход из программы.");
                break;
        }
    }


}