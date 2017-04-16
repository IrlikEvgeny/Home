package system_test;

import java.util.Scanner;

/**
 * Created by docca on 16.04.2017.
 */
public class AnswerTest implements Test{
    public String[] answerTest=new String[7];
    public int result=0;
    Scanner scanner=new Scanner(System.in);
    public void ResultTest(){
        for(int i=0;i<=6;i++) {
            System.out.println(question[i]);
            System.out.println(answerA[i]);
            System.out.println(answerB[i]);
            System.out.println(answerC[i]);
            answerTest[i]=scanner.next();
            if(answerTrue[i].startsWith(answerTest[i])){
                ++result;
            }
        }
        System.out.println(result+"/7");
    }
}
