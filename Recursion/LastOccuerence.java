package Recursion;

public class LastOccuerence {
    public static void main(String[] args) {
        int arr[]={5,2,5,6};
        int target=5;
        int i=0;
        int ans=check(arr,target,i);
        System.out.println(ans);
    }
    public  static int check(int arr[],int target,int index){
        if(index==arr.length){
            return -1;
        }
        int isFound=check(arr,target,index+1);
        if(isFound==-1 && arr[index]==target){
            return index;
        }

        return isFound;
    }
}
