import java.util.Scanner;
class Square{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Length of rectangle:");
        int length=inp.nextInt();
        System.out.print("Enter Breadth of Rectangle:");
        int breadth=inp.nextInt();
        
        if(length==breadth)
        System.out.println("It's A Square");
        else
        System.out.println("It's not A square");
    }
}
