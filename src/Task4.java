import java.util.List;
import java.util.Scanner;

/**
 *
 */
public class Task4 {
    public static void main(String[] args) {
        run();
    }


    public static boolean isLoginValid(String login) {
        List<String> symbolList = List.of("a", "b", "c", "d", "e", "0", "1", "_");
        for(String c : login.split("")){
            if(!symbolList.contains(c)){
                System.out.println("login not correct");
                return false;
            }
        }
        return true;
    }
    public static boolean isLoginValid2(String login){
        return !login.matches("[abcde01_]");
    }
    public static boolean isPassValid(String password){
        try {
            Integer.parseInt(password);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        /**
         * !password.matches("\\d")
         */
    }
    public static String prompt(String msg){
        System.out.println(msg);
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
    public static void run(){
        String login = prompt("Введите логин (только a,b,c,d,e,0,1,_):");
        String password = prompt("Введите пароль (только цифры): ");
        String confirm = prompt("Повторите пароль: ");
        if (!isLoginValid(login)){
            System.out.println("Login not valid");
        }
        if (!isPassValid(password)){
            System.out.println("Password ont valid");
        }
        if (!password.equals(confirm)){
            throw new RuntimeException("Password not correct");
        }
        System.out.println("");
    }

}
