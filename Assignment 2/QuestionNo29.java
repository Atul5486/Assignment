import java.util.Scanner;
class FloorTile{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length of floor:"); //800
        int len=inp.nextInt();
        System.out.print("Enter wide of floor:"); //900
        int wide=inp.nextInt();
      int floorArea=len*wide;
      System.out.println("Area of floor :"+floorArea);
      System.out.print("Enter length :"); //10
      int tileSide=inp.nextInt();
      int tileArea=tileSide*tileSide;
       
      int totalTiles=floorArea/tileArea;
      System.out.println("Total no of tiles required :"+totalTiles);
      
    }
}
