package Recursion;
public class PrintNumbersIncreasing {

    public static void main(String[] args) {
        int no=5;
        Print(no);
    }
    public  static void Print(int no){
        if(no==1){
            System.out.println(no);
            return;
        }
        Print(no-1);
        System.out.println(no);
    }
}

