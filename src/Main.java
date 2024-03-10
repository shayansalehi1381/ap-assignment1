import University.Department.*;
import University.User.Admin;
import University.User.Student;
import University.User.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            final Admin admin = new Admin("admin", "123456");
            final MathDepartment mathDepartment = new MathDepartment();
            final ComputerEngDepartment computerEngDepartment = new ComputerEngDepartment();
            final ChemicalEngDepartment chemicalEngDepartment = new ChemicalEngDepartment();
            final ElectricalEngDepartment electricalEngDepartment = new ElectricalEngDepartment();
            final LanguageCenter languageCenter = new LanguageCenter();
            final ReligiousCenter religiousCenter = new ReligiousCenter();
            System.out.println("*** Welcome to Sharif University of Technology! ***");
            Scanner scanner = new Scanner(System.in);
            boolean running = true;
            while (running) {

                System.out.println(
                        "\n1.Login as Student/Admin" +
                                "\n2.Sign_up as Student");
                System.out.println("3.Exit.");
                int input = scanner.nextInt();
                if (input == 1) {
                    login(scanner);
                }
                else if (input == 2) {
                    create_User(scanner);

                }
                else if (input == 3) {
                    running = false;

            }
        }


    }


    static void login(Scanner scanner) {
        while (true) {
            User user = getuser(scanner);
            if (user == null) {
                return;
            }
            getAndCheckPassword(scanner, user);
            userOption(scanner, user);
        }

    }


    static void getAndCheckPassword(Scanner scanner, User user) {
        boolean corroctPass = false;
        while (!corroctPass) {
            System.out.println("type your password:");
            String pass = scanner.next();
            if (user.getPassWord().equals(pass)) {
                System.out.println("login is successfully done!");
                corroctPass = true;
            } else {
                System.out.println("passWord is wrong !");
            }
        }
    }

    static User getuser(Scanner scanner) {
        while (true) {
            User user = null;
            while (user == null) {
                System.out.println("type your username OR Enter 3 to go to the previous part");
                String username = scanner.next();
                user = User.getUserByUsername(username);
                if ("3".equals(username)) {
                    return null;
                }
                if (user == null) {

                    System.out.println("user not found! try again");
                }
            }
            return user;
        }
    }


    static void userOption(Scanner scanner, User user) {
      user.options();
    }


    static String getValidUsername(Scanner scanner) {
        String username = null;
        while (username == null) {
            System.out.println("choose your username:");
            username = scanner.next();
            if (!User.checkUsername(username)) {
                System.out.println("username already exists. try again:");
                username = scanner.next();
            }
        }
        return username;
    }


    static void create_User(Scanner scanner) {
        String username = getValidUsername(scanner);
        System.out.println("choose your password:");
        String password = scanner.next();
        if (password.length() < 6) {
            System.out.println("your password is too short" +
                    "\nIt should contains atleast 6 characters" +
                    "\ntry again:");
            password = scanner.next();
        }
        System.out.println("hello New Student!");
        new Student(username, password);

        System.out.println("created successfully !");
    }

}