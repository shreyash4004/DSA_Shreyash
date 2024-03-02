package Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        int no=5;
        sum(no);
        int ans=sum(no);
        System.out.println(ans);
    }
    public static int  sum(int no){

        if(no==1){
            return 1;
        }
        int call=sum(no-1);
        int sum=no+call;
        return sum;
    }
}
