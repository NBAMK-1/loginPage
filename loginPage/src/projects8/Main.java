package projects8;

import java.util.Scanner;

public class Main {

    public static String name;
    public static String password;
    public static String lName;
    public static String lPassword;
    public static int age ;

    private static int userIn;
    public static int passShow;

    public static void main(String[] args) {
        System.out.println("HEY THERE! WELCOME TO OUR LOGIN PAGE");
        initiate();
    }

    static void initiate() {
        Scanner scn = new Scanner(System.in);
        System.out.println("\n\nLogin or Signup? \n \n If Login Press 1");
        System.out.println("\nIf SignUp Press 2");

        userIn = scn.nextInt();
        if(userIn == 1){
            logIn();
        }else if(userIn == 2){
            signUp();
        }else {
            System.out.println("Sorry ! to say........ Please Enter Correct Option");
        }
        initiate();
    }

    static void logIn() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello Whats your name again?");
        lName = scn.nextLine();
        if(lName.equals(name)){
            System.out.println("Yeh ........ ! you are already in our User");
        }else{
            System.out.println("I dont remember you ! Please  signUp first!");
            initiate();
        }
        System.out.println("Please Enter Your Password! ");
        lPassword = scn.nextLine();
        if(lPassword.equals(password)){
            System.out.println("WonderFull! You are logged in\n");
            System.out.println("Your age is" + age );
            System.out.println("Your Password is :***********");
            System.out.println("\n If your want to see your Password! \n press 1 = yes or press 2 = no");
        }else{
            System.out.println("Your Password is wrong! please enter correct password");
            logIn();
        }
        passShow = scn.nextInt();
        if(passShow == 1){
            System.out.println("Your password is :" + password);
        }else if(passShow == 2){
            System.out.println("Great!");
        }else{
            System.out.println("Please enter correct choice!");
        }
    }

    static void signUp() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Hello there New User! \n Please tell us Your Name");
        name = scn.nextLine();
        System.out.println("For your further security \n Please tell us your password");
        password=scn.nextLine();
        System.out.println("WonderFull  What's your age?");
        age= scn.nextInt();
        System.out.println("\n \n You are now signup! \n Please Login now");
        initiate();
    }
}
