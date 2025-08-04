import java.util.Scanner;
class Occurance{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=inp.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter "+size+" Elements");
        
        for(int i=0;i<arr.length;i++){
            arr[i]=inp.nextInt();
        }
        boolean visit[]=new boolean[size];
        System.out.println("Occurance of element");
        for(int i=0;i<size;i++){
            if(visit[i])
            continue;
            int count=1;
        for(int j=i+1;j<size;j++){
            if(arr[i]==arr[j]){
            visit[j]=true;
            count++;
        }}
        System.out.println(arr[i]+" => "+count);
        }
        
    }
}
