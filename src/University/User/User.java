package University.User;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class User {
    public Scanner scanner = new Scanner(System.in);
    static ArrayList<User> users = new ArrayList<>();
    //for students usernames are StudentIDs and for Admin username is"Admin".
    private String userName;
    private String PassWord;
    public User(String name , String passWord){
        this.userName = name;
        this.PassWord = passWord;
        addUser(this);

    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        userName = name;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }


    static void addUser(User user) {
        for (User u : users) {
            if (u.userName.equals(user.userName)) {
                return;
            }
        }

        users.add(user);
    }




    public static User getUserByUsername(String username) {
        for (User u : users) {
            if (u.userName.equals(username)) {
                return u;
            }
        }
        return null;
    }


    public static boolean checkUsername(String username) {
        for (User u : users) {
            if (u.userName.equals(username)) {
                return false;
            }
        }
        return true;
    }


   public abstract void options() ;
    public String toString(){
        return this.getName();
    }
}
