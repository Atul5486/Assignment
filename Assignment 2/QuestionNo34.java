import java.util.Scanner;
class Trapezoid{
    public static void main(String[] args) {
   Scanner inp=new Scanner(System.in);
   System.out.print("Enter Base of trapezoid:"); //128
   int base1=inp.nextInt();
   System.out.print("Enter Base of trapezoid:"); //92
   int base2=inp.nextInt();
   System.out.print("Enter Base of trapezoid:"); //40
   int height=inp.nextInt();
   float areaOfTrapezoid=(float)((base1+base2)*height)/2;
   System.out.print("Enter Width of walk Away:"); //4
   int widthWalkAway =inp.nextInt();
   int lenWalkAway=height,walkAwayArea=lenWalkAway*widthWalkAway;
   float woodArea=(float)(areaOfTrapezoid-walkAwayArea);
   
    System.out.println("Area of Trapezoid:"+areaOfTrapezoid);
    System.out.println("Area of WalkAway:"+walkAwayArea);
    System.out.println("Area of wood:"+woodArea);
    }
}
