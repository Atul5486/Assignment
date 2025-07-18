import java.util.Scanner;
class RightAngleTriangle{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Height:"); //13
        int h=inp.nextInt();
        System.out.print("Enter Perpendicular:"); //12
       int p=inp.nextInt();
       int l=(int)(Math.sqrt((h*h)-(p*p)));
       double area=(double)(0.5*p*l);
       System.out.println("Length of Triangle: "+l);
       System.out.println("Area of right Angle Triangle:"+area);
    }
}
