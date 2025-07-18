mport java.util.Scanner;
class Garden{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter slength:"); //22
       int sLength=inp.nextInt();
       System.out.print("Enter sBreadth:"); //15
       int sBreadth=inp.nextInt();
       System.out.print("Enter slength:"); //21
       int rSide=inp.nextInt();
       
       int rGardenArea=rSide*rSide;
       int sGardenArea=sLength*sBreadth;
       int diff=rGardenArea-sGardenArea;
       
       System.out.println("Area of Rachel Garden is :"+rGardenArea);
       System.out.println("Area of shelly Garden is :"+sGardenArea);
       System.out.println("Difference between Rachel and shelly Garden area is :"+diff);
    }
}
