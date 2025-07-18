import java.util.Scanner;
class PriceOfBricks{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length of Bricks:"); //25
       int lenB=inp.nextInt();
       System.out.print("Enter Breadth of Bricks:"); //10
       int wideB=inp.nextInt();
       System.out.print("Enter Thickness of bricks:"); //7.5
      double thickB=inp.nextDouble();
      
      System.out.print("Enter length of wall:"); //20
       int len=inp.nextInt();
       System.out.print("Enter Breadth of wall:"); //2
       int high=inp.nextInt();
       System.out.print("Enter Thickness of wall:"); //0.75
      double thick=inp.nextDouble();
      int lenW=len*100,highW=high*100;
      double thickW=thick*100;
      float volumeW=(float)(lenW*highW*thickW);
      float volumeB=(float)(lenB*wideB*thickB);
      
      float totalBrick=(float)(volumeW/volumeB);
      System.out.println("Total Number of Bricks :"+totalBrick);
      int price=900;
      float totalPriceOfBricks=(float)(price*totalBrick/1000);
      System.out.println("Price of Total Bricks :"+totalPriceOfBricks);
    }
}
