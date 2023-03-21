import java.util.Scanner;

public class binarySearch {

    public static int binary_Search(int arr[],int key) {
        
        int Start=0, end=arr.length-1;

        while(Start<=end){
            
            int mid = (Start+end)/2;
            
            if(key == mid){
                return mid;
            }
            if(key>mid){
                Start++;
            }
            if(key<mid){
                end--;
            }

        }
        return -1;
    }

    
    public static void main(String[] args) {
        
        // Random number array for Searching0
        int arr[]={2,3,4,5,6,7,8,10,23};
        
        Scanner sc=new Scanner(System.in);
       
        // input number for Search
        int key =sc.nextInt();
       
        int found =  binary_Search(arr,key);
        if(found == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found ");
        }
        sc.close();
    }
}
