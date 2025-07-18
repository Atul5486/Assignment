import java.util.Scanner;
class HalfDiameter{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter diameter :"); //15
   int diameter =inp.nextInt();
   System.out.print("Enter heigth:"); //7
   int height=inp.nextInt();
  double halfDiameter=diameter/2.0;
  float area=(float)(2*Math.PI*halfDiameter*height+2*Math.PI*halfDiameter*halfDiameter);
  System.out.println("Surface Area of cylinder is :"+area);
    }
}
