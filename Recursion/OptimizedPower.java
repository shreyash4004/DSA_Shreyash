package Recursion;

public class OptimizedPower {
    public static void main(String[] args) {
        int x=2;
        int n=10;
        int ans=power(x,n);
        System.out.println(ans);

    }
    public static  int power(int x,int n){
        if(n==0){
            return 1;
        }
        int half=power(x,n/2);
        int squarehalf=half*half;

        if(n%2!=0){
            squarehalf=x*squarehalf;
        }
        return squarehalf;
    }
}
