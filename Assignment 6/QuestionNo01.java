import java.util.Scanner;
class Array{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter length of array : ");
        int len=inp.nextInt();
        int arr[]=new int[len];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter "+(i+1)+" element :");
            arr[i]=inp.nextInt();
        }
            System.out.print("Elements are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
}
