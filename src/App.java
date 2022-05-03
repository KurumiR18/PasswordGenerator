import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String alp = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num = "1234567890";
        String sym = "!\"#$%&'()-=^~\\|@`[{}]:*+;,<.>?/_";
        String cha = "";
        String psw = "";
        int useAlp;
        int useNum;
        int useSym;
        int len;
        int index;
        int pwdLen;

        System.out.println("--------------------");
        System.out.print("Type password length:");
        pwdLen = scan.nextInt();
        System.out.println("--------------------");

        System.out.println("Set regulation");
        System.out.println("False : 0   True : 1");
        System.out.println("--------------------");

        System.out.print("alphabet:");
        useAlp = scan.nextInt();
        System.out.print("Number:");
        useNum = scan.nextInt();
        System.out.print("Symbol:");
        useSym = scan.nextInt();
        System.out.println("--------------------");

        if(useAlp == 1){
            cha += alp;
        }
        if(useNum == 1){
            cha += num;
        }
        if(useSym == 1){
            cha += sym;
        }

        len = cha.length();

        for(int i = 0; i < pwdLen; i++) {
            index = rand.nextInt(len);
            psw += cha.substring(index - 1, index);
        }

        System.out.println("Your password is:" + psw);
        System.out.println("--------------------");
        scan.close();
    }
}
