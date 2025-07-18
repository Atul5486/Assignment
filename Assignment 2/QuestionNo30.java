import java.util.Scanner;
class BedRoom{
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
       System.out.print("Enter length of floor:"); //200
        int len=inp.nextInt();
        System.out.print("Enter wide of floor:"); //400
        int wide=inp.nextInt();
      int floorArea=len*wide;
      System.out.println("Area of floor :"+floorArea);
      
      System.out.print("Enter length :"); //5
      int tileLen=inp.nextInt();
      System.out.print("Enter Breadth :"); //8
      int tileBre=inp.nextInt();
    int tileArea=tileLen*tileBre;
      int totalTiles=floorArea/tileArea;
      System.out.println("Total no of tiles required :"+totalTiles);
      
    }
}
