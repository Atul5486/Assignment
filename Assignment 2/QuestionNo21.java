import java.util.Scanner;
class WallAndBrick{
    public static void main(String args[]){
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter length:"); //15
        int length=inp.nextInt();
        System.out.print("Enter breadth:"); //8
        int breadth=inp.nextInt();
        System.out.print("Enter heigth:"); //5
        int height=inp.nextInt();
 
        System.out.print("Enter Length of wall :"); //15
        int wallL=inp.nextInt();
        System.out.print("Enter Heigth of wall :"); //10
        int wallH=inp.nextInt();
        System.out.print("Enter breadth of wall :"); //8
        int wallB=inp.nextInt();
        int wallLength=wallL*100,wallHeight=wallH*100,wallBreadth=wallB*100;
        int volumeOfWall=wallLength*wallHeight*wallBreadth;
        int volumeOfBrick=length*height*breadth;
        int numberofBricks=volumeOfWall/volumeOfBrick;
        System.out.println(volumeOfWall);
        System.out.println(volumeOfBrick);
        System.out.println(numberofBricks);
    }
}
