import java.util.Scanner;
class ArraySum{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len=inp.nextInt();
        int arr[]=new int[len];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" element :");
            arr[i]=inp.nextInt();
        }
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
        }
        System.out.println("Sum of array elements are : "+sum);
    }
}
