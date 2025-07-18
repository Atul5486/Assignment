import java.util.Scanner;
class Tile{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter Length :"); //7
        int length=inp.nextInt();
        System.out.print("Enter Breadth:"); //13
        int breadth=inp.nextInt();
        int areaOfTile=length*breadth;
        System.out.print("Enter Length of Rectangle:"); //520
        int rectLength=inp.nextInt();
        System.out.print("Enter Breadth of rectangle:"); //140
        int rectBreadth=inp.nextInt();
        int rectArea=rectLength * rectBreadth;
        int totalTile=rectArea/areaOfTile;
        System.out.println("Total Area: "+rectArea);
        System.out.println("Area of tile: "+areaOfTile);
        System.out.println("Total Number of Tiles Needed: "+totalTile);
    }
}
