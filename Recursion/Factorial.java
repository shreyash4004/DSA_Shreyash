package Recursion;

import java.sql.SQLOutput;

public class Factorial {
    public static void main(String[] args) {
        int no=5;
        int ans=fact(no);
        //ok now
        //hello now
        System.out.println(ans);
    }


    public  static  int fact(int no){
        if(no==0){
            return 1;
        }

        fact(no-1);
        int fact=no*fact(no-1);
        return fact;
    }
}
