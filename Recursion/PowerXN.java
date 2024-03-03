package Recursion;

public class PowerXN {
    public static void main(String[] args) {
        int x=2;
        int n=10;
       int ans= pow(x,n);
        System.out.println(ans);
    }
    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        int fnm1=pow(x,n-1);
        int ans=fnm1*x;
        return ans;
    }
}

