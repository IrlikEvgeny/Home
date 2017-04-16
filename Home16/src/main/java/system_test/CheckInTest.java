package system_test;

import java.util.Scanner;

/**
 * Created by docca on 16.04.2017.
 */
public class CheckInTest {
    private static int checkInPass;
    private static String checkInName;
    static Scanner scanner=new Scanner(System.in);
    static AnswerTest answerTest=new AnswerTest();

    public static void main(String[] args) {

        CheckIn checkIn=new CheckIn();
        String[] basaName=checkIn.getCheckInName();
        int id=checkIn.getId();
        for(;;) {
            switch (checkIn.RegistrationOrSignIn()) {
                case 1:
                    for (int i=0;i<=id;i++) {
                        basaName=checkIn.getCheckInName();
                        System.out.println("Введите имя");
                        checkInName = scanner.next();
                        System.out.println("Введите пароль");
                        checkInPass = scanner.nextInt();
                        checkIn.setCheckInPassAndCheckInName(checkInPass, checkInName);
                        if(checkInName.equals(basaName[i])){}
                        else break;
                    }
                    break;
                case 2:
                    for(;;) {
                        System.out.println("Введите имя");
                        checkInName = scanner.next();
                        System.out.println("Введите пароль");
                        checkInPass = scanner.nextInt();
                        if (checkIn.SingIn(checkInName, checkInPass) <= 99) {
                            answerTest.ResultTest();
                        }
                        else if(checkIn.SingIn(checkInName, checkInPass) == 100) {}

                        else
                            break;
                    }

                    break;
                default:
                    break;
            }
        }
    }
}
