import java.util.Scanner;
class Delete{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=inp.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" Elements");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=inp.nextInt();
        }
        System.out.print("Enter  element to delete : ");
        int elem=inp.nextInt();
        int index = -1;
        for(int i=0;i<size;i++){
            if(arr[i]==elem)
            index=i;
            break;
        }
        if(index==-1){
            System.out.println("Element not found");
        }else{
            
        for(int i=index;i<size-1;i++){
         arr[i] = arr[i + 1];
        }
         size--;
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        }
    }
}
