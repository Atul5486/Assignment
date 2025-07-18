import java.util.Scanner;
class Diagonal {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Qua:"); //46
        int qua=inp.nextInt();
        int area;
        System.out.print("Enter 1 vertices :");  //13
        int ver1=inp.nextInt();
         System.out.print("Enter 2 vertices :");  //10
        int ver2=inp.nextInt();
        int sumOfHeight=ver1+ver2;
        System.out.println("Sum of Height :"+sumOfHeight);
        double areaOfField =(double)(0.5*qua*sumOfHeight);
        System.out.println("Area Of Field is : "+areaOfField);
    }
}
