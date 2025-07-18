import java.util.Scanner;
class Triangle{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter first Angle:");
        int angle1=inp.nextInt();
        System.out.print("Enter second Angle:");
        int angle2=inp.nextInt();
        System.out.print("Enter third Angle:");
        int angle3=inp.nextInt();
        int sum=180;
        int sideSum=angle1+angle2+angle3;
        if(sideSum==sum)
        System.out.println("This is a valid triangle");
        else
        System.out.println("This is not a valid triangle");
        
    }
}
