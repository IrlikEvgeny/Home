package system_test;

import java.util.Scanner;

/**
 * Created by docca on 16.04.2017.
 */
public class CheckIn {
    private static int a=100;
    private static int id=0;
    private static int[] checkInPass=new int[a];
    private static String[] checkInName=new String[a];
    Scanner scanner=new Scanner(System.in);

    public static int getId() {
        return id;
    }

    public static String[] getCheckInName() {
        return checkInName;
    }

    public static void setCheckInPassAndCheckInName(int checkInPass, String checkInName) {
        CheckIn.checkInPass[id] = checkInPass;
        CheckIn.checkInName[id] = checkInName;
        id+=1;
    }

    public int RegistrationOrSignIn(){
        Scanner scanner=new Scanner(System.in);
        for(;;) {
            System.out.println("Зарегистрироваться(1) или войти(2)");
            int a=scanner.nextInt();
            if (a == 1) {
                return 1;
            } else if (a == 2) {
                return 2;
            } else {
                System.out.println("Введено неизвестное значение. Попробуйте снова.");
            }
        }
    }

    public int SingIn(String checkInNameTest, int checkInPassTest){
        for (int i=0;i<id;i++) {
            if (checkInName[i].equals(checkInNameTest) && checkInPass[i] == checkInPassTest) {
                return i;
            }
            else{}
        }
        return 100;
    }


}
