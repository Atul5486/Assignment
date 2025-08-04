import java.util.Scanner;
class Insert{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=inp.nextInt();
        int arr[]=new int[size+1];
        System.out.println("Enter "+size+" Elements");
        
        for(int i=0;i<arr.length-1;i++){
            arr[i]=inp.nextInt();
        }
        System.out.print("Enter a element to insert : ");
        int elem=inp.nextInt();
        System.out.print("Enter position to insert element : ");
        int pos=inp.nextInt();
        for(int i=size;i>=pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos-1]=elem;
            System.out.println("Array after inserting given element");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            
        }
    }
}
