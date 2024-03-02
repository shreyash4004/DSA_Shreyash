package Recursion;

public class FiboUsingRecu {
    public static void main(String[] args) {
        int no=10;
        int ans=fibo(no);
        System.out.println(ans);

    }
    public  static  int fibo(int no){
        if(no==1 || no==0){
            return no;

        }
        int fibo1=fibo(no-1);
        int fibo2=fibo(no-2);
        int ans=fibo1+fibo2;
        return ans;

    }
}
