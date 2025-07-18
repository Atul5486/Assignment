import java.util.Scanner;
class Pathway{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter height:"); //12
   int height=inp.nextInt();
   System.out.print("Enter height:"); //7.7
  double radius=inp.nextDouble();
  float area=(float)(2*Math.PI*radius*(radius+height));
  System.out.println("Surface Area of cylinder is :"+area);
    }
}
