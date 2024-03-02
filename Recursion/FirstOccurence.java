package Recursion;
public class FirstOccurence {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,3};
        int target=3;
        int i=0;
       int ans= find(arr,target,i);
        System.out.println(ans);
    }
    public  static  int find(int arr[],int target,int index){
        if(arr[index]==target){
            return index;
        }
        if(index>arr.length-1){
            return -1;
        }
         return  find(arr,target,index+1);
    }
}
