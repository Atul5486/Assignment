import java.util.Scanner;
class Park{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Length:"); //20
        int length=inp.nextInt();
        System.out.print("Enter Rate:"); //25
        int rate=inp.nextInt();
        System.out.print("Enter Total :"); //1600
        int total=inp.nextInt();
        float area=(float)(total/rate);
        float breadth=(float)(area/length);
        float perimeter=(float)(2*(length+breadth));
        System.out.println("Breadth of Park in meter is : "+breadth);
        System.out.println("Perimeter of Park is : "+perimeter);
        System.out.println("Area of Park in meter square is : "+area);
    }
}
