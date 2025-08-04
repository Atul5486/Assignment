import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        int arr[]={10,20,30,40,50};
        System.out.print("Enter a number to find in array : ");
        int find=inp.nextInt();
        int high=arr.length-1,low=0;
        boolean found=false;
        while(low<=high){
           int mid=(low+high)/2;
            if(arr[mid]==find){
            System.out.println(find + " found at index " + mid);
                found = true;
            break;
            }
            else if(find > arr[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        if (!found) {
            System.out.println(find + " not found in the array.");
        }
    }
}
