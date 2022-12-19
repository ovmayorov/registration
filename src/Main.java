import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        start();


    }


    public static void start() {
        //•	Должно быть 3 пункта меню. Авторизация, регистрация, выход из программы.
        System.out.println("Авторизируйтесь или зарегистрируйтесь:");
        System.out.println("Введите:");
        System.out.println("1  - Для Авторизации");
        System.out.println("2  - Для Регистрации");
        System.out.println("3  - Для Выхода из программы");
        Scanner S = new Scanner(System.in);
        int choice;
        choice = S.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Вход в систему");
                System.out.println("Введите логин: ");
                System.out.println("Введите пароль: ");
                break;
            case 2:
                System.out.println("Регистрация нового пользователя");
                System.out.println("Введите логин: ");
                System.out.println("Введите пароль: ");
                break;
            case 3:
                System.out.println("Выход из программы.");
        }
    }

}