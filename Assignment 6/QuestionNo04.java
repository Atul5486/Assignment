import java.util.Scanner;
class ArrayFind{
    public static void main(String args[]){
    Scanner inp=new Scanner(System.in);
    int arr[]={1,2,30,4,50};
    
    System.out.print("Enter a number to find in array : ");
    int num=inp.nextInt();
    boolean find=false;
    for(int i=0;i<arr.length;i++){
        if(arr[i]==num){
            System.out.println("Number is Matched "+num);
        find=true;
        break;
            
        }
    }
        if(!find){
            System.out.println("Not found");
        }
    }
    }
